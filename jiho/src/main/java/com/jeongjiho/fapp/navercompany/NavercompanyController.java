package com.jeongjiho.fapp.navercompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeongjiho.fapp.naveradress.NaveradressDto;

@Controller
public class NavercompanyController {
	
	@Autowired
	NavercompanyService navercompanyService;
				
	@RequestMapping(value = "/navercompany/navercompanyXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", navercompanyService.selectList());
		return "navercompany/navercompanyXdmList";
	}
	
	@RequestMapping(value = "/navercompany/navercompanyXdmView")
	public String navercompanyXdmList(Model model, NavercompanyDto navercompanyDto) {
		System.out.println("navercompanyDto.getSeq(): " + navercompanyDto.getSeq());
		model.addAttribute("item", navercompanyService.selectOne(navercompanyDto));
		return "navercompany/navercompanyXdmView";
	}
	
	@RequestMapping(value = "/navercompany/navercompanyXdmForm")
	public String navercompanyXdmForm() {
		
		return "navercompany/navercompanyXdmForm";
	}
	
	@RequestMapping(value = "/navercompany/navercompanyXdmInst")
	public String navercompanyXdmInst(NavercompanyDto navercompanyDto) {
		System.out.println("navercompanyDto.getSeq(): " + navercompanyDto.getSeq());
		System.out.println("navercompanyDto.getCompany(): " + navercompanyDto.getCompany());
		
		navercompanyService.insert(navercompanyDto);
		
		System.out.println("navercompanyDto.getSeq(): " + navercompanyDto.getSeq());
		
		return "redirect:/navercompany//navercompanyXdmList";
	}
}

