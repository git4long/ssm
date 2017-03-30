package com.ian.ssm.dao;

import com.ian.ssm.entity.SsmUser;
import org.springframework.stereotype.Repository;

/**
 * 用户信息持久化接口
 * Created by chenlong on 2017/3/30.
 */
@Repository
public interface ISsmUserDao {

    /**
     * 添加用户信息
     * @param ssmUser
     */
    void addUser(SsmUser ssmUser);

    /**
     * 查询用户信息
     * @param ssmUser
     * @return
     */
    SsmUser selectUser(SsmUser ssmUser);
}
