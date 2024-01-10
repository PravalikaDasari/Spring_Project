package com.feuji.beans;

import javax.validation.constraints.NotEmpty;

public class Candidate 
{
//	@NotNull(message = "it is required")
	private Integer refId;
	
	@NotEmpty(message = "name is required")
	private String name;
	private String gender;

	
	public Integer getRefId() {
		return refId;
	}

	public void setRefId(Integer refId) {
		this.refId = refId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Candidate [refId=" + refId + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
}
