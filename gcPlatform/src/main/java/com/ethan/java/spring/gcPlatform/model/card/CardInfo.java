package com.ethan.java.spring.gcPlatform.model.card;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品信息
 * @author Yixing Cheng
 */
public class CardInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;// 商品编号
	private Float facevalue;  //facevalue
	private Float price; //selling price
	private CardsInfo cards;
	//private CardCategory category;
	private Date createTime = new Date();//  create time
	private Date sellTime;
	private String owner;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Float getFacevalue() {
		return facevalue;
	}
	public void setFacevalue(Float facevalue) {
		this.facevalue = facevalue;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public CardsInfo getCards() {
		return cards;
	}
	public void setCards(CardsInfo cards) {
		this.cards = cards;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getSellTime() {
		return sellTime;
	}
	public void setSellTime(Date sellTime) {
		this.sellTime = sellTime;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	

}
