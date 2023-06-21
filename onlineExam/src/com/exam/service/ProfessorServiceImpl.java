package com.exam.service;

import java.util.ArrayList;
import java.util.List;

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
	@Override
	public List<ProfessorBo> retriveAllProfessor() {
		// TODO Auto-generated method stub
		List<ProfessorBo> listBo=new ArrayList<ProfessorBo>();
		List<ProfessorVo> listVo=new ArrayList<ProfessorVo>();
		listVo=professorDao.retriveAllProfessor();
		if(listVo!=null){
			for(ProfessorVo vo:listVo){
				ProfessorBo bo=new ProfessorBo();
				bo.setId(vo.getId());
				bo.setName(vo.getName());
				bo.setEmail(vo.getEmail());
				bo.setConfirmEmail(vo.getConfirmEmail());
				bo.setPassword(vo.getPassword());
				bo.setConfirmPassword(vo.getConfirmPassword());
				bo.setMobile(vo.getMobile());
				
				listBo.add(bo);
			}
			
		}
		return listBo;
	}
	@Override
	public ProfessorBo edit(int id) {
		// TODO Auto-generated method stub
		ProfessorVo vo=new ProfessorVo();
		vo=professorDao.edit(id);
		ProfessorBo bo=new ProfessorBo();
		bo.setId(vo.getId());
		bo.setName(vo.getName());
		bo.setEmail(vo.getEmail());
		bo.setConfirmEmail(vo.getConfirmEmail());
		bo.setPassword(vo.getPassword());
		bo.setConfirmPassword(vo.getConfirmPassword());
		bo.setMobile(vo.getMobile());
		return bo;
	}
	@Override
	public ProfessorBo editProfessor(ProfessorBo professorBo) {
		// TODO Auto-generated method stub
		ProfessorVo vo=new ProfessorVo();
		professorVo.setId(professorBo.getId());
		professorVo.setName(professorBo.getName());
		professorVo.setEmail(professorBo.getEmail());
		professorVo.setConfirmEmail(professorBo.getConfirmEmail());
		professorVo.setPassword(professorBo.getPassword());
		professorVo.setConfirmPassword(professorBo.getConfirmPassword());
		professorVo.setMobile(professorBo.getMobile());
		vo=professorDao.editProfessor(professorVo);
		
		ProfessorBo bo=new ProfessorBo();
		bo.setId(vo.getId());
		bo.setName(vo.getName());
		bo.setEmail(vo.getEmail());
		bo.setConfirmEmail(vo.getConfirmEmail());
		bo.setPassword(vo.getPassword());
		bo.setConfirmPassword(vo.getConfirmPassword());
		bo.setMobile(vo.getMobile());
		return bo;
	}
	@Override
	public int deleteProfessor(int id) {
		// TODO Auto-generated method stub
		int pId=professorDao.deleteProfessor(id);
		return pId;
	}

}
