package com.exam.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.bo.QuestionBo;
import com.exam.dao.QuestionDao;
import com.exam.vo.AnswerVo;
import com.exam.vo.QuestionVo;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {
	@Autowired
	QuestionDao questionDao;
	
	QuestionVo questionVo=new QuestionVo();

	@Override
	public int createQuestion(QuestionBo bo) {
		// TODO Auto-generated method stub
		questionVo.setQuestion(bo.getQuestion());
		List<String> list=new ArrayList<>();
		list.add(bo.getAnswer1());
		list.add(bo.getAnswer2());
		list.add(bo.getAnswer3());
		list.add(bo.getAnswer4());
		bo.setOptionList(list);
		//String str[]=bo.getOptionlist().toArray(new String[3]);
		String str[]=bo.getOptionList().toArray(new String[list.size()]);
		bo.setOption(str);
		List<AnswerVo> answerList=new ArrayList<>();
		AnswerVo answerVo=new AnswerVo();
		
		for(String ans:list){
			answerVo.setAnswer(ans);
			answerList.add(answerVo);
		}
		questionVo.setAnswerVo(answerList);
		int id=questionDao.createQuestion(questionVo);
		return 0;
	}

}
