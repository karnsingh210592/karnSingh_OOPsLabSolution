package com.employee.management;
import java.lang.Math;

public class CredentialService {
	
	String emailAddress;
	String password = "";
	
	final String passwordString = "1234567890ABCEDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$^&*";
	final String companyDomain = ".worknation.com";
	
	void generatePassword(){
		int min =1;
		int max = passwordString.length();
		int range = max - min + 1;
		for(int i=0; i<10; i++) {
			int randomNumber = (int)(Math.random() * range) + min;
			this.password += passwordString.charAt(randomNumber);
		}
	}
	
	void generateEmailAddress(String firstName, String lastName, String department) {
		this.emailAddress = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toLowerCase() +companyDomain;
	}
	
	void showCredentials() {
		System.out.println("Email---->" + this.emailAddress);
		System.out.println("Password---->" + this.password);
	}
}
