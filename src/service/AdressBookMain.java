package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import modal.Contact;

public class AdressBookMain {	
	
	static List<Contact> addressBook=new ArrayList<Contact>();
	
	public static Comparator<Contact> contactNameComparator =new  Comparator<Contact>() {
		
		@Override
		public int compare(Contact c1, Contact c2) {
			String contact1=c1.getFirstName().toUpperCase();
			String contact2=c2.getFirstName().toUpperCase();

			return contact1.compareTo(contact2);
		}
	};
	

	public static void main(String[] args) {
		
		Contact contact1=new Contact("anuj", "solanki", "jaipur", "jaipur", "rajhsthan", "7896", "7896345219", "anuj@gmail.com");
		Contact contact2=new Contact("rahul", "singh", "udaipur", "udaipur", "rajhsthan", "7456", "7416985226", "rahul@gmail.com");
		Contact contact3=new Contact("gourav", "solanki", "surat", "surat", "gujrat", "7896", "7896345219", "gourav@gmail.com");
		Contact contact4=new Contact("akshy", "singh", "ahamdabad", "surat", "gujart", "7456", "7416985226", "akshay@gmail.com");
		Contact contact5=new Contact("jaydeep", "singh", "mumbai", "mubai", "maharashtra", "7896", "7896345219", "jaydeep@gmail.com");
		Contact contact6=new Contact("rajat", "bawri", "pune", "pune", "maharashtra", "7456", "7416985226", "rajat@gmail.com");
		Contact contact7=new Contact("ranveer", "singh", "jaipur", "jaipur", "rajhsthan", "7896", "89632478", "ranveer@gmail.com");
		Contact contact8=new Contact("sharukh", "khan", "udaipur", "udaipur", "rajhsthan", "7896", "745698523", "sarukk@gmail.com");

		addressBook.add(contact1);
		addressBook.add(contact2);
		addressBook.add(contact3);
		addressBook.add(contact4);
		addressBook.add(contact5);
		addressBook.add(contact6);
		addressBook.add(contact7);
		addressBook.add(contact8);

		
		
		Collections.sort(addressBook, AdressBookMain.contactNameComparator);
		for(Contact contact : addressBook) {
			System.out.println(contact);
		}
	}
	}




