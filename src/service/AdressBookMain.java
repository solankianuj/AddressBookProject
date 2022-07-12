package service;

import java.util.Scanner;
import interfaces.IAddressBook;
import modal.Contact;

public class AdressBookMain implements IAddressBook{
	Scanner scan =new Scanner(System.in);


	@Override
	public void deletePerson(String firstName, String lastName) {
		Contact contact=new Contact("anuj", "solanki", "jaiur", "jaipur", "raj.", "4569", "7896324556", "somthing@gamil.com");
		if(contact.getFirstName()==firstName && contact.getLastName()==lastName) {
			contact=null;
			
		}
		System.out.println(contact);
	}

	
	public static void main(String[] args) {
		IAddressBook book=new AdressBookMain();
		book.deletePerson("anuj", "solanki");
		
	}
	}


