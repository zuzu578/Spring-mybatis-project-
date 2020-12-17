package com.javalecture.practice.Ccontroller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javalecture.practice.CDAO.CDAO;



@Controller


public class Ccontroller {
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/DoSignup")
	public String DoSignup() {
		return "Signup";
	}
	@RequestMapping(value="/TrySignup",method = RequestMethod.POST)
	public String trySignup(HttpServletRequest req, Model model) {
		String userid = req.getParameter("userid");
		String useremail = req.getParameter("useremail");
		String userpassword = req.getParameter("userpassword");
		HttpSession session = req.getSession( );
		CDAO cdao = sqlSession.getMapper(CDAO.class);
		cdao.userinfor(userid,userpassword,useremail);
		return "redirect:DoLoginPage";
	}
	
	
	@RequestMapping("/DoLoginPage")
	public String doLogin() {
		return "DoLogin";
	}
	@RequestMapping(value="/TryLogin",method = RequestMethod.POST)
	public String TryLogin(HttpServletRequest req, Model model) {
		String userid = req.getParameter("userid");
		System.out.println(userid);
		String userpassword = req.getParameter("userpassword");
		System.out.println(userpassword);
		HttpSession session = req.getSession( );
		CDAO cdao = sqlSession.getMapper(CDAO.class);
		int cnt = cdao.TryLogin(userid,userpassword);
		if(cnt ==1) {
			//==>회원정보가 존재 한다<==//
			//==>세션에 유저의 정보를 담아준다<==//
			session.setAttribute("uid",userid);
		}else{
			//==>테이블에 회원정보가 없다(0)<==//
			return "redirect:DoLoginPage";
			//==> 회원정보가 없으므로 다시 로그인 하게 만든다<==//
		}
		//==>로그인 성공 하면 , 글목록으로 가게끔한다<==//
		return "test01";

		
	}
}
