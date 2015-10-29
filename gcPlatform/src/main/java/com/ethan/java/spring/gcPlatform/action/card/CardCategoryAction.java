package com.ethan.java.spring.gcPlatform.action.card;

import java.util.HashMap;
import java.util.Map;


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
	
	/**
	 * 查询类别
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception{
		Map<String, String> orderby = new HashMap<String, String>();//定义Map集合
		orderby.put("id", "asc");//为Map集合赋值
		pageModel = categoryDao.find(1, 8, orderby );//执行查找方法
		//return "clickList";//返回product_click_list.jsp页面
		//Object[] params = null;//对象数组为空
		//String where;//查询条件变量
		//if(pid != null && pid > 0 ){//如果有父节点
		//	where = "where parent.id =?";//执行查询条件
		//	params = new Integer[]{pid};//设置参数值
		//}else{
		//	where = "where parent is null";//查询根节点
		//}
		//pageModel = categoryDao.find(pageNo,pageSize,where,params);//执行封装的查询方法
		return "all_list";//返回后台类别列表页面
	}
	
	/**
	 * 编辑类别
	 * @return String
	 * @throws Exception
	 */
	public String edit() throws Exception{
		if(category.getId() != null && category.getId() > 0){
			this.category = categoryDao.get(category.getId());
		}
		return EDIT;
	}
	
	/**
	 * 删除类别
	 * @return String
	 * @throws Exception
	 */
	public String del() throws Exception{
		if(category.getId() != null && category.getId() > 0){//判断是否获得ID参数
			categoryDao.delete(category.getId());//执行删除操作
		}
		return list();//返回商品类别列表的查找方法
	}
	
	// 父类别id
	//private Integer pid;
	// 所有类别
	private PageModel<CardCategory> pageModel;

	//public Integer getPid() {
	//	return pid;
	//}

	//public void setPid(Integer pid) {
	//	this.pid = pid;
	//}

	public PageModel<CardCategory> getPageModel() {
		return pageModel;
	}

	public CardCategory getCategory() {
		return category;
	}

	public void setCategory(CardCategory category) {
		this.category = category;
	}
	
}
