package com.ethan.java.spring.cards.util.hibernate;

import com.ethan.java.spring.cards.model.Sex;

public class SexType extends EnumType<Sex> {
	public SexType() {
		super(Sex.class);
	}
}
