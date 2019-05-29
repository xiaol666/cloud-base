package cn.xiaol.userService.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "cn.xiaol.feignProvider.provider")
public class FeignConfig {

}
