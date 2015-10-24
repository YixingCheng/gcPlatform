package com.ethan.java.spring.gcPlatform.dao.card;


import org.springframework.stereotype.Repository;

import com.ethan.java.spring.gcPlatform.dao.DaoSupport;
import com.ethan.java.spring.gcPlatform.model.card.CardCategory;

@Repository("productCategoryDao")
public class CardCategoryDaoImpl extends DaoSupport<CardCategory> implements
		CardCategoryDao {

}
