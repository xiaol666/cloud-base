package cn.xiaol.feignProvider.hystrix;


import cn.xiaol.feignProvider.provider.UserProvider;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallbackFactory implements FallbackFactory<UserProvider> {

    @Override
    public UserProvider create(Throwable throwable) {
        return () -> "服务挂掉了";
    }

}
