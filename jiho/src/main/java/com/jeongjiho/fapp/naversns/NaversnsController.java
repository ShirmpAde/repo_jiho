package com.jeongjiho.fapp.naversns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NaversnsController {
	
	@Autowired
	NaversnsService naversnsService;
	
	@RequestMapping(value = "/naversns/naversnsXdmList")
	public String naversnsXdmList(Model model) {
		model.addAttribute("list", naversnsService.selectList());
		return "naversns/naversnsXdmList";
	}
	
	@RequestMapping(value = "/naversns/naversnsXdmView")
	public String naversnsXdmList(Model model, NaversnsDto naversnsDto) {
		System.out.println("naversnsDto.getSeq(): " + naversnsDto.getSeq());
		model.addAttribute("item", naversnsService.selectOne(naversnsDto));
		return "naversns/naversnsXdmView";
	}
	
	@RequestMapping(value = "/naversns/naversnsXdmForm")
	public String naversnsXdmForm() {
		
		return "naversns/naversnsXdmForm";
	}
	
	@RequestMapping(value = "/naversns/naversnsXdmInst")
	public String naversnsXdmInst(NaversnsDto naversnsDto) {
		System.out.println("naversnsDto.getSeq(): " + naversnsDto.getSeq());
		System.out.println("naversnsDto.getSnsType(): " + naversnsDto.getSnsType());
		
		naversnsService.insert(naversnsDto);
		
		System.out.println("naversnsDto.getSeq(): " + naversnsDto.getSeq());
		
		return "redirect:/naversns//naversnsXdmList";
	}
}
