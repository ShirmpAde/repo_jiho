package com.jeongjiho.fapp.user_group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User_groupController {
	
	@Autowired
	User_groupService user_groupService;
			
//	@RequestMapping(value = "/naverhompage/naverhompageXdmList")
//	public String codeGroupXdmList(Model model) {
//		
//		List<NaverhompageDto> naverhompageDtos = new ArrayList<>();
//		
//		naverhompageDtos = naverhompageService.selectList();
//		
//		System.out.println("naverhompageDtos.size(): " + naverhompageDtos.size());
//		
//		model.addAttribute("list", naverhompageDtos);
//		
//		return "naverhompage/naverhompageXdmList";
//	}
	
	@RequestMapping(value = "/user_group/user_groupXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", user_groupService.selectList());
		return "user_group/user_groupXdmList";
	}
}

