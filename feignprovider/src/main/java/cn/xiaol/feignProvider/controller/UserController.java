package cn.xiaol.feignProvider.controller;

import cn.xiaol.feignProvider.provider.UserProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserProvider userProvider;

    @GetMapping(value = "/hello")
    public String hello() {
        return  userProvider.home();
    }


}
