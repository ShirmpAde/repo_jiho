package com.jeongjiho.fapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/index2")
	public String index2() {
		return "/abc/inddex";
	}
	
	@RequestMapping(value = "/helloWorld")
	public String helloWorld() {
		return "helloWorld";
	}
	
	@RequestMapping(value = "/aaa/bbb")
	public String bbb() {
		return "aaa/bbb";
	}
	
	@RequestMapping(value = "/xxx/yyy/zzz")
	public String zzz() {
		return "xxx/yyy/zzz";
	}
	
	@RequestMapping(value = "/ttt/yyy")
	public String yyy() {
		return "ttt/yyy";
	}
	
	@RequestMapping(value = "/infra/member/loginXdmForm")
	public String loginXdmForm() {
		return "infra/member/loginXdmForm";
	}
	
	@RequestMapping(value = "/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList() {
		return "infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/infra/codegroup/codeGroupXdmForm")
	public String codeGroupXdmForm() {
		return "infra/codegroup/codeGroupXdmForm";
	}
	
	@RequestMapping(value = "/infra/member/loginUsrForm")
	public String loginUsrForm() {
		return "infra/member/loginUsrForm";
	}
	
}
