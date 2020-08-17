package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String studentID;
	private String courses;
	private String balance;
	private int costofcourse=600;
	private static int id =1000;
	public Student () {
		Scanner in = new Scanner (System.in);
		System.out.println("enter the students firstname:");
		this.firstname = in.nextLine();
		System.out.println("enter the students lastname");
		this.lastname = in.nextLine();
		System.out.println("1- freshman\n 2- sophomore \n 3- junior \n 4- senior\n enter student classlevel:");
		this.gradeyear = in.nextInt();
		studentID();
		System.out.println(firstname+ " "+lastname+" "+gradeyear + " "+ studentID);
		}
		private void studentID() {
			id++;
			this.studentID= gradeyear+""+id;
	}
	
	

}
