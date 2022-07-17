package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import interfaces.IAddressBook;
import modal.Contact;

public class AdressBookMain implements IAddressBook{


	Map<String, HashMap<String, List<Contact>>> addressBookDictionary=new HashMap<String, HashMap<String, List<Contact>>>();
	Map<String, List<Contact>> addressBookList=new HashMap<String, List<Contact>>();
	List<Contact> rajhsthanAddressBook=new ArrayList<Contact>();
	List<Contact> gujratAddressBook=new ArrayList<Contact>();
	
	
	Scanner scan =new Scanner(System.in);

	@Override
	public void addContact(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber,
			String email) {
		
		Contact contact=new Contact(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
		System.out.println("Enter State You Want Add Contact.");
		state=scan.next();
		
		switch(state) {
		case "gujrat" :
			gujratAddressBook.add(contact);
			addressBookList.put(state, gujratAddressBook);
					break;
					
		case "rajhsthan":
				rajhsthanAddressBook.add(contact);			
				addressBookList.put(state, rajhsthanAddressBook);
					break;
		}
		
		System.out.println(addressBookDictionary);
		
	}

	@Override
	public void addAddressBook() {
		addressBookDictionary.put("AddressBookDictionary", (HashMap<String, List<Contact>>) addressBookList);
	}
		
	@Override
	public void editDetails(String firstName, String lastName,String state) 
	{
		
		System.out.println("Enter State You Want To Edit Contact.");
		state=scan.next();
		
		switch(state) {
		
		case "gujrat": {
			for (int i=0; i<gujratAddressBook.size() ; i++) {
				
				Contact personDetails=gujratAddressBook.get(i);
				
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
			break;
		}
		case "rajhsthan": {
			
				for (int i=0; i<rajhsthanAddressBook.size() ; i++) {
				
				Contact personDetails=rajhsthanAddressBook.get(i);
				
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
			break;
			
		}
		
		}
		
	}


	@Override
	public void deletePerson(String firstName, String lastName,String state) {
		System.out.println("Enter State You Want to Delete Contact.");
		state=scan.next();
		
		switch(state) {
		case "gujrat":{
			for (int i=0 ; i<gujratAddressBook.size();i++) {
				Contact personDetails=gujratAddressBook.get(i);
				if( personDetails.getFirstName().compareToIgnoreCase(firstName)==0) {
					gujratAddressBook.remove(i);
					return;
				}
		}
			break;
		}
		case "rajhsthan":{
			for (int i=0 ; i<rajhsthanAddressBook.size();i++) {
				Contact personDetails=rajhsthanAddressBook.get(i);
				if( personDetails.getFirstName().compareToIgnoreCase(firstName)==0) {
					rajhsthanAddressBook.remove(i);
					return;
				}
		}
			break;
			
		}	
		}
	  }

	}




