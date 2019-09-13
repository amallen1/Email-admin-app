import java.util.Scanner
import java.util.Random

/** 
 * Email Administration Application
 * @author aniyaallen
 */
class Email {
	// Encapsulation - private
	String firstName
	String lastName
	String password
	int defaultPasswordLength = 10
	String department
	int mailboxCapacity = 500
	String alternateEmail
	String email
	String company = "company.com"

	// Constructor - receives first and last name
	// ask for department
	// generate a random password
	// set mailbox capacity
	// set alternate email
	// change the password
	/** 
	 * Constructor
	 * @param firstName
	 * @param lastName
	 */
	new(String firstName, String lastName) {
		this.firstName = firstName
		this.lastName = lastName
		// System.out.println("Email created: " + this.firstName +" " + this.lastName);
		// Asks for department
		this.department = setDepartment()
		// System.out.println("Department: " + department);
		// Generates default random password
		this.password = randomPassword(defaultPasswordLength)
		System::out.println('''Password: «password»'''.toString)
		// Combine elements to generate email
		this.email = '''«firstName.toLowerCase()».«lastName.toLowerCase()»@«department.toLowerCase()».«company»'''.
			toString
		// System.out.println(email);
		showInfo()
	}

	/** 
	 * Sets the department of the employee
	 * @return department
	 */
	def private String setDepartment() {
		System::out.print(" 1. Sales\n 2. Development\n 3. Accounting\n 0. None\n Enter the department: ")
		var Scanner in = new Scanner(System::in)
		var int department = in.nextInt()
		if (department === 1) {
			return "Sales"
		} else if (department === 2) {
			return "Development"
		} else if (department === 3) {
			return "Accounting"
		} else {
			return ""
		}
	}

	/** 
	 * Method that creates a random password for the user
	 * @param length
	 * @return a random password
	 */
	def private String randomPassword(int length) {
		var Random randGen = new Random()
		// Set that contains the characters that will be used to create password
		var String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%"
		var int random = 0
		// Chooses random indexes to create the password
		var char[] password = newCharArrayOfSize(length)
		// the password that will be generated
		for (var int i = 0; i < length; i++) {
			random = randGen.nextInt(passwordSet.length())
			{
				val _wrVal_password = password
				val _wrIndx_password = i
				_wrVal_password.set(_wrIndx_password, passwordSet.charAt(random))
			}
		}
		var String randPass = String::valueOf(password)
		return randPass
	}

	// Set mailbox capacity
	def void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity
	}

	// Set the alternate email
	def void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail
	}

	// Change the password
	def void changePassword(String password) {
		this.password = password
	}

	// Get methods
	def int getMailboxCapacity() {
		return mailboxCapacity
	}

	def String getAltEmail() {
		return alternateEmail
	}

	def String password() {
		return password
	}

	def String showInfo() {
		return '''Display name: «firstName» «lastName»
Company email: «email»
Mailbox capacity: «mailboxCapacity»mb'''.toString
	}
}
