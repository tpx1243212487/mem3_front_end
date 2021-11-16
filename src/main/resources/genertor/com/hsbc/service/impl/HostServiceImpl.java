package com.hsbc.service.impl;

import com.hsbc.entity.Host;
import com.hsbc.mapper.HostDao;
import com.hsbc.service.HostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stephen
 * @since 2021-11-14
 */
@Service
public class HostServiceImpl extends ServiceImpl<HostDao, Host> implements HostService {

}
