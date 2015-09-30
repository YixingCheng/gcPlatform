package com.ethan.java.spring.cards.dao.product;

import java.util.List;

import com.ethan.java.spring.cards.dao.BaseDao;
import com.ethan.java.spring.cards.model.product.ProductInfo;

public interface ProductDao extends BaseDao<ProductInfo>{
	public List<ProductInfo> findCommend();
	public List<ProductInfo> findClickcount();
	public List<ProductInfo> findSellCount();
}
