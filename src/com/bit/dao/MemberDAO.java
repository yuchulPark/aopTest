package com.bit.dao;

import java.util.ArrayList;

public class MemberDAO { // Ÿ������ �� dao�� ������
	public int insertMember(String name, int age) { // �Ű����� 2��, return
		System.out.println("ȸ���� ����Ͽ���");
		return 1;
	}
	public void updateMember() { // �Ű����� x
		System.out.println("ȸ���� �����Ͽ���");
	}
	public ArrayList<String> listMember(){ // �Ű����� x, return
		ArrayList<String> list = new ArrayList<String>();
		list.add("�̼���");
		list.add("�����");
		list.add("������");
		return list;
	}
}
