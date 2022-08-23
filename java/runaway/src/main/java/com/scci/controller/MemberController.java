package com.scci.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.scci.vo.Member;
import com.scci.vo.Menu;

@Controller
@RequestMapping("/member")
public class MemberController {
	@RequestMapping("/init")
	public String getInit(@RequestParam Map<String, String> param, HttpServletRequest request) {
		return "memberSearchView";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam String content, @RequestParam String memberGrade, Model model) {
		List<Member> members = null;
		switch(memberGrade) {
		case "normal" :
			members = Arrays.asList(new Member("손담비", "서울시", "01012341234"),
									new Member("이정재", "서울시", "01012341234"),
									new Member("이미정", "서울시", "01012341234"));
			break;
		case "gold" :
			members = Arrays.asList(new Member("노희정", "순천시", "01012341234"),
									new Member("이채리", "순천시", "01012341234"),
									new Member("감우성", "순천시", "01012341234"));
			break;
			default:
				break;
		}
		model.addAttribute("members", members);
		return "memberSearchView";
	}
	
	@ModelAttribute
	public void getMenu(Model model){
		List<Menu> list = Arrays.asList(new Menu("normal", "정회원"), new Menu("gold", "우수회원"));
		model.addAttribute("menu", list);
	}
}
