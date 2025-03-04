package com.jeongjiho.fapp.naveremail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NaveremailController {
	
	@Autowired
	NaveremailService naveremailService;
			
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
	
	@RequestMapping(value = "/naveremail/naveremailXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", naveremailService.selectList());
		return "naveremail/naveremailXdmList";
	}
}

