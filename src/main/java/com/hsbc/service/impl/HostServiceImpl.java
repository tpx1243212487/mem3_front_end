package com.hsbc.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hsbc.entity.Host;
import com.hsbc.mapper.HostMapper;
import com.hsbc.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stephen
 * @since 2021-11-14
 */
@Service
public class HostServiceImpl implements HostService {
    @Autowired(required = false)
    private HostMapper hostMapper;

    public List<Host> selectAll() {
        Wrapper<Host> queryWrapper = new QueryWrapper();
        List<Host> list = hostMapper.selectList(queryWrapper);
        return list;
    }
}
