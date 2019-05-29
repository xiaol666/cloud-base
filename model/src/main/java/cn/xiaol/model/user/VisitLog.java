package cn.xiaol.model.user;

import cn.xiaol.model.base.DataEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 *  第三方系统访问日志
 *  @author xiaol
 */
@TableName("t_visit_log")
@Data
public class VisitLog extends DataEntity<VisitLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 第三方业务系统ID
     */
    @TableField("app_id")
    private String appId;

    /**
     * 所属部门
     */
    @TableField("org_id")
    private String orgId;

    /**
     * 第三方业务系统名
     */
    @TableField("app_name")
    private String appName;

    /**
     * 访问IP
     */
    @TableField("visited_ip")
    private String visitedIp;

    /**
     * 失败日志
     */
    @TableField("failed_log")
    private String failedLog;

    /**
     *  0 失败 1成功
     */
    @TableField("status")
    private Integer status;

    /**
     * 访问时间
     */
    @TableField("visit_time")
    private Date visitTime;

    /**
     * 组ID
     */
    @TableField("group_id")
    private String groupId;

    /**
     * 组名
     */
    @TableField("group_name")
    private String groupName;

    @TableField(exist = false)
    private String orgName;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

