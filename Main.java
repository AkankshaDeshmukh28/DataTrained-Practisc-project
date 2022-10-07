package MiniProject;

import java.util.Scanner;

public class Main {

	
		EmployeeService service = new EmployeeService();
		static boolean ordering =true;
		public static void menu() {
			System.out.println("*************Welcome To Employee Management System"
			+"\n1.Add Employee"
			+"\n2.view Employee"
			+"\n3. update Employee"
			+"\n4.Delete Employee"
			+"\n5. View All Employee"
			+"\n6. Exit");
		}
		public static void main (String[]args) {
			Scanner sc = new Scanner(System.in);
			EmployeeService service = new EmployeeService();
			
			
			do {
				menu();
			System.out.println("Enter your choice");
				int choice=sc.nextInt();
				switch(choice) {
				
				case 1:
					System.out.println("Add Employee");
					service.addEmp();
					break;
				case 2:	
					System.out.println("view Employee");
					service.viewEmp();
					break;
				case 3:	
					System.out.println("update Employee");
					service.updateEmp();
					break;
				case 4:	
					System.out.println("Delete Employee");
					service.deleteEmp();
					break;
				case 5:	
					System.out.println("View All Employee");
					service.viewAllEmps();
					break;
				case 6:	
					System.out.println("Thank you for using application!!");
					System.exit(0);
				
					
				default:
					System.out.println("Please enter valid choice");
					break;
				}
				
			}while(ordering);
			
			
		
}
		}



			
		



