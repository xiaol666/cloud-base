package cn.xiaol.model.base;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

@Data
public abstract class BaseEntity<T extends Model> extends Model<T> {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    public String id;

}
