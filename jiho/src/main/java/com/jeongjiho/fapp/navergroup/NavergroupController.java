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
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", navergroupService.selectList());
		return "navergroup/navergroupXdmList";
	}
	
	@RequestMapping(value = "/navergroup/navergroupXdmView")
	public String codeGroupXdmView(Model model, NavergroupDto navergroupDto) {
		
		System.out.println("navergroupDto.getSeq(): " + navergroupDto.getSeq());
		System.out.println(model);
		model.addAttribute("item", navergroupService.selectOne(navergroupDto));
		return "navergroup/navergroupXdmView";
	}
}
