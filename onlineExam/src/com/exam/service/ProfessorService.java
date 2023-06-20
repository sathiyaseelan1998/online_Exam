package com.exam.service;

import java.util.List;

import com.exam.bo.ProfessorBo;

public interface ProfessorService {

	int createProfessor(ProfessorBo professorBo);

	List<ProfessorBo> retriveAllProfessor();

}
