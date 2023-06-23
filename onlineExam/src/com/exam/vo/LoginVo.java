package com.exam.vo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.exam.bo.ProfessorBo;
@Entity
@Table(name="login")
public class LoginVo {
	@Id
	@GeneratedValue
	private int loginId;
	private String email;
	private String confirmEmail;
	private String password;
	private String confirmPassword;
	private String userRole;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="profId")
	private ProfessorVo professorVo;
	public ProfessorVo getProfessorVo() {
		return professorVo;
	}
	public void setProfessorVo(ProfessorVo professorVo) {
		this.professorVo = professorVo;
	}
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
}
