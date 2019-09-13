import java.util.Scanner;
import java.util.Random;

/**
 * Email Administration Application
 * @author aniyaallen
 *
 */

public class EmailCreator {

	//Encapsulation - private
	
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail; 
	private String email;
	private String company = "company.com";
	private int dptCode;
	
	//Constructor - receives first and last name
	//ask for department
	//generate a random password
	//set mailbox capacity
	//set alternate email
	//change the password
	
	/**
	 * Constructor
	 * @param firstName
	 * @param lastName
	 */
	public EmailCreator(String firstName, String lastName, int dptCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email created: " + this.firstName +" " + this.lastName);
		
		//Asks for department
		this.department = setDepartment(dptCode);
		//System.out.println("Department: " + department);
		
		//Generates default random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Password: " + password);
		
		//Combine elements to generate email
		this.email = firstName.toLowerCase() + "."+ lastName.toLowerCase() +"@"+ department.toLowerCase()+ "."+ company;
		//System.out.println(email);
		
		showInfo();
		
	}
	
	/**
	 * Sets the department of the employee
	 * @return department
	 */
	private String setDepartment(int dptCode) {
		
		//System.out.print(" 1. Sales\n 2. Development\n 3. Accounting\n 0. None\n Enter the department: ");
		//Scanner in = new Scanner(System.in);
		//int department = in.nextInt();
		
		switch (dptCode){
			case 1: 
				department = "sales";
				break;
			
			case 2:
				department = "development";
				break;
				
			case 3: 
				department = "accounting";
				break;
		}
		
		return department;
		
		
		/*
		if(department == "1") {
			return "Sales";
		}else if(department == "2") {
			return "Development";
		}else if(department == "3") {
			return "Accounting";
		}else {
			return "";
		}*/
			
	}
	
	/**
	 * Method that creates a random password for the user
	 * @param length
	 * @return a random password
	 */
	private String randomPassword(int length) {
		Random randGen = new Random();

		//Set that contains the characters that will be used to create password
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
		int random = 0;

		//Chooses random indexes to create the password
		char[] password = new char[length]; //the password that will be generated
		for(int i = 0; i < length; i++) {
			random = randGen.nextInt(passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}

		String randPass = String.valueOf(password);
		return randPass;

	}
	
	//Set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	//Get methods
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAltEmail() {
		return alternateEmail;
	}
	
	public String password() {
		return password;
	}
	
	public String showInfo() {
		return "Display name: " + firstName + " " +lastName +
				"\nCompany email: " + email;//+
				//"\nMailbox capacity: " + mailboxCapacity + "mb";
	}
	
}
