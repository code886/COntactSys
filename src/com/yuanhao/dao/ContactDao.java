package com.yuanhao.dao;

import java.util.List;

import com.yuanhao.entity.Contact;

public interface ContactDao {
	public List<Contact> findAll();
	public boolean updateContact(String name,String gender,int age,String email);
	public boolean deleleContact(String name);
	public boolean addContact(String name,String gender,int age,String email);
}
