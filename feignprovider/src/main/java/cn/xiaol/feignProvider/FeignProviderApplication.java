package cn.xiaol.feignProvider;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix
public class FeignProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignProviderApplication.class, args);
    }

}
