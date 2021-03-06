package com.ethan.java.spring.gcPlatform.model.card;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Component;


/**
 * 商品信息
 * @author Yixing Cheng
 */
@Component
public class CardsInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;// 商品编号
	private String name;// 商品名称
	private String description;// 商品说明
	//private Date createTime = new Date();// 上架时间
	//private Float baseprice;// 商品采购价格
	//private Float marketprice;// 现在市场价格
	//private Float sellprice;// 商城销售价格
	//private Sex sexrequest;// 所属性别
	private Boolean commend = false;// 是否是推荐商品（默认值为false）
	private Integer clickcount = 1;// 访问量（统计受欢迎的程度）
	private Integer sellCount = 0;// 销售数量（统计热销商品）
	private CardCategory category;// 所属类别
	private String path;
	private Set<CardInfo> card = new TreeSet<CardInfo>();
	//private UploadFile uploadFile;// 上传文件
    
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	//public Date getCreateTime() {
	//	return createTime;
	//}
	//public void setCreateTime(Date createTime) {
	//	this.createTime = createTime;
	//}
	//public Float getBaseprice() {
	//	return baseprice;
	//}
	//public void setBaseprice(Float baseprice) {
	//	this.baseprice = baseprice;
	//}
	//public Float getMarketprice() {
	//	return marketprice;
	//}
	//public void setMarketprice(Float marketprice) {
	//	this.marketprice = marketprice;
	//}
	//public Float getSellprice() {
	//	return sellprice;
	//}
	//public void setSellprice(Float sellprice) {
	//	this.sellprice = sellprice;
	//}
	//public Sex getSexrequest() {
	//	return sexrequest;
	//}
	//public void setSexrequest(Sex sexrequest) {
	//	this.sexrequest = sexrequest;
	//}
	public Boolean getCommend() {
		return commend;
	}
	public void setCommend(Boolean commend) {
		this.commend = commend;
	}
	public Integer getClickcount() {
		return clickcount;
	}
	public void setClickcount(Integer clickcount) {
		this.clickcount = clickcount;
	}
	public Integer getSellCount() {
		return sellCount;
	}
	public void setSellCount(Integer sellCount) {
		this.sellCount = sellCount;
	}
	public CardCategory getCategory() {
		return category;
	}
	public void setCategory(CardCategory category) {
		this.category = category;
	}
	public Set<CardInfo> getCard() {
		return card;
	}
	public void setCard(Set<CardInfo> card) {
		this.card = card;
	}
	//public UploadFile getUploadFile() {
	//	return uploadFile;
	//}
	//public void setUploadFile(UploadFile uploadFile) {
	//	this.uploadFile = uploadFile;
	//}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
}
