package com.ethan.java.spring.gcPlatform.action.card;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


import com.ethan.java.spring.gcPlatform.action.BaseAction;
import com.ethan.java.spring.gcPlatform.model.PageModel;
import com.ethan.java.spring.gcPlatform.model.card.CardCategory;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 商品类别Action对象
 * @author Yixing Cheng
 *
 */
@Scope("prototype")
@Controller("cardCategoryAction")
public class CardCategoryAction extends BaseAction implements ModelDriven<CardCategory>{
	
	private static final long serialVersionUID = 1L;
	private CardCategory category = new CardCategory();
	
	@Override
	public CardCategory getModel() {
		return category;
	}

	@Override
	public String add() throws Exception {
		//if(pid != null && pid > 0 ){
		//	ProductCategory parent = categoryDao.load(pid);
		//	// 层次加1
		//	category.setLevel(parent.getLevel() + 1);
		//}
		return INPUT;
	}
	
	/**
	 * Add category
	 * @return
	 * @throws Exception
	 */
	public String save() throws Exception{
		//if(pid != null && pid > 0 ){//如果有父节点
		//	category.setParent(categoryDao.load(pid));//设置其父节点
		//}
		categoryDao.saveOrUpdate(category);//添加类别信息
		return list();//返回类别列表的查找方法
	}
	
	
}
