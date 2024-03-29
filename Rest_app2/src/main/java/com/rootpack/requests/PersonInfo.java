package com.rootpack.requests;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person-Info")
public class PersonInfo {
	private String name;
	private Integer age;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "PersonInfo [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
