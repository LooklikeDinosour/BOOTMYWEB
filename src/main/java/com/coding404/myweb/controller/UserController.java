package com.coding404.myweb.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coding404.myweb.util.KaKaoAPI;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private KaKaoAPI kakaoAPI;

	@GetMapping("/join")
	public String join() {
		return "user/join";
		
	}
	
	// fafe62a565cd2f0094f12b8d02ebcafa
	
	
	@GetMapping("/login")
	public String login() {
		return "user/login";
	}
	
	@GetMapping("/userDetail")
	public String detail() {
		return "user/userDetail";
	}
	
	
	//카카오로그인
	@GetMapping("/kakao")
	public String kakao(@RequestParam("code") String code) {

		//토큰받기
		String token = kakaoAPI.getToken(code);
		//유저정보받기
		Map<String, Object> map =  kakaoAPI.getUser(token);
		
		System.out.println("카카오에서 받아오는 정보 : " + map.toString());
		
		return "redirect:/main"; //메인화면으로
	}
	
}
