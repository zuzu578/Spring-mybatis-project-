package com.myjavalec.practice.DAO;

public interface DAO {
	public int memberCheck(String userid , String userpassword);
	public String Signup(String userid,String useremail,String userpassword);
}
