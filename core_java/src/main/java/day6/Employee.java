package day6;

public class Employee {
	private String name;
	private int emp_id;
	private String dept;
	//private double salary;
	
	Employee(){
	}
	
	Employee(String name, int emp_id, String dept){
		super();
		this.name = name;
		this.emp_id = emp_id;
		this.dept = dept;
		//this.salary = salary;
	}
	
	public void employeDetails(){
		System.out.println(this.name+ " "+this.emp_id+" "+this.dept+" ");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", emp_id=" + emp_id + ", dept=" + dept + "]";
	}
	
}
