package com.ethan.java.spring.cards.dao.order;

import com.ethan.java.spring.cards.dao.BaseDao;
import com.ethan.java.spring.cards.model.order.Order;

public interface OrderDao extends BaseDao<Order> {
	public Order findByCustomer(int customerId);
}
