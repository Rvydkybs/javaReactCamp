import java.util.Date;

public class Customer implements ICustomer {
	public String firstName;
	public String lastName;
	public String id;
	public String dateOfBirth;
	
	public void Customer( String id,String firstName,String lastName,String dateOfBirth) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.dateOfBirth=dateOfBirth;
		this.id=id;
	}
	@Override
	public void add(CustomerManager customerManager) {
		
		
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
