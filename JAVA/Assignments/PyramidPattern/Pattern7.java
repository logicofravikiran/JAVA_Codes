

import java.util.*;

class Pattern7{

	public static void main(String[]args){
	
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter no.of rows:- ");
		int rows = sc.nextInt();

		for (int i=1; i<=rows; i++){
		
			for (int sp=rows; sp>i; sp--){
			
				System.out.print(" "+ "\t");
			}
			for (int j=1; j<=i*2-1; j++){
			
				if (i%2==1){
					
					System.out.print(i + "\t");
				}
				else {
				
					System.out.print((char)(i+64) + "\t");
				}
			}
			System.out.println();
		}
		
	}
}
