package com.hsbc;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.hsbc.config.MappingGeneratorOracle;
import com.hsbc.controller.HostController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Mem3ApplicationTests {

    @Autowired
    private HostController hostController;

    @Test
    void contextLoads() {
    }

    //mybatis-plus逆向工程
    @Test
    public void testMappingGeneratorOracle() {
        MappingGeneratorOracle.autoGenerator().execute();

    }

    @Test
    public void testHost(){
        System.out.println(hostController.showHosts());
    }

}
