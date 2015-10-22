package com.ethan.java.spring.gcPlatform.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ethan.java.spring.gcPlatform.dao.DaoSupport;
import com.ethan.java.spring.gcPlatform.model.user.Admin;


@Repository("adminDao")
@Transactional
public class AdminDaoImpl extends DaoSupport<Admin> implements AdminDao{
	
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public Admin login(String username, String password) {
		if(username != null && password != null){//如果用户名和密码不为空
			String where = "where username=? and password=?";//设置查询条件
			Object[] queryParams = {username,password};//设置参数对象数组
			List<Admin> list = find(-1, -1, where, queryParams).getList();//执行查询方法
			if(list != null && list.size() > 0){//如果list集合不为空
				return list.get(0);//返回List中的第一个存储对象
			}
		}
		return null;//返回空值
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public boolean isUnique(String username) {
		Object[] queryParams = {username};//设置参数对象数组
		List list = (List)super.uniqueResult("from User where username = ?", queryParams);
		if(list != null && list.size() > 0){
			return false;
		}
		return true;
	}
}
