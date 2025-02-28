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
}
