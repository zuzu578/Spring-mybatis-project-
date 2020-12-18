package com.javalecture.practice.CDAO;

public interface CDAO {

	public String userinfor(String userid,String userpassword,String useremail);

	public int TryLogin(String userid,String userpassword);
	public String userdelete(String userid);
}
