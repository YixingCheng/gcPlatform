package com.ethan.java.spring.gcPlatform.model.card;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Component;

/**
 * 产品类别
 * @author Yixing Cheng
 */
@Component
public class CardCategory implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;// 类别编号
	private String name;// 类别名称
	//private int level = 1;// 层次
	//private Set<ProductCategory> children;// 子产品类别
	//private ProductCategory parent;// 父类别
	private Set<CardsInfo> cards = new TreeSet<CardsInfo>();// 包含商品
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//public Set<ProductCategory> getChildren() {
	//	return children;
	//}
	//public void setChildren(Set<ProductCategory> children) {
	//	this.children = children;
	//}
	//public ProductCategory getParent() {
	//	return parent;
	//}
	//public void setParent(ProductCategory parent) {
	//	this.parent = parent;
	//}
	public Set<CardsInfo> getCards() {
		return cards;
	}
	public void setCards(Set<CardsInfo> cards) {
		this.cards = cards;
	}
	
	//public int getLevel() {
	//	return level;
	//}
	//public void setLevel(int level) {
	//	this.level = level;
	//}

}
