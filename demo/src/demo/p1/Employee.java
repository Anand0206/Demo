package demo.p1;

public class Employee {
	private String FirstName;
	private String LastName;
	private Long id;
	
	Employee(String FirstName,String LastName,Long id)
	{
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.id=id;
	}
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
