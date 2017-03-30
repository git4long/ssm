package com.ian.ssm.service;

import com.ian.ssm.entity.SsmUser;

/**
 * 用户信息业务层接口
 * Created by chenlong on 2017/3/30.
 */
public interface ISsmUserService {

    /**
     * 添加用户信息
     * @param ssmUser
     */
    public void addUser(SsmUser ssmUser);

    /**
     * 查询用户信息
     * @param ssmUser
     * @return
     */
    public SsmUser selectUser(SsmUser ssmUser);
}
