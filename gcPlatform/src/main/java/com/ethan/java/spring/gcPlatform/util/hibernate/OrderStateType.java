package com.ethan.java.spring.gcPlatform.util.hibernate;

import com.ethan.java.spring.gcPlatform.model.OrderState;

public class OrderStateType extends EnumType<OrderState> {
	
	public OrderStateType() {
		super(OrderState.class);
	}

}
