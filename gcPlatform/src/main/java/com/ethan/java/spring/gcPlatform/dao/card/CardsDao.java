package com.ethan.java.spring.gcPlatform.dao.card;


import com.ethan.java.spring.gcPlatform.dao.BaseDao;
import com.ethan.java.spring.gcPlatform.model.card.CardsInfo;

import java.util.List;

public interface CardsDao extends BaseDao<CardsInfo> {
	public List<CardsInfo> findCommend();
	public List<CardsInfo> findClickcount();
	public List<CardsInfo> findSellCount();
}
