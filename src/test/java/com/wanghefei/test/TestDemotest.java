package com.wanghefei.test;

import org.junit.Test;

import com.wanghefei.utils.TestDemo;

import wanghefei_utils.StringUtils;

public class TestDemotest {

	//测试手机是否合法
	@Test
	public void isphone(){
		boolean isphone = TestDemo.isphone("13611244838");
		System.out.println("手机合法度为："+isphone);
	}
	
	//测试邮箱
	@Test
	public void isEmail(){
		boolean isEmail = TestDemo.isEmail("1187234748@qq.com");
		System.out.println("邮箱合法度为："+isEmail);
	}
	
	//测试一段话
	@Test
	public void text(){
		String text = StringUtils.toHtml("9月5日一大早，又有了新情况。\n\r上午9点多，传出中美经贸高级别磋商牵头人通话的消息\n\r9月5日上午，中共中央政治局委员、国务院副总理、中美全面经济对话中方牵头人刘鹤应约与美国贸易代表莱特希泽、财政部长姆努钦通话。\r");
		System.out.println(""+text);
	}
}
