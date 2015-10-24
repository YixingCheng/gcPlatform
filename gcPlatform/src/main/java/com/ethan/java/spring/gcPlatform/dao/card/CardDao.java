package com.ethan.java.spring.gcPlatform.dao.card;

import java.util.List;

import com.ethan.java.spring.gcPlatform.dao.BaseDao;
import com.ethan.java.spring.gcPlatform.model.card.CardInfo;
import com.ethan.java.spring.gcPlatform.model.card.CardsInfo;

public interface CardDao extends BaseDao<CardInfo> {
	public List<CardInfo> findAll();
}
