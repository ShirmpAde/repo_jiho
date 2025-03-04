package com.jeongjiho.fapp.naverbirthday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NaverbirthdayController {
	@Autowired
	NaverbirthdayService naverbirthdayService;
			
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
	
	@RequestMapping(value = "/naverbirthday/naverbirthdayXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", naverbirthdayService.selectList());
		return "naverbirthday/naverbirthdayXdmList";
	}
}
