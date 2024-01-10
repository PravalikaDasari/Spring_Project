package com.feuji.beans;

public class FeujiSolutions 
{
	private String companyName;
	private String location;
	private Integer count;

	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "FeujiSolutions [companyName=" + companyName + ", location=" + location + ", count=" + count + "]";
	}
	
	
	
}
