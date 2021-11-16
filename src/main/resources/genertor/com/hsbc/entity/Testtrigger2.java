package com.hsbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author stephen
 * @since 2021-10-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("TESTTRIGGER2")
@ApiModel(value="Testtrigger2对象", description="")
public class Testtrigger2 extends Model<Testtrigger2> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.NONE)
    private String id;

    @TableField("NUMS")
    private String nums;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
