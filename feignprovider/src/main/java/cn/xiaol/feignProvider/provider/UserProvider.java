package cn.xiaol.feignProvider.provider;


import cn.xiaol.common.model.ResponseModel;
import cn.xiaol.feignProvider.hystrix.HystrixClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value="user-service",fallbackFactory = HystrixClientFallbackFactory.class)
public interface UserProvider {

    @GetMapping("/user/ask")
    String ask();

    @PostMapping("/user/login")
    ResponseModel login();

}
