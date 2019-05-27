package cn.xiaol.feignProvider.provider;


import cn.xiaol.feignProvider.hystrix.HystrixClientFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="user-service",fallbackFactory = HystrixClientFallbackFactory.class)
public interface UserProvider {

    @GetMapping("/")
    String home();

}
