package com.wanghefei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wanghefei.utils.TestDemo;

@Controller
public class TestController {

	//去页面
	@RequestMapping("tohtml.do")
	public String tohtml(){
		
		return "toHtml";
	}
	
	@RequestMapping("html.do")
	public void sctext(@RequestParam("")String text){
		String html = TestDemo.toHtml(text);
		System.out.println(html);
	}
}
