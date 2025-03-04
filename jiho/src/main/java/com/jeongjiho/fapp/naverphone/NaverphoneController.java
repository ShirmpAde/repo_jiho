package com.jeongjiho.fapp.naverphone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeongjiho.fapp.naverhompage.NaverhompageService;

@Controller
public class NaverphoneController {
	
	@Autowired
	NaverphoneService naverphoneService;
			
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
	
	@RequestMapping(value = "/naverphone/naverphoneXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", naverphoneService.selectList());
		return "naverphone/naverphoneXdmList";
	}
}
