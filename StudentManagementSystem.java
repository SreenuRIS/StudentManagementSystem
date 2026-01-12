import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManagementSystem {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		StudentService service=new StudentService();
		
		while(true)
		{
			System.out.println();
			System.out.println("-----Student Management System-----");
			System.out.println();
			System.out.println("1. Add Student");
			System.out.println("2. view Students");
			System.out.println("3. Search student");
			System.out.println("4. Update Students");
			System.out.println("5. Delete Students");
			System.out.println("6. Exit");
			System.out.println("Enter your choice:");

			try
			{
				int choice=sc.nextInt();
				
				switch(choice)
				{
				case 1:
					service.addStudent();
					break;
				case 2:
					service.viewStudent();
					break;
				case 3:
					service.searchStudent();
					break;
				case 4:
					service.updateStudent();
					break;
				case 5:
					service.deleteStudent();
					break;
					
				case 6:
					System.out.println(".....Thanks for application!.....");
                    System.exit(0);
				default:
						System.out.println("Invalid choice! Try again.");	
						break;
				} 
			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid input! Please enter numbers only.");
			}
		}			
	}	
}
