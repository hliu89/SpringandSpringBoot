package com.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.pojo.Item;

/**
 * 
 * 商品管理
 * **/
@Controller
public class ItemController {

	//入门程序
	@RequestMapping(value="item/itemlist.action")
	public ModelAndView itemlist() {
		
		List<Item> list = new ArrayList<Item>();
		list.add(new Item(1, "1华为 荣耀8", 2399f, new Date(), "质量好！1"));
		list.add(new Item(2, "2华为 荣耀8", 2399f, new Date(), "质量好！2"));
		list.add(new Item(3, "3华为 荣耀8", 2399f, new Date(), "质量好！3"));
		list.add(new Item(4, "4华为 荣耀8", 2399f, new Date(), "质量好！4"));
		list.add(new Item(5, "5华为 荣耀8", 2399f, new Date(), "质量好！5"));
		list.add(new Item(6, "6华为 荣耀8", 2399f, new Date(), "质量好！6"));
		
		 ModelAndView mav=new ModelAndView();
		 mav.addObject("itemList", list);
		 mav.setViewName("itemList");
		return mav;
	}
	
}
