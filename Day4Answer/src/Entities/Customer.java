package Entities;
import java.sql.Date;

import Abstract.IEntitiy;

public class Customer implements IEntitiy{//müþterilerimiz için sýnýf
	public int id;
	public String firstName;
	public String lastName;
	public int dateOfBirth;
	public String nationlityId;
	
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationlityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationlityId = nationlityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationlityId() {
		return nationlityId;
	}
	public void setNationlityId(String nationlityId) {
		this.nationlityId = nationlityId;
	}
}
