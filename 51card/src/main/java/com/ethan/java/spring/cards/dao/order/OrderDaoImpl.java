package com.ethan.java.spring.cards.dao.order;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ethan.java.spring.cards.dao.DaoSupport;
import com.ethan.java.spring.cards.model.order.Order;
@Repository("orderDao")
@Transactional
public class OrderDaoImpl extends DaoSupport<Order> implements OrderDao {


	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public Order findByCustomer(int customerId) {
		String where = "where customer.id = ?";
		Object[] queryParams = {customerId};
		List<Order> list = find(-1, -1, where, queryParams).getList();
		return list.get(0);
	}

}
