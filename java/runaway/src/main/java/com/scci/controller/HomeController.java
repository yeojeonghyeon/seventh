package com.scci.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scci.vo.Member;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "welcome home!!");
		model.addAttribute("members", getMembers());
		return "home";
	}
	
	public List<Member> getMembers(){
		return Arrays.asList(new Member("아이유", "서울시 잠원동", "01000007777")
				, new Member("송강호", "순천시 장천동", "01078137878")
				, new Member("최배포", "순천시 조례동", "01178981111")
				, new Member("이사달", "순천시 연향동", "10748483828"));
	}
}
