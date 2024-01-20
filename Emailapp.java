package emailapp;

import java.util.Scanner;
public class Emailapp {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome,please enter your Firstname and your Lastname:\n1-Firstname: ");
		String name=s.nextLine();
		System.out.println("2-Lastname: ");
		String lastname=s.nextLine();
		Email e=new Email(name,lastname);
		System.out.println(e.showInfo());
		System.out.println("***Welcome to our company team***");
		System.out.println("Do you want to change your password? \n1-Yes\n2-No");
		int n=s.nextInt();
		if(n==1) {
			System.out.println("enter new password: ");
			String newP=s.next();
			e.setPassword(newP);
			System.out.println(e.showInfo());
		}
		System.out.println("Set an alternate Email: ");
		String altE=s.next();
		e.setAlternateEmail(altE);
		}

}
