package com.springdemo;
//pojo plain old java object
public class Employee {
	private int empid;
	private String empname;
	private String department;
	
	private Address address;
	private Address add1;
	public Address getAdd1() {
		return add1;
	}
	public void setAdd1(Address add1) {
		this.add1 = add1;
	}
	public Employee(int empid, String empname, String department, Address address, Address add1) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.department = department;
		this.address = address;
		this.add1 = add1;
	}
	public Employee(int empid, String empname, String department, Address address) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.department = department;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", department=" + department + ", address="
				+ address + ", add1=" + add1 + "]";
	}
	
	

}
