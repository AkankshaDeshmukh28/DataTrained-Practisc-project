package MiniProject;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
	
	HashSet<Employee> empset= new HashSet<Employee>();
	
	Employee emp1=new Employee(101,"Akshu",24,"IT","Developer",8999.0);
	Employee emp2=new Employee(102,"Saniya",26,"CEO","Developer",9000.0);
	Employee emp3=new Employee(103,"Anjali",34,"CO","Developer",8000.0);
	Employee emp4=new Employee(104,"Amar",84,"Admin","Developer",7000.0);
	
	Scanner sc = new Scanner(System.in);
	boolean fond = false;
	
	int id;
	String name;
	int age;
	String designation;
	String departement;
	double sal;

	private boolean found;
	
	public EmployeeService() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		
		
	}
// view all employee
	public void viewAllEmps() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
		
	}
	public void viewEmp() {
		
		System.out.println("Enter id");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found = true;
			}
		}
		if(!found) {
			System.out.println("Employee with this id is not present");
		}
	}
	public void updateEmp() {
		System.out.println("Enterid");
		id=sc.nextInt();
		boolean found = false;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter name :");
				name = sc.next();
				System.out.println("Enter new Salary :");
				sal = sc.nextDouble();
				emp.setName(name);
				emp.setSalary(sal);
				System.out.println("Updated detail of Employee are   ");
				System.out.println(emp);
				found=true;
				
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Employee details updated sccessfully");
		}
	}
	public void deleteEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found = false;
		Employee empdelete=null;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
				found=true;
			}
			
		}
		if(!found) {
			System.out.println("Employee is not available");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully");
		}
		
	}
	public void addEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter designation");
		designation=sc.next();
		System.out.println("Enter Depatretement");
		departement=sc.next();
		System.out.println("Enter salary");
		sc.nextDouble();
		
		Employee emp=new Employee(id,name,age,designation,departement,sal);
		
		
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employee added Successflly");
		
		
		
		
		
	}

	
	}


