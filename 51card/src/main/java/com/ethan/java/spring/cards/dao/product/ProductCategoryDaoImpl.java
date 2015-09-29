package com.ethan.java.spring.cards.dao.product;

import org.springframework.stereotype.Repository;

import com.ethan.java.spring.cards.dao.DaoSupport;
import com.ethan.java.spring.cards.model.product.ProductCategory;
@Repository("productCategoryDao")
public class ProductCategoryDaoImpl extends DaoSupport<ProductCategory> implements ProductCategoryDao {

}
