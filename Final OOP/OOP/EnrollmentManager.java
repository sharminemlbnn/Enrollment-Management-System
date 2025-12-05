import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnrollmentManager {
    private Student student;
    private List<Course> enrolledCourses;
    private boolean isPaid;

    public EnrollmentManager(Student student) {
        this.student = student;
        this.enrolledCourses = new ArrayList<>();
        this.isPaid = false;
    }

    public void enrollToCourses(Scanner sc, CourseManager courseManager) {
        if (courseManager.getCourses().isEmpty()) {
            System.out.println("No courses available for enrollment.");
            return;
        }

        courseManager.viewCourses();
        System.out.print("Select course number to enroll: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();

        if (index >= 0 && index < courseManager.getCourses().size()) {
            Course selectedCourse = courseManager.getCourses().get(index);
            if (enrolledCourses.contains(selectedCourse)) {
                System.out.println("Already enrolled in: " + selectedCourse.getCourseName());
            } else {
                enrolledCourses.add(selectedCourse);
                System.out.println("Successfully enrolled in: " + selectedCourse.getCourseName());
            }
        } else {
            System.out.println("Invalid course number.");
        }
    }

    public void processPayment(Scanner sc) {
        if (enrolledCourses.isEmpty()) {
            System.out.println("You have not enrolled in any courses yet.");
            return;
        }

        System.out.println("\n=== PAYMENT AND TRANSACTION ===");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Year Level: " + student.getYearLevel());
        System.out.println("\nEnrolled Courses:");

        double total = 0;
        for (Course course : enrolledCourses) {
            System.out.println("- " + course);
            total += course.getPrice();
        }

        System.out.println("\nTotal Price: $" + total);
        System.out.print("\nWould you like to pay now? (yes/no): ");
        String payNow = sc.nextLine();

        if (!payNow.equalsIgnoreCase("yes")) {
            System.out.println("Payment postponed.");
            return;
        }

        System.out.println("\nSelect Payment Method:");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.print("Choice: ");
        int paymentMethod = sc.nextInt();
        sc.nextLine(); 

        if (paymentMethod == 1) {
            System.out.println("\n1. Payment Successful");
            System.out.println("2. Payment Unsuccessful");
            System.out.print("Select status: ");
            int status = sc.nextInt();
            sc.nextLine();

            if (status == 1) {
                isPaid = true;
                System.out.println("Payment completed successfully!");
            } else {
                System.out.println("Payment was unsuccessful.");
            }
        } else if (paymentMethod == 2) {
            System.out.print("Enter card number: ");
            String cardNumber = sc.nextLine();
            if (cardNumber.length() < 12) {
                System.out.println("Invalid card number. Must be at least 12 digits.");
                return;
            }

            System.out.print("Enter PIN: ");
            String pin = sc.nextLine();
            if (pin.length() < 4) {
                System.out.println("Invalid PIN. Must be at least 4 digits.");
                return;
            }

            System.out.println("Card number entered: ****** "
                               + cardNumber.substring(cardNumber.length() - 4));
            System.out.println("PIN accepted.");

            System.out.println("\n1. Payment Successful");
            System.out.println("2. Payment Unsuccessful");
            System.out.print("Select status: ");
            int status = sc.nextInt();
            sc.nextLine();

            if (status == 1) {
                isPaid = true;
                System.out.println("Payment completed successfully!");
            } else {
                System.out.println("Payment was unsuccessful.");
            }
        } else {
            System.out.println("Invalid payment method.");
        }
    }

    public void viewEnrollmentStatus() {
        System.out.println("\n=== ENROLLMENT STATUS ===");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Year Level: " + student.getYearLevel());

        if (enrolledCourses.isEmpty()) {
            System.out.println("\nNo enrolled courses.");
        } else {
            System.out.println("\nEnrolled Courses:");
            for (Course course : enrolledCourses) {
                System.out.println("- " + course);
            }
        }

        System.out.println("\nPayment Status: " + (isPaid ? "PAID" : "NOT PAID"));
    }
}