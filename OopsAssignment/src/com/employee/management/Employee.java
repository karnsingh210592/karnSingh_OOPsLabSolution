package com.employee.management;
import java.util.Scanner;

public class Employee extends CredentialService {
	String firstName;
	String lastName;
	String department;
	
	Employee(String firstName, String lastName, String department){
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}
	
	void GenerateCredentials() {
		generateEmailAddress(firstName, lastName, department);
		generatePassword();
		System.out.println("Dear " + firstName + ", Your generated credentials are as follows\n");
		showCredentials();
	}
	
	public static void main(String[] s) {
		System.out.println("Welcome. Please enter your information to generate login credentials:\n");
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter firstname:\n");
		String first = myObj.nextLine();
		System.out.println("Enter lastname:\n");
		String last = myObj.nextLine();
		System.out.println("Choose Department:\n");
		System.out.println("Technical, Admin, HumanResource, Legal\n");
		String dept = myObj.nextLine();
		Employee emp = new Employee(first, last, dept);
		emp.GenerateCredentials();
	}
}
