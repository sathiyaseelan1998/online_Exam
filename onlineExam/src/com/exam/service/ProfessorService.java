package com.exam.service;

import java.util.List;

import com.exam.bo.ProfessorBo;

public interface ProfessorService {

	int createProfessor(ProfessorBo professorBo);

	List<ProfessorBo> retriveAllProfessor();

	ProfessorBo edit(int id);

	ProfessorBo editProfessor(ProfessorBo bo);

	int deleteProfessor(int id);

}
