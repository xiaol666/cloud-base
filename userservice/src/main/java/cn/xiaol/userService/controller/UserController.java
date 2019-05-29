package cn.xiaol.userService.controller;


import cn.xiaol.common.model.ResponseModel;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
/*@Api(value="用户模块",tags = "用户模块")*/
public class UserController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/ask",method = RequestMethod.GET)
    public String ask() {
        System.out.println("user-service " + port +" 被访问");
        return "Hello world " + port;
    }


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResponseModel login() {
        ResponseModel ret = ResponseModel.getSuccessResponseModel();
        return ret;
    }
}
