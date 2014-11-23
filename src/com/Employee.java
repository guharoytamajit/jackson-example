package com;

public class Employee {
	int eid;
	String name;
	Address address;

	public int getEid2() {
		return eid * 2;
	}

	public void setEid2(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(int eid, String name, Address address) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
	}

	public Employee() {
		super();
	}

}