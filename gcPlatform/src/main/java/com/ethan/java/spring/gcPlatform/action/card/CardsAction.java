package com.ethan.java.spring.gcPlatform.action.card;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.ethan.java.spring.gcPlatform.action.BaseAction;
import com.ethan.java.spring.gcPlatform.model.card.CardsInfo;
import com.opensymphony.xwork2.ModelDriven;


/**
 * 商品Action
 * @author Yixing Cheng
 */
@Scope("prototype")
@Controller("cardsAction")
public class CardsAction extends BaseAction implements ModelDriven<CardsInfo>{

}
