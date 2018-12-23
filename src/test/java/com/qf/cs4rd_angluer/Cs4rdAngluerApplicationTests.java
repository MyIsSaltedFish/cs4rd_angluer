package com.qf.cs4rd_angluer;

import com.qf.cs4rd_angluer.entity.Province;
import com.qf.cs4rd_angluer.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Cs4rdAngluerApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    public void contextLoads() {
        List<Province> list = userService.findAllPro();
        for (Province province : list) {
            System.out.println(province.getPname());
        }
    }

}
