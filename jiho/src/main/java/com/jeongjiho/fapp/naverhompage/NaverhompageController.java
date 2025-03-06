package com.jeongjiho.fapp.naverhompage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NaverhompageController {
	
	@Autowired
	NaverhompageService naverhompageService;
	
	@RequestMapping(value = "/naverhompage/naverhompageXdmList")
	public String naverhompageXdmList(Model model) {
		model.addAttribute("list", naverhompageService.selectList());
		return "naverhompage/naverhompageXdmList";
	}
	
	@RequestMapping(value = "/naverhompage/naverhompageXdmView")
	public String naverhompageXdmList(Model model, NaverhompageDto naverhompageDto) {
		System.out.println("naverhompageDto.getSeq(): " + naverhompageDto.getSeq());
		model.addAttribute("item", naverhompageService.selectOne(naverhompageDto));
		return "naverhompage/naverhompageXdmView";
	}
	
	@RequestMapping(value = "/naverhompage/naverhompageXdmForm")
	public String naverhompageXdmForm() {
		
		return "naverhompage/naverhompageXdmForm";
	}
	
	@RequestMapping(value = "/naverhompage/naverhompageXdmInst")
	public String naverhompageXdmInst(NaverhompageDto naverhompageDto) {
		System.out.println("naverhompageDto.getSeq(): " + naverhompageDto.getSeq());
		System.out.println("naverhompageDto.getHompage(): " + naverhompageDto.getHompage());
		
		naverhompageService.insert(naverhompageDto);
		
		System.out.println("naverhompageDto.getSeq(): " + naverhompageDto.getSeq());
		
		return "redirect:/naverhompage//naverhompageXdmList";
	}
}
