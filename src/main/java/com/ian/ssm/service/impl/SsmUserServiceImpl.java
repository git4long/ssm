package com.ian.ssm.service.impl;

import com.ian.ssm.dao.ISsmUserDao;
import com.ian.ssm.entity.SsmUser;
import com.ian.ssm.service.ISsmUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created by chenlong on 2017/3/30.
 */
@Service("ssmUserService")
public class SsmUserServiceImpl implements ISsmUserService {

    @Resource
    private ISsmUserDao ssmUserDao;

    /**
     * 添加用户信息
     * @param ssmUser
     */
    public void addUser(SsmUser ssmUser) {
       if (ssmUser == null) {
            return;
       }
       ssmUser.setCodNo(UUID.randomUUID().toString().replaceAll("-", ""));
        ssmUserDao.addUser(ssmUser);
    }

    /**
     * 查询用户信息
     * @param ssmUser
     * @return
     */
    public SsmUser selectUser(SsmUser ssmUser) {
        return ssmUserDao.selectUser(ssmUser);
    }
}
