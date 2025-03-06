package com.jeongjiho.fapp.naverphone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NaverphoneController {
	
	@Autowired
	NaverphoneService naverphoneService;
	
	@RequestMapping(value = "/naverphone/naverphoneXdmList")
	public String naverphoneXdmList(Model model) {
		model.addAttribute("list", naverphoneService.selectList());
		return "naverphone/naverphoneXdmList";
	}
	
	@RequestMapping(value = "/naverphone/naverphoneXdmView")
	public String naverphoneXdmList(Model model, NaverphoneDto naverphoneDto) {
		System.out.println("naverphoneDto.getSeq(): " + naverphoneDto.getSeq());
		model.addAttribute("item", naverphoneService.selectOne(naverphoneDto));
		return "naverphone/naverphoneXdmView";
	}
	
	@RequestMapping(value = "/naverphone/naverphoneXdmForm")
	public String naverphoneXdmForm() {
		
		return "naverphone/naverphoneXdmForm";
	}
	
	@RequestMapping(value = "/naverphone/naverphoneXdmInst")
	public String naverphoneXdmInst(NaverphoneDto naverphoneDto) {
		System.out.println("naverphoneDto.getSeq(): " + naverphoneDto.getSeq());
		System.out.println("naverphoneDto.getTelType(): " + naverphoneDto.getTelType());
		
		naverphoneService.insert(naverphoneDto);
		
		System.out.println("naverphoneDto.getSeq(): " + naverphoneDto.getSeq());
		
		return "redirect:/naverphone//naverphoneXdmList";
	}
}
