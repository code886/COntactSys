package com.yuanhao.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.yuanhao.dao.ContactDao;
import com.yuanhao.entity.Contact;
import com.yuanhao.utils.ConnDb;

public class ContactDaoImpl implements ContactDao{

	ConnDb connDb = new ConnDb();
	private Connection ct = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	public Contact queryContact(String name){
		Contact contact = new Contact();
		ConnDb connDb = new ConnDb();
		try {
			ct = connDb.getConn();
			ps = ct.prepareStatement("select age,gender,email from contact where name='"+name+"'");
			rs = ps.executeQuery();
			if(rs.next()){
				contact.setName(name);
				contact.setAge(Integer.parseInt(rs.getString(1)));
				contact.setGender(rs.getString(2));
				contact.setEmail(rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
		return contact;
	}
	
	/**
	 * 显示全部
	 */
	@Override
	public List<Contact> findAll() {
		List<Contact> allContact = new ArrayList<>();
		try {
			ct = connDb.getConn();
			ps = ct.prepareStatement("select * from contact");
			rs = ps.executeQuery();
			while(rs.next()){
				Contact contact = new Contact();
				contact.setName(rs.getString(2));
				contact.setAge(Integer.parseInt(rs.getString(3)));
				contact.setGender(rs.getString(4));
				contact.setEmail(rs.getString(5));
				allContact.add(contact);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally{
			this.close();
		}
		return allContact;
	}

	@Override
	public boolean updateContact(String name,String gender,int age,String email) {
		boolean b = false;
		try {
			ct = connDb.getConn();
			ps = ct.prepareStatement("update contact set name='"+name+"',gender='"+gender+"',email='"+email+"',age='"+age+"' where name='"+name+"'");
			int a = ps.executeUpdate();
			if(a==1){
				b = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			this.close();
		}
		return b;
	}

	@Override
	public boolean deleleContact(String name) {
		// TODO Auto-generated method stub
		boolean b = false;
		try {
			ct = connDb.getConn();
			ps = ct.prepareStatement("delete from contact where name=?");
			ps.setString(1, name);
			int a = ps.executeUpdate();
			if(a==1){
				b = true;
			} 
		} catch (Exception e) {
			// TODO: handle exception
		} finally{
			this.close();
		}
		return b;
	}

	/**
	 * 添加
	 */
	@Override
	public boolean addContact(String name,String gender,int age,String email) {
		boolean b=false;
		try {
			ct = connDb.getConn();
			ps = ct.prepareStatement("insert contact(name,gender,age,email) values ('"+name+"','"+gender+"','"+age+"','"+email+"')");
			int a = ps.executeUpdate();
			if(a==1){
				b=true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			this.close();
		}
		return b;
	}
	
	public void close() {
		try {
			if(rs!=null){
				rs.close();
				rs=null;
			}
			if(ps!=null){
				ps.close();
				ps=null;
			}
			if(ct!=null){
				ct.close();
				ct=null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
