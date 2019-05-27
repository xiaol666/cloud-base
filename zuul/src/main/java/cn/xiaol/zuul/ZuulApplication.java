package cn.xiaol.zuul;

import cn.xiaol.zuul.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication {

    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

}
