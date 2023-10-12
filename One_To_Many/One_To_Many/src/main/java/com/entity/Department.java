package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	@Id
	@Column(name = "Dept_Id")
private int id;
	@Column(name = "deptname")
private String deptname;
	@OneToMany(mappedBy = "department12", cascade = CascadeType.ALL)
private List <Employee> employees = new ArrayList<Employee>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Department(int id, String deptname) {
		super();
		this.id = id;
		this.deptname = deptname;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

