# Enrollment-Management-System

## Student Enrollment System 

The Student Enrollment System is a console-based Java application designed to simplify and organize the process of managing student course registrations. It allows users to add, view, edit, and delete courses, as well as enroll students into selected subjects. The system also provides functionality for handling payments and tracking enrollment status, ensuring that both academic and financial records are maintained accurately. By automating these tasks, the system reduces manual effort, minimizes errors, and improves efficiency in managing student information. With its straightforward menu-driven interface, this application is ideal for small institutions or school projects that require a reliable and easy-to-use enrollment management solution.

## OOP Concepts Applied

**This program uses basic Object Oriented Programming ideas to keep the enrollment system organized. Encapsulation is shown in the Student class which stores all information about a student in one place, while the CourseManager class handles all course-related operations such as adding, editing, and deleting courses. The EnrollmentManager class manages enrollment and payment processes. This also demonstrates abstraction because the main program only calls simple methods like addCourse, enrollToCourses, or processPayment without needing to know the internal details of how these tasks are implemented.

**The system follows the Single Responsibility Principle. The Student class holds student data, CourseManager manages course records, EnrollmentManager handles enrollment and payment, and the Main class manages user interaction through the console menu. This separation makes the program more modular, easier to maintain, and simpler to update in the future. The methods in CourseManager and EnrollmentManager are also reusable because they can work with any Student object and course list. Although the current version does not use inheritance or interfaces yet, these can be added later to support more advanced features such as different types of students (e.g., undergraduate vs. graduate) or multiple payment methods.**

## Program Structure

**The program is divided into three main classes, each with a specific role. The Student class  stores all student information such as name and year level. The CourseManager class handles all course-related operations, including adding, viewing, editing, and deleting courses. The EnrollmentManager class manages the enrollment process, payment transactions, and tracks the student’s enrolled courses and payment status. Finally, the Main class serves as the console interface, reading user input, creating Student objects, and coordinating actions by calling methods from CourseManager and EnrollmentManager to execute the requested operations.**

## How to Run the Program

Step 1: The program starts when you run
The main() method begins. A Scanner is created to read user input, and objects for Student, CourseManager, and EnrollmentManager are initialized.

Step 2: The main menu is displayed. The program shows the enrollment menu containing eight choices:

1.Add Course

2.View Courses

3.Edit Course

4.Delete Course

5.Enroll to Courses

6.Payment and Transaction

7.View Enrolled Courses and Payment Status

8.Exit

It then waits for the user to input a number. This happens inside a while(true) loop so the menu continues to appear until the user chooses Exit.

Step 3: If the user selects 1 (Add Course) The program asks for course details such as course code, course name, and units. A new Course object is created and stored in the course list managed by CourseManager.

Step 4: If the user selects 2 (View Courses) The program prints all available courses stored in the course list. If no courses exist, it displays “No courses available.”

Step 5: If the user selects 3 (Edit Course) The program asks the user to choose a course to edit, then allows updating its details (e.g., course name or units). The changes are saved in the course list.

Step 6: If the user selects 4 (Delete Course) The program asks for the course to be removed and deletes it from the course list.

Step 7: If the user selects 5 (Enroll to Courses) The program displays the list of available courses and allows the student to select which ones to enroll in. The chosen courses are added to the student’s enrollment record.

Step 8: If the user selects 6 (Payment and Transaction) The program calculates the total fees based on enrolled courses and prompts the student to process payment. Payment status is updated accordingly.

Step 9: If the user selects 7 (View Enrolled Courses and Payment Status) The program prints all courses the student is currently enrolled in along with the payment status (Paid/Unpaid).

Step 10: If the user selects 8 (Exit) The program prints “Thank you for using the system!” and exits the loop, ending the program.

Step 11: Error handling while the program runs. If the user enters invalid input (for example, typing a letter instead of a number), the program prints “Invalid option. Try again.” and returns to the menu without crashing.

## SAMPLE OUTPUT (MAIN MENU)
## 1. Option 1 
<img width="537" height="677" alt="image" src="https://github.com/user-attachments/assets/5b82c7f2-be9b-4b31-afc8-bd94dffb44b4" />

## 2. Option 2 - 3
<img width="557" height="755" alt="image" src="https://github.com/user-attachments/assets/b498d2e2-41a7-4176-8c74-106917f04697" />

## 3. Option 4 - 5
<img width="480" height="640" alt="image" src="https://github.com/user-attachments/assets/e593e83b-65c1-49bc-b908-366e3bdb91cd" />

## 4. Option 6
<img width="462" height="710" alt="image" src="https://github.com/user-attachments/assets/5aec0565-8e78-4290-82e9-e15e0a620ea4" />

## 5. Option 7
<img width="480" height="677" alt="image" src="https://github.com/user-attachments/assets/fc5b6dca-ae59-411e-b308-3161d1329338" />

## Acknowledgement 




