package simple;


import java.util.Scanner;

public class Email {
	
	private String fname;
	private String lname;
	private String password;
	private String email;
	private String altemail;
	private String department;
	private int mailboxCapacity = 500;
	private String suffix = "techies.com";
	
	
	// Constructor to receive first and last name
	public Email (String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
		System.out.println("EMPLOYEE NAME: "+fname+ " "+lname);
		
		
		
//		call method asking for department - return department
		this.department = setDepartment();
		System.out.println("Department: "+department);
		
//		Call a method that returns a random password
		this.password = ranPass(8);
		System.out.println("Password: "+password);
		
//		create email
		email = fname.toLowerCase()+"."+lname.toLowerCase()+"@"+department.toLowerCase()+suffix;
		System.out.println("EMAIL ADDRESS: "+email);
	}
	
	// Ask for department

	public String setDepartment() {
		System.out.println("Select employee department:\n1: Sales\n2: Development\n3: Accounting\n4: Kitchen");
		Scanner in = new Scanner(System.in);
		int dep = in.nextInt();
		if(dep == 1) {
			
			return "Sales";
			
		} 
		else if(dep == 2) {
			
			return "Development";
		}
		else if(dep == 3) {
			
			return "Accounting";
		}
		else if(dep == 4) {
			return "Kitchen";
		}
		else {
			
			System.out.println("Invalid choice. Please try again.");
			
		}
		in.close();
		return "setDepartment";
	}
	
	// Generate random password
	private String ranPass(int length) {
		String passwordSet = "QWERTYUIOP[]#';LKJHGFDSAZXCVBNM,./asdfghklertyuiomnbvcxz!!£$%^&*()";
		char [] password = new char[length];
		for(int i=0; i<length;i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set mailbox capacity
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	
	}
	//set alternate email
	public void altemail(String altmail) {
		this.altemail =altmail;
	}
	private void mail() {
		
	}

	
	//change password
	
}
