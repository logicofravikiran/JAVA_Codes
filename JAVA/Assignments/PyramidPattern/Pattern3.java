

import java.util.*;

class Pattern3{

	public static void main(String[]args){
	
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter no.of rows:- ");
		int rows = sc.nextInt();
		int num = rows;

		for (int i=1; i<=rows; i++){
		
			for (int sp=rows; sp>i; sp--){
			
				System.out.print(" "+ "\t");
			}
			for (int j=1; j<=i*2-1; j++){
			
				System.out.print(num + "\t");
			}
			num--;
			System.out.println();
		}
		
	}
}
