package com.ethan.java.spring.cards.util.hibernate;

import com.ethan.java.spring.cards.model.OrderState;
/**
 * 订单状态Hibernate映射类型
 * @author Yixing Cheng
 */
public class OrderStateType extends EnumType<OrderState> {
	public OrderStateType() {
		super(OrderState.class);
	}
}
