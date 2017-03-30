package com.ian.ssm.service.impl;

import com.ian.ssm.entity.SsmUser;
import com.ian.ssm.service.ISsmUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by chenlong on 2017/3/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class SsmUserServiceImplTest {

    @Resource
    private ISsmUserService userService;

    @Test
    public void addUser() throws Exception {
        SsmUser ssmUser = new SsmUser();
        ssmUser.setCodSex(1);
        ssmUser.setTxtName("zhangsan");
        ssmUser.setDatBirthday(new Date());
        userService.addUser(ssmUser);
    }

    @Test
    public void selectUser() throws Exception {
        SsmUser ssmUser = new SsmUser();
        ssmUser.setTxtName("zhangsan");
        ssmUser = userService.selectUser(ssmUser);
        System.out.print(ssmUser);
    }
}
