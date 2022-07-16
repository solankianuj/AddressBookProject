package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import interfaces.IAddressBook;
import modal.Contact;

public class AdressBookMain implements IAddressBook{

	static Scanner scan =new Scanner(System.in);
	List<Contact> addressBook=new ArrayList<Contact>();
	
	@Override
	public void editDetails(String firstName, String lastName) 
	{
		
		for (int i=0; i<addressBook.size() ; i++) {
			
			Contact personDetails=addressBook.get(i);
			
			if(personDetails.getFirstName().equalsIgnoreCase(firstName) && personDetails.getLastName().equalsIgnoreCase(lastName) ) {
				System.out.println("1.=> To Edit First Name.\n"+"2.=> To Edit Last Name\n"+"3.=> To Edit Address\n"+"4.=> To Edit City\n"+"5.=> To Edit State\n"+"6.=> To Edit Zip Code\n"+"7.=> To Edit Phone Number\n"+"8.=> To Edit Email Id");
				System.out.println("Enter Your Choice");
				int choice=scan.nextInt();
				
				switch(choice) {
				case 1: System.out.println("Enter New First Name.");
						String newFirstName=scan.next();
						newFirstName=personDetails.setFirstName(newFirstName);
						break;
				
				case 2: System.out.println("Enter New Last Name.");
				String newLastName=scan.next();
				newLastName=personDetails.setLastName(newLastName);
				break;		
				
				case 3: System.out.println("Enter New Address.");
				String newAddress=scan.next();
				newAddress=personDetails.setAddress(newAddress);
				break;
				
				case 4: System.out.println("Enter New City.");
				String newCity=scan.next();
				newCity=personDetails.setCity(newCity);
				break;
				
				case 5: System.out.println("Enter New State.");
				String newState=scan.next();
				newState=personDetails.setState(newState);
				break;
				
				case 6: System.out.println("Enter New ZipCode.");
				String newZipCode=scan.next();
				newZipCode=personDetails.setZipCode(newZipCode);
				break;
				
				case 7: System.out.println("Enter New Phone Number.");
				String newPhoneNumber=scan.next();
				newPhoneNumber=personDetails.setPhoneNumber(newPhoneNumber);
				break;
				
				case 8: System.out.println("Enter New Email Id.");
				String newEmail=scan.next();
				newEmail=personDetails.setEmailId(newEmail);
				break;
				}
			}
		}
	}


	@Override
	public void deletePerson(String firstName, String lastName) {
		for (int i=0 ; i<addressBook.size();i++) {
			Contact personDetails=addressBook.get(i);
			if( personDetails.getFirstName().compareToIgnoreCase(firstName)==0) {
				addressBook.remove(i);
				return;
			}
			
		}
	}


	@Override
	public void addContact(String firstName, String lastName, String address,
			String city, String state, String zipCode, String phoneNumber, String emailId) {
				 
		Contact contact=new Contact(firstName, lastName, address, city, state, zipCode, phoneNumber, emailId);
			 	 
		addressBook.add(contact);
		System.out.println(addressBook);
		
	}
	
	public static void main(String[] args) {
		IAddressBook addressBook=new AdressBookMain();
		int x=1;
		do {
			System.out.println("1.=> To AddContact\n"+"2.=> To Edit Details\n"+"3.=> To Delete Contact");
			System.out.println("Enter Your Choice");
			int Choice=scan.nextInt();
			
			switch(Choice) {
			case 1: 
				System.out.println("Enter First Name.");
				 String firstName=scan.next();
				System.out.println("Enter Last Name.");
				String lastName=scan.next();
				System.out.println("Enter Address.");
				String	address=scan.next();
				System.out.println("Enter City Name.");
				String	 city=scan.next();
				System.out.println("Enter State Name.");
				String	state=scan.next();
				System.out.println("Enter ZipCode.");
				String	 zipCode=scan.next();
				System.out.println("Enter Phone Number..");
				String	 phoneNumber=scan.next();
				System.out.println("Enter Email Address.");
				String	 emailId=scan.next();
				
				addressBook.addContact(firstName, lastName, address, city, state, zipCode, phoneNumber, emailId);
				break;
				
			case 2: 
				System.out.println("Enter The Fisrt Name Of Person You Want To Edit. ");
				firstName=scan.next();
				System.out.println("Enter The Last Name Of Person You Want To Edit. ");
				lastName=scan.next();
				addressBook.editDetails(firstName, lastName);
				break;
			
			case 3: System.out.println("Enter First Name.");
						firstName=scan.next();
					System.out.println("Enter Last Name.");
						lastName=scan.next();
						addressBook.deletePerson(firstName, lastName);
						break;
			}
			
			System.out.println("Press 1 To Go Home And Press 0 To Exit.");
			x=scan.nextInt();
			
		}while(x==1);
		
		
	}

	}




