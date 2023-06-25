package com.exam.service;

import java.util.List;

import com.exam.bo.QuestionBo;

public interface QuestionService {

	int createQuestion(QuestionBo bo);

	List<QuestionBo> viewQuestion();

}
