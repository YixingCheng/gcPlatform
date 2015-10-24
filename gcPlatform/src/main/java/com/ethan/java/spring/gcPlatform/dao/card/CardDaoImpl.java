package com.ethan.java.spring.gcPlatform.dao.card;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.ethan.java.spring.gcPlatform.dao.DaoSupport;
import com.ethan.java.spring.gcPlatform.model.PageModel;
import com.ethan.java.spring.gcPlatform.model.card.CardInfo;

public class CardDaoImpl extends DaoSupport<CardInfo> implements CardDao {

	@Override
	public void save(Object obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveOrUpdate(Object obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Serializable... ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public CardInfo get(Serializable entityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardInfo load(Serializable entityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object uniqueResult(String hql, Object[] queryParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PageModel<CardInfo> find(int pageNo, int maxResult) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageModel<CardInfo> find(int pageNo, int maxResult, String where,
			Object[] queryParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageModel<CardInfo> find(int pageNo, int maxResult,
			Map<String, String> orderby) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageModel<CardInfo> find(String where, Object[] queryParams,
			Map<String, String> orderby, int pageNo, int maxResult) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CardInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
