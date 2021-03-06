package com.atguigu.jf.console.login.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.jf.console.baseapi.user.SysFuncMapper;
import com.atguigu.jf.console.baseapi.user.SysOpMapper;
import com.atguigu.jf.console.login.service.LoginService;
import com.atguigu.jf.console.user.bean.bo.SysFuncBean;
import com.atguigu.jf.console.user.bean.pojo.SysOp;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private SysOpMapper sysOpMapper;
	@Autowired
	private SysFuncMapper sysFuncMapper;
	
	
	@Override
	public SysOp selectSysOpByUnameAndPwd(SysOp sysOp) throws Exception {
		return sysOpMapper.selectSysOpByUnameAndPwd(sysOp);
	}

	@Override
	public List<SysFuncBean> getMenuByOpId(Map<String, Object> map) throws Exception{
		return sysFuncMapper.getMenuByOpId(map);
	}


}
