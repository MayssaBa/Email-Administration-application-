package emailapp;
import java.util.Scanner;
public class Email {
		private String name;
		private String lastname;
		private String password;
		private String departement;
		private int mailboxCapacity=500;
		private String alternateEmail;
		private String email;
		private String companySuffix="UmaginaryCompany.com";
		
		public Email(String name,String lastname) {
			this.name=name;
			this.lastname=lastname;
			System.out.println("email created: "+name+" "+lastname);
			this.departement=setDepartement();
			//System.out.println(this.departement);
			this.password=randomPassword(10);
			//System.out.println("Your password is: "+password);
			email=name.toLowerCase()+"."+lastname.toLowerCase()+"@"+departement+"."+companySuffix;
			//System.out.println("Your work email is: "+email);
		}
		//Ask for department
		private String setDepartement() {
			System.out.println("Enter the departement code:\n1-sales\n2-Development\n3-Accounting\n0-none");
			Scanner i=new Scanner(System.in);
			int c=i.nextInt();
			switch(c) {
			case 1:return "Sales";
			case 2:return "Development";
			case 3:return "Accounting";
			case 0:return "";
			default:return "";
			}
					
		}
		//returning random password
		private String randomPassword(int length) {
			 String passwordSet="ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
			 char[] password=new char[length];
			 for(int i=0;i<length;i++) {
				 int rand=(int)(Math.random()*passwordSet.length());
				 password[i]=passwordSet.charAt(rand);
			 }
			 return new String (password);
		}
		//change mail box capacity
		public void setMailboxcapacity(int m) {
			this.mailboxCapacity=m;
		}
		//set alternate email
		public void setAlternateEmail(String alt) {
			this.alternateEmail=alt;
		}
		//change password
		public void setPassword(String p) {
			this.password=p;
		}
		
		public String getName() {
			return name;
		}
		public String getLastname() {
			return lastname;
		}
		public String getPassword() {
			return password;
		}
		public String getDepartement() {
			return departement;
		}
		public int getMailboxCapacity() {
			return mailboxCapacity;
		}
		public String getAlternetEmail() {
			return alternateEmail;
		}
		
		
		//show info
		public String showInfo() {
			return "UserName:"+name+" "+lastname+"\nwork e-mail: "+email+"\nMail box capacity: "+mailboxCapacity+"mb"+"\nPassword: "+password;
		}
}
