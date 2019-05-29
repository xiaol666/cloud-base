package cn.xiaol.userService.service.impl;

import cn.xiaol.model.user.VisitLog;
import cn.xiaol.userService.dao.VisitLogMapper;
import cn.xiaol.userService.service.VisitLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* 接口访问日志 ServiceImpl层
* @author iutils.cn
* @version 1.0
*/
@Service
@Transactional(rollbackFor = {Exception.class})
public class VisitLogServiceImpl extends ServiceImpl<VisitLogMapper,VisitLog> implements VisitLogService {

}
