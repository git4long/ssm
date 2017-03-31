package com.ian.ssm.service.impl;

import com.ian.ssm.mapper.SysUserMapper;
import com.ian.ssm.entity.SysUser;
import com.ian.ssm.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Resource
	private SysUserMapper sysUserMapper;

	@Override
	public SysUser getById(Long id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}
}
