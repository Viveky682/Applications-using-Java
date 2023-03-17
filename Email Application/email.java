package emailapp;

import java.util.Scanner;

public class email {

	private String firstName;
	private String lastName;
	private String emaill;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 8;
	private String alternateEmail;
	private String companySuffix = "company.com";

	// Constructor to recieve the first and the last name

	public email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
//		System.out.println("Email Created : " + this.firstName + " " + this.lastName);

		// Call a method asking for department - return that department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);

		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);

		// Combine elements to generate email
		emaill = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + emaill);
	}

	// Ask for department
	private String setDepartment() {
		System.out.print(
				"DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		if (depChoice == 1) {
			return "Sales";
		} else if (depChoice == 2) {
			return "Development";
		} else if (depChoice == 3) {
			return "Accounting";
		} else
			return "";
	}

	// Generate random password
	private String randomPassword(int length) {
		String passwordSet = "abcdefghijklmnopqrstuvwxyz123456789!@$%^&*()";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// Set Mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// Set the alternate Email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + emaill + "\nMAILBOX CAPACITY: "
				+ mailboxCapacity + "mb";
	}
}
