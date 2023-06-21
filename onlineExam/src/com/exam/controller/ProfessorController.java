package com.exam.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.exam.bo.ProfessorBo;
import com.exam.service.ProfessorService;

@Controller
public class ProfessorController {
	@Autowired
	ProfessorService professorService;
	
	ProfessorBo professorBo=new ProfessorBo();
	
	@RequestMapping(value="create",method=RequestMethod.GET)
	public String create(Model model){
		model.addAttribute("professorBo", professorBo);
		return "createProfessor";
	}
	
	@RequestMapping(value="createProfessor",method=RequestMethod.POST)
	public String createProfessor(@ModelAttribute("professorBo")ProfessorBo professorBo,Model model){
		int id=professorService.createProfessor(professorBo);
		return "createProfessor";
	}
	@RequestMapping(value="view",method=RequestMethod.GET)
	public String retriveAllProfessor(Model model){
		List<ProfessorBo> list=new ArrayList<ProfessorBo>();
		list=professorService.retriveAllProfessor();
		model.addAttribute("list", list);
		return "viewProfessor";
	}
	@RequestMapping(value="edit",method=RequestMethod.GET)
	public String edit(@RequestParam("id")int id,Model model){
		
		professorBo=professorService.edit(id);
		
		model.addAttribute("professorBo", professorBo);
		
		return "editProfessor";
	}
	@RequestMapping(value="editProfessor",method=RequestMethod.POST)
	public String editProfessor(@ModelAttribute("professorBo")ProfessorBo bo,Model model){
		professorBo=professorService.editProfessor(bo);
		return "editProfessor";
	}
	@RequestMapping(value="delete",method=RequestMethod.GET)
	public String deleteProfessor(@RequestParam("id") int id,Model model){
		int pId=professorService.deleteProfessor(id);
		return "redirect:/view";
	}
}
