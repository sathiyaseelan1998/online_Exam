package com.exam.vo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="question")
public class QuestionVo {
	@Id
	@GeneratedValue
	private int quesId;
	private String question;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<AnswerVo> answerVo;
	public int getQuesId() {
		return quesId;
	}
	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<AnswerVo> getAnswerVo() {
		return answerVo;
	}
	public void setAnswerVo(List<AnswerVo> answerVo) {
		this.answerVo = answerVo;
	}
}
