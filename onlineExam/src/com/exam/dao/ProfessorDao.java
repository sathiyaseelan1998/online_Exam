package com.exam.dao;

import java.util.List;

import com.exam.vo.ProfessorVo;

public interface ProfessorDao {

	int createProfessor(ProfessorVo professorVo);

	List<ProfessorVo> retriveAllProfessor();

	ProfessorVo edit(int id);

	ProfessorVo editProfessor(ProfessorVo professorVo);

	int deleteProfessor(int id);

}
