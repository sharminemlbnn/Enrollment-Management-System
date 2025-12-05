import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseManager {
    private List<Course> courses;
    
    public CourseManager() {
        this.courses = new ArrayList<>();
    }
    
    public void addCourse(Scanner sc) {
        System.out.print("Enter course name: ");
        String courseName = sc.nextLine();
        System.out.print("Enter course price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        
        courses.add(new Course(courseName, price));
        System.out.println("Course added successfully!");
    }
    
    public void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        
        System.out.println("\n=== AVAILABLE COURSES ===");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ". " + courses.get(i));
        }
    }
    
    public void editCourse(Scanner sc) {
        if (courses.isEmpty()) {
            System.out.println("No courses to edit.");
            return;
        }
        
        viewCourses();
        System.out.print("Select course number to edit: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();
        
        if (index >= 0 && index < courses.size()) {
            System.out.print("Enter new course name: ");
            String newName = sc.nextLine();
            System.out.print("Enter new course price: ");
            double newPrice = sc.nextDouble();
            sc.nextLine();
            
            courses.get(index).setCourseName(newName);
            courses.get(index).setPrice(newPrice);
            System.out.println("Course updated successfully!");
        } else {
            System.out.println("Invalid course number.");
        }
    }
    
    public void deleteCourse(Scanner sc) {
        if (courses.isEmpty()) {
            System.out.println("No courses to delete.");
            return;
        }
        
        viewCourses();
        System.out.print("Select course number to delete: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();
        
        if (index >= 0 && index < courses.size()) {
            courses.remove(index);
            System.out.println("Course deleted successfully!");
        } else {
            System.out.println("Invalid course number.");
        }
    }
    
    public List<Course> getCourses() {
        return courses;
    }
}
