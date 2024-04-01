

import java.util.Scanner;

class Pattern6{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no.of rows:- ");
		int rows = sc.nextInt();
		int temp = rows;
		for(int i=1; i<=rows; i++){
			for (int j=rows; j>=i; j--){
			
				System.out.print(temp +" ");

			}temp--;
			System.out.println();
		}
	}
}
