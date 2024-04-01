

import java.util.Scanner;

class Pattern3{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no.of rows:- ");
		int rows = sc.nextInt();
		int ch = 'A';
		for(int i=1; i<=rows; i++){
			ch = i+64;
			for (int j=1; j<=i; j++){
			
				System.out.print((char)(ch++) +" ");

			}
			System.out.println();
		}
	}
}
