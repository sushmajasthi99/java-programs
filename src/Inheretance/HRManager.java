package Inheretance;
import java.util.*;
public class HRManager extends Employee {

	public HRManager(String name, int id, double salary) {
		super(name, id, salary);
	}
	
	@Override
	public void work() {
		System.out.println(getName()+" is HR...");
	}
	public void addEmployee(String name,int id,double salary) {
		System.out.println("Added new employee:" +name+" Employee id"+id+"with salary $"+ salary);
	}
	public static void main(String[] args) {
		Employee em=new Employee("sushma",18,500000);
		em.work();
		System.out.println("Employee salary:$" +em.getSalary());
		
		HRManager hr=new HRManager("ravi",24,100000);
		hr.work();
		System.out.println("HR Manager salary:$"+hr.getSalary());
		hr.addEmployee("lakshmi",24,500000);	
	}
}
