package com.exam.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.bo.ProfessorBo;
import com.exam.dao.ProfessorDao;
import com.exam.vo.ProfessorVo;


@Service
@Transactional
public class ProfessorServiceImpl implements ProfessorService{
	@Autowired
	ProfessorDao professorDao;
	
	ProfessorVo professorVo=new ProfessorVo();
	@Override
	public int createProfessor(ProfessorBo professorBo) {
		// TODO Auto-generated method stub
		professorVo.setName(professorBo.getName());
		professorVo.setEmail(professorBo.getEmail());
		professorVo.setConfirmEmail(professorBo.getConfirmEmail());
		professorVo.setPassword(professorBo.getPassword());
		professorVo.setConfirmPassword(professorBo.getConfirmPassword());
		professorVo.setMobile(professorBo.getMobile());
		int id=professorDao.createProfessor(professorVo);
		return id;
	}

}
