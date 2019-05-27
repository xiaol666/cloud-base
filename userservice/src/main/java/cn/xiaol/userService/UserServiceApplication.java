package cn.xiaol.userService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class UserServiceApplication {

    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home() {
        System.out.println("user-service " + port +" 被访问");
        return "Hello world " + port;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
