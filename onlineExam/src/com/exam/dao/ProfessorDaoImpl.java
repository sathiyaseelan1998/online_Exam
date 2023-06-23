package com.exam.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.vo.LoginVo;
import com.exam.vo.ProfessorVo;

@Repository
public class ProfessorDaoImpl implements ProfessorDao {
	@Autowired
	SessionFactory sf;
	
	 ProfessorVo  professorVo=new  ProfessorVo();
	 LoginVo loginVo=new LoginVo();
	@Override
	public int createProfessor(ProfessorVo professorVo) {
		// TODO Auto-generated method stub
		int id=0;
		try {
			Session session=sf.getCurrentSession();
			id=(int) session.save(professorVo);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return id;
	}
	@Override
	public List<ProfessorVo> retriveAllProfessor() {
		// TODO Auto-generated method stub
		List<ProfessorVo> list=new ArrayList<ProfessorVo>();
		try {
			Session session=sf.getCurrentSession();
			Criteria cr=session.createCriteria(ProfessorVo.class);
			/*cr.setProjection(Projections.rowCount());
			Long count= (Long) cr.uniqueResult();
			System.out.println(count);*/
			list=cr.list();
			cr.setProjection(Projections.rowCount());
			Long count= (Long) cr.uniqueResult();
			System.out.println(count);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return list;
	}
	@Override
	public ProfessorVo edit(int id) {
		// TODO Auto-generated method stub
		 ProfessorVo  professorVo=new  ProfessorVo();
		try {
			Session session=sf.getCurrentSession();
			Criteria cr=session.createCriteria(ProfessorVo.class);
			cr.add(Restrictions.eq("id", id));
			professorVo=(ProfessorVo) cr.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return professorVo;
	}
	@Override
	public ProfessorVo editProfessor(ProfessorVo professorVo) {
		// TODO Auto-generated method stub
		try {
			Session session=sf.getCurrentSession();
			session.update(professorVo);
			if(null!=professorVo){
				Criteria cr=session.createCriteria(ProfessorVo.class);
				cr.add(Restrictions.eq("id", professorVo.getId()));
				professorVo=(ProfessorVo) cr.uniqueResult();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return professorVo;
	}
	@Override
	public int deleteProfessor(int id) {
		// TODO Auto-generated method stub
		ProfessorVo  professorVo=new  ProfessorVo();
		professorVo.setId(id);
		int pId=0;
		try {
			Session session=sf.getCurrentSession();
			session.delete(professorVo);
			if(professorVo.getId()>0){
				pId=professorVo.getId();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return pId;
	}
	@Override
	public int createLogin(LoginVo loginVo) {
		// TODO Auto-generated method stub
		int loginId=0;
		try {
			Session session=sf.getCurrentSession();
			loginId=(int) session.save(loginVo);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return loginId;
	}
	@Override
	public LoginVo login(String email, String password) {
		// TODO Auto-generated method stub
		
		try {
			Session session=sf.getCurrentSession();
			Criteria cr=session.createCriteria(LoginVo.class);
			cr.add(Restrictions.eq("email", email));
			cr.add(Restrictions.eq("password", password));
			loginVo=(LoginVo) cr.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return loginVo;
	}

}
