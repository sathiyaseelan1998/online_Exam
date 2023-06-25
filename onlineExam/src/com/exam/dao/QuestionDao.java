package com.exam.dao;

import java.util.List;

import com.exam.vo.QuestionVo;

public interface QuestionDao {

	int createQuestion(QuestionVo questionVo);

	List<QuestionVo> viewQuestion();

}
