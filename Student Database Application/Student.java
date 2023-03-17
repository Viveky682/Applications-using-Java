package StudentDatabaseApp;

import java.util.Scanner;

public class Student {

	private String studentID;
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses = "";
	private int tutionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// Constructor: prompts user to enter name and year
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = sc.nextLine();

		System.out.print("Enter student last name: ");
		this.lastName = sc.nextLine();

		System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = sc.nextInt();
		this.setStudentId();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

	}

	// Generate an ID
	public void setStudentId() {
		// student id= grade+ id
		id++;
		this.studentID = gradeYear + "" + id;
	}

	// Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit)");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tutionBalance = tutionBalance + costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);
		System.out.println("ENROLLED IN: " + courses);
	}

	// View balance
	public void viewBalance() {
		System.out.println("Your balance is $ " + tutionBalance);
	}

	// Pay Tution
	public void paytution() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tutionBalance-=payment;
		System.out.println("Thank You for your payment of $" + payment);
		viewBalance();
	}
	// Show status
	public String viewInfo() {
		return "Name : "+ firstName+" "+ lastName+
				"\nCourses Enrolled: "+courses+
				"\nBalance: $"+tutionBalance;
	}

}
