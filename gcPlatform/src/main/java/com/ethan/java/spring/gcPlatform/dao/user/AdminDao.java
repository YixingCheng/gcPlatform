package com.ethan.java.spring.gcPlatform.dao.user;

import com.ethan.java.spring.gcPlatform.dao.BaseDao;
import com.ethan.java.spring.gcPlatform.model.user.Admin;

public interface AdminDao extends BaseDao<Admin>{
	public Admin login(String username, String password);
	public boolean isUnique(String username);
}
