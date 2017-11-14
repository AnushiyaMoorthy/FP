package org.dummy.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Transient;

@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class Employee {
	@Id
	@Column(name = "EMP_ID")
	@GeneratedValue
	private int id;
	@Column(name = "EMP_NAME", length = 150, nullable = false)
	private String name;
	@Column(name = "EMAIL_ID", unique = true)
	private String email;
	@Column(name = "PHONE_NO", unique = true, nullable = false)
	private long phone;
	@Column(name = "BASIC_SALARY")
	private double basicSalary;
	@Column(name = "TA")
	private float travellingAllowance;
	@Column(name = "DA")
	private float dearnessAllowance;
	@Column(name = "HRA")
	private float HousingRentAllowance;
	@Column(name = "PF")
	private float providentFund;
	@Transient
	private double netSalary;

	public Employee(String name, String email, long phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}
