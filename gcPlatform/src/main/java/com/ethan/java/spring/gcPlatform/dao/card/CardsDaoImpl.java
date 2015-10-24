package com.ethan.java.spring.gcPlatform.dao.card;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ethan.java.spring.gcPlatform.dao.DaoSupport;
import com.ethan.java.spring.gcPlatform.model.PageModel;
import com.ethan.java.spring.gcPlatform.model.card.CardsInfo;

public class CardsDaoImpl extends DaoSupport<CardsInfo> implements CardsDao{
	
	/**
	 * search for cards ranked top 10
	 */
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<CardsInfo> findClickcount() {
		Map<String, String> orderby = new HashMap<String, String>();
		orderby.put("clickcount", "desc");
		PageModel<CardsInfo> pageModel = find(1, 10, orderby);
		return pageModel.getList();
	}
	
	/**
	 * 
	 */
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<CardsInfo> findCommend() {
		String where = "where commend=?";
		Object[] parames = {true};
		Map<String, String> orderby = new HashMap<String, String>();
		orderby.put("createTime", "desc");
		PageModel<CardsInfo> pageModel = find(where,parames ,orderby,1,10);
		return pageModel.getList();
	}
	
	/**
	 * 查询人气最好的前10件商品
	 */
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<CardsInfo> findSellCount() {
		Map<String, String> orderby = new HashMap<String, String>();
		orderby.put("sellCount", "desc");
		PageModel<CardsInfo> pageModel = find(1, 10, orderby);
		return pageModel.getList();
	}
	
}
