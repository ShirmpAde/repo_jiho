package com.jeongjiho.fapp.addcontact;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class AddcontactController {
	
//	@RequestMapping(value = "/addcontact/addcontactXdmList")
//	public String codeGroupXdmList(Model model) {
//		List<AddcontactDto> addcontactDtos = new ArrayList<>();
//		model.addAttribute("list", addcontactDtos);
//		return "addcontact/addcontactXdmList";
//	}
	
	
	@Autowired
	AddcontactService addcontactService;
	
	@RequestMapping(value = "/addcontact/addcontactXdmList")
	public String addcontactXdmList(Model model) {
		model.addAttribute("list", addcontactService.selectList());
		return "addcontact/addcontactXdmList";
	}
	
	@RequestMapping(value = "/addcontact/addcontactXdmView")
	public String addcontactXdmView(Model model, AddcontactDto addcontactDto) {
		System.out.println("addcontactDto.getSeq(): " + addcontactDto.getSeq());
		model.addAttribute("item", addcontactService.selectOne(addcontactDto));
		return "addcontact/addcontactXdmView";
	}
	
	@RequestMapping(value = "/addcontact/addcontactXdmForm")
	public String addcontactXdmForm() {
		
		return "addcontact/addcontactXdmForm";
	}
	
	@RequestMapping(value = "/addcontact/addcontactXdmInst")
	public String addcontactXdmInst(AddcontactDto addcontactDto) {
		System.out.println("addcontactDto.getSeq(): " + addcontactDto.getSeq());
		System.out.println("addcontactDto.getLastname(): " + addcontactDto.getLastName());
		
		addcontactService.insert(addcontactDto);
		
		System.out.println("addcontactDto.getSeq(): " + addcontactDto.getSeq());
		
		return "redirect:/addcontact//addcontactXdmList";
	}
}