package com.ethan.java.spring.cards.util.hibernate;

import com.ethan.java.spring.cards.model.PaymentWay;
/**
 * 支付方式Hibernate映射类型
 * @author Yixing Cheng	
 */
public class PaymentWayType extends EnumType<PaymentWay> {
	public PaymentWayType() {
		super(PaymentWay.class);
	}
}