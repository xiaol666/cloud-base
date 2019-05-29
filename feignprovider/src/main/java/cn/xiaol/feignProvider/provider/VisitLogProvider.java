package cn.xiaol.feignProvider.provider;

import cn.xiaol.common.model.ResponseModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value="user-service")
public interface VisitLogProvider {

    @PostMapping("/visitLog/list")
    ResponseModel list();

}
