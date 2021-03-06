package com.AG.entity;

import java.util.List;

public class Exam {
	private List<Expression> examList;
	private List<String> resultList;

	public Exam() {
		super();
	}

	public Exam(List<Expression> examList, List<String> resultList) {
		super();
		this.examList = examList;
		this.resultList = resultList;
	}

	public List<String> getResultList() {
		return resultList;
	}

	public void setResultList(List<String> resultList) {
		this.resultList = resultList;
	}

	public List<Expression> getExamList() {
		return examList;
	}

	public void setExamList(List<Expression> examList) {
		this.examList = examList;
	}

}
