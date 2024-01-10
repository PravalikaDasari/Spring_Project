package com.feuji.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidate")
public class CandidateEntity {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "refId")
	private Integer refId;

	@Column(name = "Name")
	private String name;

	@Column(name = "Gender")
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
