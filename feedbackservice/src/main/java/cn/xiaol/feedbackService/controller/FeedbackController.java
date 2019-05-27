package cn.xiaol.feedbackService.controller;


import cn.xiaol.feignProvider.provider.UserProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackController {

    @Autowired
    UserProvider userProvider;

    @GetMapping("/feedback")
    public String feedback(){
        //return null;
        return userProvider.home();
    }

}
