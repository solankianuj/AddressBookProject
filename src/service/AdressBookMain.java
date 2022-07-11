package service;

import java.util.Scanner;
import interfaces.IAddressBook;
import modal.Contact;

public class AdressBookMain implements IAddressBook{
	Scanner scan =new Scanner(System.in);

	@Override
	public void addContact() {
		System.out.println("Enter Personal Details.");
		System.out.println("Enter First Name.");
		String firstName=scan.next();
		 System.out.println("Enter Last Name");
		 String lastName=scan.next();
		 System.out.println("Enter Address");
		 String address=scan.next();
		 System.out.println("Enter City");
		 String city=scan.next();
		 System.out.println("Enter State.");
		 String state=scan.next();
		 System.out.println("Enter Zip Code");
		 String zipCode=scan.next();
		 System.out.println("Enter Mobile Number");
		 String phoneNumber=scan.next();
		 System.out.println("Enter Email Address.");
		 String emailId=scan.next();
		Contact contact=new Contact(firstName, lastName, address, city, state, zipCode, phoneNumber, emailId);
		
		System.out.println(contact.toString());
	}
		
	public static void main(String[] args) {
		IAddressBook book=new AdressBookMain();
		book.addContact();
	}
	
	}


