package com.jeongjiho.fapp.user_group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class User_groupController {
	
	@Autowired
	User_groupService user_groupService;
	
	@RequestMapping(value = "/user_group/user_groupXdmList")
	public String user_groupXdmList(Model model) {
		model.addAttribute("list", user_groupService.selectList());
		return "user_group/user_groupXdmList";
	}
	
	@RequestMapping(value = "/user_group/user_groupXdmView")
	public String user_groupXdmList(Model model, User_groupDto user_groupDto) {
		System.out.println("user_groupDto.getSeq(): " + user_groupDto.getSeq());
		model.addAttribute("item", user_groupService.selectOne(user_groupDto));
		return "user_group/user_groupXdmView";
	}
	
	@RequestMapping(value = "/user_group/user_groupXdmForm")
	public String user_groupXdmForm() {
		
		return "user_group/user_groupXdmForm";
	}
	
	@RequestMapping(value = "/user_group/user_groupXdmInst")
	public String user_groupXdmInst(User_groupDto user_groupDto) {
		System.out.println("user_groupDto.getSeq(): " + user_groupDto.getSeq());
		System.out.println("user_groupDto.getName(): " + user_groupDto.getName());
		
		user_groupService.insert(user_groupDto);
		
		System.out.println("user_groupDto.getSeq(): " + user_groupDto.getSeq());
		
		return "redirect:/user_group//user_groupXdmList";
	}
	
	@RequestMapping(value = "/user_group/user_groupXdmMfom")
	public String user_groupXdmMfom(User_groupDto user_groupDto, Model model) {
		
		model.addAttribute("item", user_groupService.selectOne(user_groupDto));
		
		return "/user_group//user_groupXdmMfom";
	}
	
	@RequestMapping(value = "/user_group/user_groupXdmUpdt")
	public String user_groupXdmUpdt(User_groupDto user_groupDto) {
		
		user_groupService.update(user_groupDto);
		
		return "redirect:/user_group//user_groupXdmList";
	}
}
