package com.ethan.java.spring.cards.dao.user;

import com.ethan.java.spring.cards.dao.BaseDao;
import com.ethan.java.spring.cards.model.user.Customer;

public interface CustomerDao extends BaseDao<Customer> {
	public Customer login(String username, String password);
	public boolean isUnique(String username);
}