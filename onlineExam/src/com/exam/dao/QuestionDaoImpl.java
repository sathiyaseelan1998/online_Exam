package com.exam.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.vo.QuestionVo;

@Repository
public class QuestionDaoImpl implements QuestionDao {
	@Autowired
	SessionFactory sf;
	@Override
	public int createQuestion(QuestionVo questionVo) {
		// TODO Auto-generated method stub
		int id=0;
		try {
			Session session=sf.getCurrentSession();
			id=(int) session.save(questionVo);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return id;
	}
	@Override
	public List<QuestionVo> viewQuestion() {
		// TODO Auto-generated method stub
		List<QuestionVo> listVo=new ArrayList<>();
		try {
			Session session=sf.getCurrentSession();
			Criteria cr=session.createCriteria(QuestionVo.class);
			listVo=cr.list();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return listVo;
	}
	
}
