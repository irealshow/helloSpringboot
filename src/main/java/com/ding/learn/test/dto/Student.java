package com.ding.learn.test.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.Objects;

@Data
public class Student {
	private Integer id;
	private String name;
	private String sex;
	@JsonProperty
	private String kCode;
	private Long age;
	private int intage;
	private Date createTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	public Student() {
		super();
	}
	public Student(Integer id, String name, String sex) {
		super();
//		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	/*@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}*/
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public int getIntage() {
		return intage;
	}
	public void setIntage(int intage) {
		this.intage = intage;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null) {
			return false;
		}
		if (getClass() != obj.getClass())
			return false;
		Student student = (Student) obj;
        return Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	public static void main(String[] args) {
		/*Student stu = new Student();
		if(stu.getId() != null && stu.getId() == 1) {
			System.out.println(111);
		} else {
			System.out.println(222);
		}*/
		Student stu = new Student();
		System.out.println(stu);
	}
	
}
