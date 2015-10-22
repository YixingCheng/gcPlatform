package com.ethan.java.spring.gcPlatform.action;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope("prototype")
@Controller("indexAction")
@Results({
	  @Result(name="success", location="/WEB-INF/pages/index.jsp")
	})
public class IndexAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
