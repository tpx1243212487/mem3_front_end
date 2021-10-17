package com.hsbc.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Host {

    @TableId(value = "ID")
    private Integer id;
}
