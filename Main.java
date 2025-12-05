import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your year level: ");
        String yearLevel = sc.nextLine();
        
        Student student = new Student(name, yearLevel);
        CourseManager courseManager = new CourseManager();
        EnrollmentManager enrollmentManager = new EnrollmentManager(student);
        
        while (true) {
            System.out.println("\n=== STUDENT ENROLLMENT SYSTEM ===");
            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Edit Course");
            System.out.println("4. Delete Course");
            System.out.println("5. Enroll to Courses");
            System.out.println("6. Payment and Transaction");
            System.out.println("7. View Enrolled Courses and Payment Status");
            System.out.println("8. Exit");
            System.out.print("Select option: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    courseManager.addCourse(sc);
                    break;
                case 2:
                    courseManager.viewCourses();
                    break;
                case 3:
                    courseManager.editCourse(sc);
                    break;
                case 4:
                    courseManager.deleteCourse(sc);
                    break;
                case 5:
                    enrollmentManager.enrollToCourses(sc, courseManager);
                    break;
                case 6:
                    enrollmentManager.processPayment(sc);
                    break;
                case 7:
                    enrollmentManager.viewEnrollmentStatus();
                    break;
                case 8:
                    System.out.println("Thank you for using the system!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}