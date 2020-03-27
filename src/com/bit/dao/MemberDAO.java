package com.bit.dao;

import java.util.ArrayList;

public class MemberDAO { // 타겟으로 할 dao를 만들음
	public int insertMember(String name, int age) { // 매개변수 2개, return
		System.out.println("회원을 등록하였음");
		return 1;
	}
	public void updateMember() { // 매개변수 x
		System.out.println("회원을 수정하였음");
	}
	public ArrayList<String> listMember(){ // 매개변수 x, return
		ArrayList<String> list = new ArrayList<String>();
		list.add("이순신");
		list.add("정약용");
		list.add("강감찬");
		return list;
	}
}
