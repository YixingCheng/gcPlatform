package com.ethan.java.spring.gcPlatform.action.card;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.ethan.java.spring.gcPlatform.action.BaseAction;
import com.ethan.java.spring.gcPlatform.model.PageModel;
import com.ethan.java.spring.gcPlatform.model.card.CardInfo;
import com.ethan.java.spring.gcPlatform.model.card.CardsInfo;
import com.opensymphony.xwork2.ModelDriven;

/**
 * CardAction
 * @author Yixing Cheng
 */
@Scope("prototype")
@Controller("cardAction")
public class CardAction extends BaseAction implements ModelDriven<CardInfo> {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 根据id查看商品信息(查看后更新人气点击次数)
	 * @return String
	 * @throws Exception
	 */
	public String select() throws Exception {
		if(card.getId() != null && card.getId() > 0){
			card = cardDao.get(card.getId());
			//card.setClickcount(card.getClickcount() + 1);
			cardDao.update(card);
		}
		return SELECT;
	}
	
	// 商品对象
	@Autowired
	private CardInfo card;
    
	// 所有类别
	private Map<Integer, String> map;
	// 分页组件
	private PageModel<CardsInfo> pageModel;

	@Override
	public CardInfo getModel() {
		// TODO Auto-generated method stub
		return card;
	}
	
}
