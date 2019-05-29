package cn.xiaol.userService.controller;


import cn.xiaol.common.model.ResponseModel;
import cn.xiaol.userService.service.VisitLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visitLog")
/*@Api(value="接口访问日志模块",tags = "接口访问日志模块")*/
public class VisitLogController {

    @Autowired
    VisitLogService visitLogService;


    /*@ApiImplicitParams({
            @ApiImplicitParam(name="mailMap", value="邮件信息", dataType = "map", required=true, paramType="query"),
    })*/
    @ApiOperation(value="接口访问日志列表", notes="接口访问日志列表接口",produces = "application/json")
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ResponseModel list() {
        ResponseModel ret = ResponseModel.getSuccessResponseModel();
        try {
            ret.setData(visitLogService.selectList(null));
        } catch (Exception e) {
            ret = ResponseModel.getFailedResponseModel().setMessage(e.getMessage());
        }
        return ret;
    }

}
