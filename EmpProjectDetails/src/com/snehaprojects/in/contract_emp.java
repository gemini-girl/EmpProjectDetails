package com.snehaprojects.in;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="contract_employee")
public class contract_emp extends EmpDetails {
	private int salary;
	private int duration;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}
