package com.bit.exam;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.dao.GoodsDAO;
import com.bit.dao.MemberDAO;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam/beans.xml");
		MemberDAO mDAO = (MemberDAO)context.getBean("mDAO");
		GoodsDAO gDAO = (GoodsDAO)context.getBean("gDAO");
		mDAO.insertMember("유관순", 20);
		ArrayList<String> memberList = mDAO.listMember();
		for(String member : memberList) {
			System.out.println(member);
		}
		gDAO.insertGoods("공", 100);
		ArrayList<String> goodsList = gDAO.list();
		for(String goods : goodsList) {
			System.out.println(goods);
		}
	}
}
