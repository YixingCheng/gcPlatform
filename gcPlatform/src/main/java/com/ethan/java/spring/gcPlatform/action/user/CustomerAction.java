package com.ethan.java.spring.gcPlatform.action.user;

import java.util.Collection;
import java.util.Iterator;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.ethan.java.spring.gcPlatform.action.BaseAction;
import com.ethan.java.spring.gcPlatform.model.user.Customer;
import com.ethan.java.spring.gcPlatform.util.AppException;
import com.opensymphony.xwork2.ModelDriven;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
/**
 * 顾客Action
 * @author Yixing Cheng
 */
@Scope("prototype")
@Controller("customerAction")
@Results({
	  @Result(name="success", location="/WEB-INF/pages/index.jsp")
	})
public class CustomerAction extends BaseAction implements ModelDriven<Customer>{
	private static final long serialVersionUID = 1L;
	
	public String login() throws Exception{
		return CUSTOMER_LOGIN;
	}
	
	@Override
    public String execute() {
 
        //Principal principal = ServletActionContext.getRequest().getUserPrincipal();
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println("username: " + userDetails.getUsername());
        System.out.println("password: " + userDetails.getPassword());
        Collection<SimpleGrantedAuthority> authorities = (Collection<SimpleGrantedAuthority>) userDetails.getAuthorities();
        for (Iterator it = authorities.iterator(); it.hasNext();) {
            SimpleGrantedAuthority authority = (SimpleGrantedAuthority) it.next();
            System.out.println("Role: " + authority.getAuthority());
        }
        return SUCCESS;
    }
	
	/**
	 * 用户注册
	 * @return
	 * @throws Exception
	 */
	public String save() throws Exception{
		boolean unique = customerDao.isUnique(customer.getUsername());//判断用户名是否可用
		if(unique){//如果用户名可用
			customerDao.save(customer);//保存注册信息
			return CUSTOMER_LOGIN;//返回会员登录页面
		}else{
			throw new AppException("此用户名不可用");//否则返回页面错误信息
		}
	}
	
	/**
	 * 用户登录 
	 * @return
	 * @throws Exception
	 */
	public String logon() throws Exception{
		//验证用户名和密码是否正确
		Customer loginCustomer = customerDao.login(customer.getUsername(), customer.getPassword());
		if(loginCustomer != null){//如果通过验证
			session.put("customer", loginCustomer);//将登录会员信息保存在Session中
		}else{//验证失败
			addFieldError("", "用户名或密码不正确！");//返回错误信息
			return CUSTOMER_LOGIN;//返回会员登录页面
		}
		return INDEX;//返回网站首页
	}
	
	/**
	 * 用户退出
	 * @return String
	 * @throws Exception
	 */
	public String logout() throws Exception{
		if(session != null && session.size() > 0){
			session.clear();
		}
		return INDEX;
	}
	
	
	// 管理员
	private Customer customer = new Customer();
	// 确认密码
	private String repassword;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	@Override
	public Customer getModel() {
		return customer;
	}

}
