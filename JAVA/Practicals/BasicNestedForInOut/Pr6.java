

import java.util.*;

class Pr6{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter No.of rows:- ");
		int rows = sc.nextInt();

		for (int i=1; i<=rows; i++){
			char ch = 'A';
			for (int j=1; j<=rows; j++){
			
				//System.out.print((j) + (char)ch + " ");
				/*if (j>=3){
				
					ch = 'C';
				}*/
				System.out.print(j);
				System.out.print(ch + " ");
				ch ++;
				
			}
			System.out.println();
		}
	}
}
