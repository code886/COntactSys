package com.yuanhao.test;

import com.yuanhao.dao.impl.ContactDaoImpl;

public class test {
	public static void main(String[] args) {
		ContactDaoImpl contactDaoImpl = new ContactDaoImpl();
		for(int i=1;i<=10;i++){
			if(i%2==0){
				contactDaoImpl.addContact("name"+i,"male", i,"name"+i+"@qq.com");
			}else {
				contactDaoImpl.addContact("name"+i,"female", i,"name"+i+"@qq.com");
			}
		}
	}
}
