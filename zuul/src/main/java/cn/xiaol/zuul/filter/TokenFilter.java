package cn.xiaol.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class TokenFilter extends ZuulFilter {
    private Logger logger = LoggerFactory.getLogger(TokenFilter.class);
    /*
     pre：路由之前
     routing：路由之时
     post： 路由之后
     error：发送错误调用
     */
    @Override
    public String filterType() {
        return "pre";
    }
    /*
      优先级
      优先级默认为0，数字越大，优先级越低
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    // 判断上一个过滤器结果为true，否则就不走下面过滤器，直接跳过后面的所有过滤器并返回 上一个过滤器不通过的结果。
    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        if(ctx.get("isSuccess") == null) {
            return true;
        }
        return (boolean)ctx.get("isSuccess");
    }

    @Override
    public Object run() {

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info("--->>> TokenFilter {},{}", request.getMethod(), request.getRequestURL().toString());
        String token = request.getParameter("token");// 获取请求的参数
        if (StringUtils.isNotBlank(token)) {
            ctx.setSendZuulResponse(true); //对请求进行路由
            ctx.setResponseStatusCode(200);
            ctx.set("isSuccess", true);
            return null;
        } else {
            ctx.setSendZuulResponse(false); //不对其进行路由
            ctx.setResponseStatusCode(400);
            ctx.setResponseBody("token is empty");
            ctx.set("isSuccess", false);
            return null;
        }
    }
}
