Student Management System (Core Java)

 Overview

The Student Management System is a menu‑driven Core Java console application that allows users to manage student records efficiently. The application demonstrates strong usage of OOP concepts, exception handling, and collections.

This system enables users to add, view, search, update, and delete student details using a simple interactive menu.

---

🛠️ Technologies Used

* Java (Core Java)
* OOP Concepts
* Exception Handling
* Collections (ArrayList)
* Scanner Class

---

🎯 Features

* Add new student details
* View all students
* Search student by ID
* Update student details
* Delete student record
* Input validation using exception handling
* Menu‑driven user interface

---
 🧱 Project Structure
 
StudentManagementSystem

 1️⃣ StudentManagementSystem.java

* Acts as the **entry point** of the application
* Displays menu options
* Handles user choices
* Calls respective methods from `StudentService`
* Handles invalid inputs using `InputMismatchException`

 2️⃣ Student.java

* Represents the student entity
* Contains student attributes like ID, Name, Age, Course, etc.
* Uses **encapsulation** (private variables + getters/setters)

 3️⃣ StudentService.java

* Contains all **CRUD operations**
* Uses `ArrayList<Student>` to store data
* Methods include:

  * addStudent()
  * viewStudent()
  * searchStudent()
  * updateStudent()
  * deleteStudent()

---
▶️ How to Run the Application

1. Open any Java IDE (Eclipse / IntelliJ / VS Code)
2. Create a Java project
3. Add all `.java` files to the same package
4. Compile and run `StudentManagementSystem.java`

---
📌 Sample Menu Output

----- Student Management System -----
1. Add Student
2. View Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
Enter your choice:

⚠️ Exception Handling

* Handles invalid inputs using `InputMismatchException`
* Prevents application crash on wrong data entry

✅ Conclusion

This project is ideal for **Java beginners** to understand:

* OOP principles
* Menu‑driven programs
* Real‑time CRUD operations
* Exception handling in Java


