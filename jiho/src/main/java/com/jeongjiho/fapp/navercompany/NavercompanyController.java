package com.jeongjiho.fapp.navercompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavercompanyController {
	
	@Autowired
	NavercompanyService navercompanyService;
			
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
	
	@RequestMapping(value = "/navercompany/navercompanyXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", navercompanyService.selectList());
		return "navercompany/navercompanyXdmList";
	}
}
