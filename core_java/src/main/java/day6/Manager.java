package day6;

public class Manager extends Employee {
	private double salary;
	public Manager() {
	}
	
	public Manager(String name, int emp_id, String dept, double salary ) {
		super(name, emp_id,dept);
		this.salary = salary;
	}
	
	public void employeeDetails(){
		super.employeDetails();
		System.out.print(this.salary);
	}

	@Override
	public String toString() {
		return super.toString() + "Manager [salary=" + salary + "]";
	}
	
}
