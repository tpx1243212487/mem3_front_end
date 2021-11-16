package com.hsbc.service;

import com.hsbc.entity.Host;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stephen
 * @since 2021-11-14
 */
public interface HostService {

    public List<Host> selectAll();
}
