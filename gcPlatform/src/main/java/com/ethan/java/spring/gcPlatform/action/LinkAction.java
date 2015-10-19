package com.ethan.java.spring.gcPlatform.action;

import com.opensymphony.xwork2.ActionSupport;


public class LinkAction extends ActionSupport {
	private static final long serialVersionUID = -2613425890762568273L;
	 
	public String add()
	{
	return "add";
	}
	 
	public String delete()
	{
	return "delete";
	}
	 
	public String home()
	{
	return "home";
	}
	 
	public String logout()
	{
	return "logout";
	}
}
