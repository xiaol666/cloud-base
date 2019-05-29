package cn.xiaol.model.base;

import cn.xiaol.common.utils.UuidUtil;
import com.baomidou.mybatisplus.activerecord.Model;


public abstract class DataEntity<T extends Model> extends BaseEntity<T> {

    public void preInsert() {
        this.id = UuidUtil.get32UUID();
    }

    public void preUpdate() {

    }
}