package com.exam.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.vo.ProfessorVo;

@Repository
public class ProfessorDaoImpl implements ProfessorDao {
	@Autowired
	SessionFactory sf;
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
			list=cr.list();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return list;
	}

}
