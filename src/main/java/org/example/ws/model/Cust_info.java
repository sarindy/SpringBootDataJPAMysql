package org.example.ws.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cust_info")
public class Cust_info {
	
	@Id
	@GeneratedValue
	private long recid;
	
	private String firstname;
	private String lastname;
	
	
	private Date dateofbirth;
	

	private String nationality;
	private int sector;
	private String contact;
	private String email;
	private String address;
	
	public Cust_info(){}

	public Cust_info(long id, String firstname, String lastname, Date dateofbirth, String nationality, int sector,
			String contact, String email, String address) {
		
		this.recid = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateofbirth = dateofbirth;
		this.nationality = nationality;
		this.sector = sector;
		this.contact = contact;
		this.email = email;
		this.address = address;
	}

	public long getRecid() {
		return recid;
	}

	public void setRecid(long recid) {
		this.recid = recid;
	}

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getdateofbirth() {
		return dateofbirth;
	}

	public void setdateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getSector() {
		return sector;
	}

	public void setSector(int sector) {
		this.sector = sector;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	
	
	
	
	
	

}
