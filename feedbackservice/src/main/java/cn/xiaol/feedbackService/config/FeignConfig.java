package cn.xiaol.feedbackService.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "cn.xiaol.feignProvider.provider")
public class FeignConfig {

}
