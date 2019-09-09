package com.wanghefei.utils;


public class TestDemo {

	//测试手机是否合法
	public static boolean isphone(String str){
		if (wanghefei_utils.StringUtils.isphone(str)) {
			
			return true;
		}else{
			return false;
		}
	}
	
	//测试邮箱
	public static boolean isEmail(String str){
		if (wanghefei_utils.StringUtils.isEmail(str)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static String toHtml(String text){
		String str = wanghefei_utils.StringUtils.toHtml(text);
		return str;
	}
}
