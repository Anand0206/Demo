package demo.p1;

import java.util.LinkedList;

public class linkdemo extends Employee {

    linkdemo(String FirstName, String LastName, Long id) {
		super(FirstName, LastName, id);
		
        	}

public static void main(String[] args) {
	
	
	Employee emp1=new Employee("Anand","Nandudkar",100l);
	Employee emp2=new Employee("Hrithik","Patil",101l);
	Employee emp3=new Employee("Sunil","Desai",103l);
	LinkedList<Employee> empdetails =new LinkedList<Employee>();
	empdetails.add(emp1);
	empdetails.add(emp2);
	empdetails.add(emp3);
	for(Employee empl:empdetails) {
		System.out.print(empl.getFirstName()+" ");
		System.out.print(empl.getLastName()+" ");
		System.out.println(empl.getId()+" ");
	}
  }
}
