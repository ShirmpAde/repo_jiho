package com.jeongjiho.fapp.naverbirthday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeongjiho.fapp.naveradress.NaveradressDto;

@Controller
public class NaverbirthdayController {
	@Autowired
	NaverbirthdayService naverbirthdayService;
				
	@RequestMapping(value = "/naverbirthday/naverbirthdayXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", naverbirthdayService.selectList());
		return "naverbirthday/naverbirthdayXdmList";
	}
	
	@RequestMapping(value = "/naverbirthday/naverbirthdayXdmView")
	public String naverbirthdayXdmList(Model model, NaverbirthdayDto naverbirthdayDto) {
		System.out.println("naverbirthdayDto.getSeq(): " + naverbirthdayDto.getSeq());
		model.addAttribute("item", naverbirthdayService.selectOne(naverbirthdayDto));
		return "naverbirthday/naverbirthdayXdmView";
	}
	
	@RequestMapping(value = "/naverbirthday/naverbirthdayXdmForm")
	public String naverbirthdayXdmForm() {
		
		return "naverbirthday/naverbirthdayXdmForm";
	}
	
	@RequestMapping(value = "/naverbirthday/naverbirthdayXdmInst")
	public String naverbirthdayXdmInst(NaverbirthdayDto naverbirthdayDto) {
		System.out.println("naverbirthdayDto.getSeq(): " + naverbirthdayDto.getSeq());
		System.out.println("naverbirthdayDto.getDateType(): " + naverbirthdayDto.getDateType());
		
		naverbirthdayService.insert(naverbirthdayDto);
		
		System.out.println("naverbirthdayDto.getSeq(): " + naverbirthdayDto.getSeq());
		
		return "redirect:/naverbirthday//naverbirthdayXdmList";
	}
}
