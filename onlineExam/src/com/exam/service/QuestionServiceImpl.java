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
		
		for(String ans:list){
			AnswerVo answerVo=new AnswerVo();
			if(ans==str[0]){
				answerVo.setCorrectAns(1);
			}
			answerVo.setAnswer(ans);
			answerList.add(answerVo);
		}
		questionVo.setAnswerVo(answerList);
		int id=questionDao.createQuestion(questionVo);
		return 0;
	}

	@Override
	public List<QuestionBo> viewQuestion() {
		// TODO Auto-generated method stub
		List<QuestionVo> listVo=new ArrayList<>();
		List<QuestionBo> listBo=new ArrayList<>();
		List<String> strBo=new ArrayList<>();
		listVo=questionDao.viewQuestion();
		for(QuestionVo vo:listVo){
			QuestionBo bo=new QuestionBo();
			bo.setQuestion(vo.getQuestion());
			List<AnswerVo> answerList=vo.getAnswerVo();
			for(int i=0;i<answerList.size();i++){
			AnswerVo ans=new AnswerVo();
			ans=answerList.get(i);
			bo.setAnswer1(ans.getAnswer());
			for(String ss:bo.getOption()){
				strBo.add(ss);
			}
			}
		}
		return null;
	}

}
