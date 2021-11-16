package com.hsbc.controller;


import com.hsbc.entity.Host;
import com.hsbc.service.HostService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author stephen
 * @since 2021-11-14
 */
@RestController
@RequestMapping("/host")
@CrossOrigin(origins = "http://localhost:9528", allowCredentials = "true")
public class HostController {

    @Autowired
    private HostService hostService;

    //host所有信息
    @ApiOperation(value = "host所有信息")
    @GetMapping("showHosts")
    public List<Host> showHosts() {
        List<Host> list = hostService.selectAll();
        return list;
    }
}
