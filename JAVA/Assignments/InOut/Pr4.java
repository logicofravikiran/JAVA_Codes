

import java.util.*;

class Pr4{

	public static void main(String[]args){
	
		System.out.println("Enter a Number to Print Its table: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i=1; i<=10; i++){
		
			System.out.print(num*i+ ",");
		}
	}
}
