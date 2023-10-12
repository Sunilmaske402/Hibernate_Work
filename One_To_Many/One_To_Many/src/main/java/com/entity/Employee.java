package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "emp123")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Emp_ID")
private int empid;
	@Column(name = "Emp_Name")
private String empName;
	@ManyToOne
	@JoinColumn(name="depid")
private Department department12;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empName, Department empDepartment) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.department12 = empDepartment;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getEmpDepartment() {
		return department12;
	}
	public void setEmpDepartment(Department dept) {
		this.department12 = dept;
	}
}
