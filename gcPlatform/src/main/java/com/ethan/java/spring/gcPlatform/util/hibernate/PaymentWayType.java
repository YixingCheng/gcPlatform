package com.ethan.java.spring.gcPlatform.util.hibernate;

import com.ethan.java.spring.gcPlatform.model.PaymentWay;


public class PaymentWayType extends EnumType<PaymentWay> {
	public PaymentWayType() {
		super(PaymentWay.class);
	}
}
