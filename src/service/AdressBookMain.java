package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import modal.Contact;

public class AdressBookMain {
	
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String emailId;
	
	
	
	public AdressBookMain (String firstName, String lastName, String address, String city, String state, String zipCode,
			String phoneNumber, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public String setFirstName(String firstName) {
		return this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String setLastName(String lastName) {
		return this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public String setAddress(String address) {
		return this.address = address;
	}
	public String getCity() {
		return city;
	}
	public String setCity(String city) {
		return this.city = city;
	}
	public String getState() {
		return state;
	}
	public String setState(String state) {
		return this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public String setZipCode(String zipCode) {
		return this.zipCode = zipCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String setPhoneNumber(String phoneNumber) {
		return this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public String setEmailId(String emailId) {
		return this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Contact Details [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zipCode=" + zipCode + ", phoneNumber=" + phoneNumber + ", emailId=" + emailId
				+ "]";
	}
	
	
	
	static List<AdressBookMain> rajhsthanAddressBook=new ArrayList<AdressBookMain>();
	static List<AdressBookMain> gujratAddressBook=new ArrayList<AdressBookMain>();
	static List<AdressBookMain> maharshtrAddressBook=new ArrayList<AdressBookMain>();
	
	

	public static void main(String[] args) {
//		AdressBookMain adressBookMain=new AdressBookMain(firstName, lastName, address, city, state, zipCode, phoneNumber, emailId);
		AdressBookMain contact1=new AdressBookMain("anuj", "solanki", "jaipur", "jaipur", "rajhsthan", "7896", "7896345219", "anuj@gmail.com");
		AdressBookMain contact2=new AdressBookMain("rahul", "singh", "udaipur", "udaipur", "rajhsthan", "7456", "7416985226", "rahul@gmail.com");
		
		AdressBookMain contact3=new AdressBookMain("gourav", "solanki", "surat", "surat", "gujrat", "7896", "7896345219", "gourav@gmail.com");
		AdressBookMain contact4=new AdressBookMain("akshy", "singh", "ahamdabad", "surat", "gujart", "7456", "7416985226", "akshay@gmail.com");
		
		AdressBookMain contact5=new AdressBookMain("jaydeep", "singh", "mumbai", "mubai", "maharashtra", "7896", "7896345219", "jaydeep@gmail.com");
		AdressBookMain contact6=new AdressBookMain("rajat", "bawri", "pune", "pune", "maharashtra", "7456", "7416985226", "rajat@gmail.com");
		
		rajhsthanAddressBook.add(contact1);
		rajhsthanAddressBook.add(contact2);
		gujratAddressBook.add(contact3);
		gujratAddressBook.add(contact4);
		maharshtrAddressBook.add(contact5);
		maharshtrAddressBook.add(contact6);
		
		
		System.out.println("List Of Person In Rajhsthan");
		rajhsthanAddressBook.stream().filter(x-> x.state=="rajhsthan").forEach(x-> System.out.println(x));

	}
	}




