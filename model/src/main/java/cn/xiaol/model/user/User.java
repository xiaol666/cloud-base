package cn.xiaol.model.user;


import cn.xiaol.model.base.DataEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class User extends DataEntity<User> {



    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
