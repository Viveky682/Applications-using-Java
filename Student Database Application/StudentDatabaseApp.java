package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student st1 = new Student();
//		st1.enroll();
//		st1.paytution();
//		System.out.println(st1.viewInfo());

		// Ask how many new users want to add
		System.out.println("Enter number of new Students to enroll: ");
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		Student[] students = new Student[numOfStudents];

		// Create n number of new students
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].paytution();
//			System.out.println(students[i].viewInfo());
		}
		for (int i = 0; i < numOfStudents; i++) {
			System.out.println(students[i].viewInfo());
		}

	}

}
