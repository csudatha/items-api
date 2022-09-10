package com.ucs.sts.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ucs.sts.model.Item;

@Controller
public class ItemController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("home method invoked");			
		ModelAndView mv = new ModelAndView();
		mv.addObject("itemID","100");
		mv.setViewName("home");
		return "home";
	}

	
	@RequestMapping("/getItem")
	public ModelAndView getItem(Item itemObj) {		
		System.out.println("getItem method invoked "+itemObj);			
		ModelAndView mv = new ModelAndView();
		mv.addObject("itemObj", itemObj);
		mv.setViewName("home");
		return mv;
	}
	
	
	
	
////*****WITH Model and view
//	@RequestMapping("/home")
//	public ModelAndView home() {
//		System.out.println("home method invoked");			
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("itemID","100");
//		mv.setViewName("home");
//		return mv;
//	}
//
//	
//	@RequestMapping("/getItem")
//	public ModelAndView getItem(@RequestParam("itemID") int itemID) {		
//		System.out.println("getItem method invoked "+itemID);			
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("itemID", itemID);
//		mv.setViewName("home");
//		return mv;
//	}
	
////*****END WITH Model and view
	////*****without Model and view
//	@RequestMapping("/home")
//	public String home(HttpSession session) {
//		session.setAttribute("itemID", 0);
//		System.out.println("home method invoked");			
//		return "home";
//	}
//
//	
//	@RequestMapping("/getItem")
//	public String getItem(int itemID, HttpSession session) {		
//	//public String getItem(@RequestParam("itemID") int itemID, HttpSession session) {		
//		System.out.println("getItem method invoked");			
//		session.setAttribute("itemID", itemID);
//		System.out.println("ItemID = "+itemID);			
//		return "home";
//	}
	//***********End model and view
}
