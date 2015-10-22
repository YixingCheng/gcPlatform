package com.ethan.java.spring.gcPlatform.model;


import java.util.ArrayList;
import java.util.List;


/**
 * 订单状态
 * @author Yixing Cheng
 */
public enum OrderState {
	DELIVERED {
		@Override
		public String getName() {
			return "Shipped";
		}
	},
	FINISH {
		@Override
		public String getName() {
			return "Completed";
		}
	},
	CANCLE {
		@Override
		public String getName() {
			return "Cancelled";
		}
	};
	public abstract String getName();

	public static List<String> getValues() {
		List<String> list = new ArrayList<String>();
		for (OrderState orderState : OrderState.values()) {
			list.add(orderState.getName());
		}
		return list;
	}
}
