package com.hsbc.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
 * @since 2021-11-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("HOST")
@ApiModel(value="Host对象", description="")
public class Host extends Model<Host> {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private BigDecimal id;

    @TableField("NAME")
    private String name;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
