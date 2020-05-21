package com.connect.postgres.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{

	@Id
	@Column(name="eid")
	private Integer eid;
	
	@Column(name="did")
	private Integer did;
	
	@Column(name="ename")
	private String ename;

	public Employee() 
	{
		super();
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", did=" + did + ", ename=" + ename + "]";
	}
	
}
