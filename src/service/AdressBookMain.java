package service;

import java.util.Scanner;
import interfaces.IAddressBook;
import modal.Contact;

public class AdressBookMain implements IAddressBook{
	Scanner scan =new Scanner(System.in);

	@Override
	public void editDetails(String firstName, String lastName) {
		Contact contact=new Contact("anuj", "solanki", "jaiur", "jaipur", "raj.", "4569", "7896324556", "somthing@gamil.com");
		if(contact.getFirstName()==firstName && contact.getLastName()==lastName) {
		System.out.println("1.=> To Edit First Name.\n"+"2.=> To Edit Last Name\n"+"3.=> To Edit Address\n"+"4.=> To Edit City\n"+"5.=> To Edit State\n"+"6.=> To Edit Zip Code\n"+"7.=> To Edit Phone Number\n"+"8.=> To Edit Email Id");
		System.out.println("Enter Your Choice");
		int choice=scan.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Enter New First Name.");
				String newFirstName=scan.next();
				newFirstName=contact.setFirstName(newFirstName);
				break;
		
		case 2: System.out.println("Enter New Last Name.");
		String newLastName=scan.next();
		newLastName=contact.setLastName(newLastName);
		break;		
		
		case 3: System.out.println("Enter New Address.");
		String newAddress=scan.next();
		newAddress=contact.setAddress(newAddress);
		break;
		
		case 4: System.out.println("Enter New City.");
		String newCity=scan.next();
		newCity=contact.setCity(newCity);
		break;
		
		case 5: System.out.println("Enter New State.");
		String newState=scan.next();
		newState=contact.setState(newState);
		break;
		
		case 6: System.out.println("Enter New ZipCode.");
		String newZipCode=scan.next();
		newZipCode=contact.setZipCode(newZipCode);
		break;
		
		case 7: System.out.println("Enter New Phone Number.");
		String newPhoneNumber=scan.next();
		newPhoneNumber=contact.setPhoneNumber(newPhoneNumber);
		break;
		
		case 8: System.out.println("Enter New Email Id.");
		String newEmail=scan.next();
		newEmail=contact.setEmailId(newEmail);
		break;
		}		
		}
		System.out.println(contact);
	}
	
	
	public static void main(String[] args) {
		IAddressBook book=new AdressBookMain();
		book.editDetails("anuj","solanki");
		
	}
	
	}


