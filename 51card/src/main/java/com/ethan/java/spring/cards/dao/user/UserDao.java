package com.ethan.java.spring.cards.dao.user;

import com.ethan.java.spring.cards.dao.BaseDao;
import com.ethan.java.spring.cards.model.user.User;

public interface UserDao extends BaseDao<User> {
	public User login(String username, String password);
	public boolean isUnique(String username);
}
