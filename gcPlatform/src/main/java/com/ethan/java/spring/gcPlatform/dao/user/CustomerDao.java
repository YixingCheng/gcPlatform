package com.ethan.java.spring.gcPlatform.dao.user;

import com.ethan.java.spring.gcPlatform.dao.BaseDao;
import com.ethan.java.spring.gcPlatform.model.user.Customer;

public interface CustomerDao extends BaseDao<Customer>{
	public Customer login(String username, String password);
	public boolean isUnique(String username);
}
