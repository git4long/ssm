package com.ian.ssm.service.impl;

import com.ian.ssm.entity.SysUser;
import com.ian.ssm.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

/**
 * Created by chenlong on 2017/3/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class SysUserServiceImplTest {

    @Resource
    private SysUserService sysUserService;

    @Test
    public void getById() throws Exception {
        SysUser sysUser = sysUserService.getById(1L);
        System.out.println("--------------------------------" + sysUser.toString());
    }

}