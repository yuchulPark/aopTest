package com.bit.dao;

import java.util.ArrayList;

public class GoodsDAO { // 타겟으로 할 dao를 만들음
	public int insertGoods(String item, int price) {
		System.out.println("상품을 등록함");
		return 1;
	}
	public ArrayList<String> list(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("포도");
		list.add("오렌지");
		// System.out.println(list.get(100)); // 예외 코드. After Throwing Advice할때 적용하기
		return list;
	}
}
