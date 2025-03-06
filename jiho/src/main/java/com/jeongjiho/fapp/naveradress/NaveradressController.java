package com.jeongjiho.fapp.naveradress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NaveradressController {
	
	@Autowired
	NaveradressService naveradressService;
	
	@RequestMapping(value = "/naveradress/naveradressXdmList")
	public String naveradressXdmList(Model model) {
		model.addAttribute("list", naveradressService.selectList());
		return "naveradress/naveradressXdmList";
	}
	
	@RequestMapping(value = "/naveradress/naveradressXdmView")
	public String naveradressXdmList(Model model, NaveradressDto naveradressDto) {
		System.out.println("naveradressDto.getSeq(): " + naveradressDto.getSeq());
		model.addAttribute("item", naveradressService.selectOne(naveradressDto));
		return "naveradress/naveradressXdmView";
	}
	
	@RequestMapping(value = "/naveradress/naveradressXdmForm")
	public String naveradressXdmForm() {
		
		return "naveradress/naveradressXdmForm";
	}
	
	@RequestMapping(value = "/naveradress/naveradressXdmInst")
	public String naveradressXdmInst(NaveradressDto naveradressDto) {
		System.out.println("naveradressDto.getSeq(): " + naveradressDto.getSeq());
		System.out.println("naveradressDto.getAdressType(): " + naveradressDto.getAdressType());
		
		naveradressService.insert(naveradressDto);
		
		System.out.println("naveradressDto.getSeq(): " + naveradressDto.getSeq());
		
		return "redirect:/naveradress//naveradressXdmList";
	}
}
