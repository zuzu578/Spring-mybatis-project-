package com.javalecture.practice.CDTO;

public class CDTO {

	private String userid;
	private String userpassword;
	CDTO(){
		
	}
	
	public CDTO(String userid, String userpassword) {
		super();
		this.userid = userid;
		this.userpassword = userpassword;
	}

	public String getUserid() {
		return userid;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

}
