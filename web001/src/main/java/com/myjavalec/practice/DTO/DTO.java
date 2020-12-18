package com.myjavalec.practice.DTO;

public class DTO {
	private String userid;
	private String userpassword;
	private String useremail;
	DTO(){
		
	}
	
	public DTO(String userid, String userpassword, String useremail) {
		super();
		this.userid = userid;
		this.userpassword = userpassword;
		this.useremail = useremail;
	}

	public String getUserid() {
		return userid;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	
	
	
}
