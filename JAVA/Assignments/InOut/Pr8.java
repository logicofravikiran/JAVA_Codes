

import java.util.*;

class Pr8{

	public static void main(String[]args){
	
		System.out.print("Enter a Number to Print Its REVERSE table: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i=10; i>=1; i--){
		
			System.out.print(num*i+ ",");
		}
	}
}
