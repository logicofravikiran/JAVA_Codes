

import java.util.*;

class Pr7{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter No.of rows:- ");
		int rows = sc.nextInt();
		
		for (int i=1; i<=rows; i++){
			int ch = 96 + rows;
			for (int j=1; j<=rows; j++){
			
				System.out.print((char)ch-- + " ");
			}
			System.out.println();
		}
	}
}
