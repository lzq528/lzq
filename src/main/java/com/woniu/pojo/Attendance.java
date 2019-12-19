package com.woniu.pojo;
// Generated 2019-12-19 19:49:17 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
 
/**
 * Attendance generated by hbm2java
 */
public class Attendance implements java.io.Serializable {

	private Integer aid;
	private String astatus;
	private Set<Student> students = new HashSet<Student>(0);
	private Set clazzs = new HashSet(0);

	public Attendance() {
	}

	public Attendance(String astatus) {
		this.astatus = astatus;
	}

	public Attendance(String astatus, Set students, Set clazzs) {
		this.astatus = astatus;
		this.students = students;
		this.clazzs = clazzs;
	}

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAstatus() {
		return this.astatus;
	}

	public void setAstatus(String astatus) {
		this.astatus = astatus;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

	public Set getClazzs() {
		return this.clazzs;
	}

	public void setClazzs(Set clazzs) {
		this.clazzs = clazzs;
	}

}
