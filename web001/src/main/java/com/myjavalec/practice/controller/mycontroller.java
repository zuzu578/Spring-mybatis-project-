package com.myjavalec.practice.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjavalec.practice.DAO.DAO;

@Controller
public class mycontroller {
	@Autowired
	private SqlSession sqlSession;
	//==> 메인페이지<==//
	@RequestMapping("/firstpage1")
	public String firstpage() {
		return "firstpage";
	}
	//==>로그인 페이지<==//
	@RequestMapping("/login")
	public String doLogin() {
		return "loginform";
	}
	//==> 회원가입 페이지<==//
	@RequestMapping("/signup")
	public String doSignup() {
		return "usersignup";
	}
	@RequestMapping(value="/TrySignup",method = RequestMethod.POST)
	public String trySignup(HttpServletRequest req, Model model) {
		String userid = req.getParameter("userid");
		String useremail = req.getParameter("useremail");
		String userpassword = req.getParameter("userpassword");
		HttpSession session = req.getSession( );
		DAO dao = sqlSession.getMapper(DAO.class);
		dao.Signup(userid,userpassword,useremail);
		return "redirect:login";
	}
	
	
	@RequestMapping(value="/loginCheck",method=RequestMethod.POST)
	public String loginCheck(HttpServletRequest req , Model model) {
		String userid = req.getParameter("userid");
		System.out.println(userid);
		System.out.println("console.log1");
		String userpassword = req.getParameter("userpassword");

		System.out.println("console.log2");
		System.out.println(userpassword);

		System.out.println("console.log3");
		HttpSession session = req.getSession( );
		DAO dao = sqlSession.getMapper(DAO.class);
		System.out.println("console.log100");
		int cnt = dao.memberCheck(userid,userpassword);
		System.out.println("console.log200");
		System.out.println(cnt);
		if(cnt == 1) {
			System.out.println(cnt);
			System.out.println("console.log4");
			System.out.println(userid);
			System.out.println("console.log5");
			System.out.println(userpassword);
			System.out.println("console.log6");
			//==>회원정보가 존재 한다<==//
			//==>세션에 유저의 정보를 담아준다<==//
			session.setAttribute("uid",userid);
			System.out.println ("console.log7");
			return "redirect:firstpage1";
		}else{
			//==>테이블에 회원정보가 없다(0)<==//
			return "redirect:login";
			//==> 회원정보가 없으므로 다시 로그인 하게 만든다<==//
		}
		//==>로그인 성공 하면 , 글목록으로 가게끔한다<==//
		
	}
	
}
