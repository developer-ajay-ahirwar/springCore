package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String empName;
	private List<String> phoneNums;
	private Set<String> addresss;
	private Map<String , String> courses;
	private Properties perops;
	
	
	
	
	public String getempName() {
		return empName;
	}
	public void setempName(String name) {
		this.empName = name;
	}
	public List<String> getPhoneNums() {
		return phoneNums;
	}
	public void setPhoneNums(List<String> phoneNums) {
		this.phoneNums = phoneNums;
	}
	public Set<String> getAddresss() {
		return addresss;
	}
	public void setAddresss(Set<String> addresss) {
		this.addresss = addresss;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getPerops() {
		return perops;
	}
	public void setPerops(Properties perops) {
		this.perops = perops;
	}
	
	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", phoneNums=" + phoneNums + ", addresss=" + addresss + ", courses="
				+ courses + "]";
	}
}
