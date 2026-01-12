import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentService{
	
	Scanner sc=new Scanner(System.in);
	
	Student student[]=new Student[100];
	int count=0; // its for students count..
	
	void addStudent()
	{
		Student s=new Student();
		try
		{
			System.out.println("Enter Id:");
			s.id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Name:");
			s.name=sc.nextLine();
			
			System.out.println("Enter Age:");
			s.age=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Training:");
			s.course=sc.nextLine();
			
			student[count]=s;
			count++;
			
			System.out.println("Student is successfully added");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Inavlid input, No students found.");
		}
	}
	
	//  view students details//
	
	void viewStudent()
	{
		if(count==0)
		{
			System.out.println("Student is not found");
			return;
		}
		for(int i=0;i<count;i++)
		{
			System.out.println("[Id:"+ student[i].id +
					", Name:"+student[i].name +
					", Age:"+ student[i].age +
					", Training:"+ student[i].course +"]");
					
		} 
	}
	
	
	// search by id students details//
	
	void searchStudent()
	{
		System.out.println("Enter the student ID to search:");
		int id=sc.nextInt();
		
		for(int i=0;i<count;i++)
		{
			if(student[i].id==id)
			{
				System.out.println("[Id:"+ student[i].id +
						", Name:"+student[i].name +
						", Age:"+ student[i].age +
						", Training:"+ student[i].course +"]");
				return;
			}
		}
		System.out.println("Students not found.");
	}
	
	
	//  update the students details//
	
	void updateStudent()
	{
		System.out.println("Enter the student ID to search:");
		int id=sc.nextInt();
		
		for(int i=0;i<count;i++)
		{
			if(student[i].id==id)
			{
				sc.nextLine();
				System.out.println("Enter new Name:");
				student[i].name=sc.nextLine();
				
				System.out.println("Enter new Age:");
				student[i].age=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter new Training:");
				student[i].course=sc.nextLine();
				
				System.out.println("Updated successfully !....");
			}
		}
	}
	
	
	
	// Delete the students//
	
	
	void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (student[i].id == id) {

                for (int j = i; j < count - 1; j++) {
                    student[j] = student[j + 1];
                }
                student[count - 1] = null;
                count--;

                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
	
