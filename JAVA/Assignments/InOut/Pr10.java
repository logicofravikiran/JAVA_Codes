

import java.util.*;

class Pr10{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Marks of Subjects : ");

		System.out.print("Subject1 :- ");
		int sub1 = sc.nextInt();

		System.out.print("Subject2 :- ");
		int sub2 = sc.nextInt();

		System.out.print("Subject3 :- ");
		int sub3 = sc.nextInt();

		System.out.print("Subject4 :- ");
		int sub4 = sc.nextInt();

		if (sub1>=0 && sub1<=100 && sub2>=0 && sub2<=100 && sub3>=0 && sub3<=100 && sub4>=0 && sub4<=100){
		
			int sum = sub1 + sub2 + sub3 + sub4 ;
			System.out.println(sum + " Marks Obtained out of 400");
		}
		else{
		
			System.out.println("Enter Valid Marks");
		}
	}
}
