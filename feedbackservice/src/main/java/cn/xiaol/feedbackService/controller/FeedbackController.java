package cn.xiaol.feedbackService.controller;


import cn.xiaol.common.model.ResponseModel;
import cn.xiaol.feignProvider.provider.UserProvider;
import cn.xiaol.feignProvider.provider.VisitLogProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackController {

    @Autowired
    UserProvider userProvider;

    @Autowired
    VisitLogProvider visitLogProvider;

    @GetMapping("/feedback")
    public String feedback(){
        //return null;
        return userProvider.ask();
    }

    /**
     * 查看访问日志列表
     * @return
     */
    @GetMapping("/lookVisitLogList")
    public ResponseModel lookVisitLogList(){
        //return null;
        return visitLogProvider.list();
    }
}
