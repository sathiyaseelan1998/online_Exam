package com.exam.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.bo.LoginBo;
import com.exam.bo.ProfessorBo;
import com.exam.dao.ProfessorDao;
import com.exam.vo.LoginVo;
import com.exam.vo.ProfessorVo;


@Service
@Transactional
public class ProfessorServiceImpl implements ProfessorService{
	@Autowired
	ProfessorDao professorDao;
	
	ProfessorVo professorVo=new ProfessorVo();
	LoginVo loginVo=new LoginVo();
	@Override
	public int createProfessor(ProfessorBo professorBo) {
		// TODO Auto-generated method stub
		professorVo.setName(professorBo.getName());
		professorVo.setEmail(professorBo.getEmail());
		professorVo.setConfirmEmail(professorBo.getConfirmEmail());
		professorVo.setPassword(professorBo.getPassword());
		professorVo.setConfirmPassword(professorBo.getConfirmPassword());
		professorVo.setMobile(professorBo.getMobile());
		professorVo.setUserRole("professor");
		int id=professorDao.createProfessor(professorVo);
		if(id>0){
			LoginVo loginVo=new LoginVo();
			loginVo.setEmail(professorBo.getEmail());
			loginVo.setConfirmEmail(professorBo.getConfirmEmail());
			loginVo.setPassword(professorBo.getPassword());
			loginVo.setConfirmPassword(professorBo.getConfirmPassword());
			loginVo.setUserRole("professor");
			professorVo.setId(id);
			loginVo.setProfessorVo(professorVo);
			
			int loginId=professorDao.createLogin(loginVo);
		}
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
				bo.setUserRole(vo.getUserRole());
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
	@Override
	public LoginBo login(String email, String password) {
		// TODO Auto-generated method stub
		loginVo=professorDao.login(email,password);
		LoginBo loginBo=new LoginBo();
		loginBo.setEmail(loginVo.getEmail());
		loginBo.setPassword(loginVo.getPassword());
		loginBo.setUserRole(loginVo.getUserRole());
		return loginBo;
	}

}
