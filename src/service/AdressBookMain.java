package service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modal.Contact;

public class AdressBookMain {	
	
	static List<Contact> addressBook=new ArrayList<Contact>();
	

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		Contact contact1=new Contact("anuj", "solanki", "jaipur", "jaipur", "rajhsthan", "10", "7896345219", "anuj@gmail.com");
		Contact contact2=new Contact("rahul", "singh", "udaipur",  "udaipur", "rajhsthan", "20", "7416985226", "rahul@gmail.com");
		Contact contact3=new Contact("gourav", "solanki", "surat",  "surat", "gujrat", "45", "7896345219", "gourav@gmail.com");
		Contact contact4=new Contact("akshy", "singh", "ahamdabad", "surat", "gujart", "65", "7416985226", "akshay@gmail.com");
		Contact contact5=new Contact("jaydeep", "singh", "mumbai",   "mubai", "maharashtra", "85", "7896345219", "jaydeep@gmail.com");
		Contact contact6=new Contact("rajat", "bawri", "pune",      "pune", "maharashtra", "78", "7416985226", "rajat@gmail.com");
		Contact contact7=new Contact("ranveer", "singh", "kanpur",  "kanpur", "Up", "96", "89632478", "ranveer@gmail.com");
		Contact contact8=new Contact("sharukh", "khan", "indore",  "indore", "Mp", "13", "745698523", "sarukk@gmail.com");

		addressBook.add(contact1);
		addressBook.add(contact2);
		addressBook.add(contact3);
		addressBook.add(contact4);
		addressBook.add(contact5);
		addressBook.add(contact6);
		addressBook.add(contact7);
		addressBook.add(contact8);
		
		
		try {
			
		FileOutputStream addressBookFile= new FileOutputStream("addressBook.txt");
		try {
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(addressBookFile);
			objectOutputStream.writeObject(addressBook.toString());
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		FileInputStream addressBookFile;
		try {
			addressBookFile = new FileInputStream("addressBook.txt");
			ObjectInputStream objectInputStream=new ObjectInputStream(addressBookFile);
			Scanner sr=new Scanner(addressBookFile);
			while(sr.hasNextLine()) {
				String f=sr.nextLine();
				System.out.println(f);
			}
			sr.close();
			objectInputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
		
		

	




