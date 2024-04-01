

import java.util.Scanner;

class Pr6{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name :- ");
		String name = sc.next();

		System.out.print("Enter College Name :- ");
		String clgName = sc.next();

		System.out.print("Enter Student Id :- ");
		int stdId = sc.nextInt();

		System.out.print("Enter CGPA :- ");
		float cgpa = sc.nextFloat();

		System.out.println();
		System.out.println("--------------------");
		System.out.println();

		System.out.println("Student Name:- "+ name);
		System.out.println("College Name:- "+ clgName);
		System.out.println("Student ID  :- "+ stdId);
		System.out.println("CGPA :- "+ cgpa);
	}
}
