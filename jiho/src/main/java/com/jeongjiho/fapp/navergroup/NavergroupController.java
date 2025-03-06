package com.jeongjiho.fapp.navergroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NavergroupController {
	
	@Autowired
	NavergroupService navergroupService;
	
	@RequestMapping(value = "/navergroup/navergroupXdmList")
	public String navergroupXdmList(Model model) {
		model.addAttribute("list", navergroupService.selectList());
		return "navergroup/navergroupXdmList";
	}
	
	@RequestMapping(value = "/navergroup/navergroupXdmView")
	public String navergroupXdmList(Model model, NavergroupDto navergroupDto) {
		System.out.println("navergroupDto.getSeq(): " + navergroupDto.getSeq());
		model.addAttribute("item", navergroupService.selectOne(navergroupDto));
		return "navergroup/navergroupXdmView";
	}
	
	@RequestMapping(value = "/navergroup/navergroupXdmForm")
	public String navergroupXdmForm() {
		
		return "navergroup/navergroupXdmForm";
	}
	
	@RequestMapping(value = "/navergroup/navergroupXdmInst")
	public String navergroupXdmInst(NavergroupDto navergroupDto) {
		System.out.println("navergroupDto.getSeq(): " + navergroupDto.getSeq());
		System.out.println("navergroupDto.getAddcontact_seq(): " + navergroupDto.getAddcontact_seq());
		
		navergroupService.insert(navergroupDto);
		
		System.out.println("navergroupDto.getSeq(): " + navergroupDto.getSeq());
		
		return "redirect:/navergroup//navergroupXdmList";
	}
}
