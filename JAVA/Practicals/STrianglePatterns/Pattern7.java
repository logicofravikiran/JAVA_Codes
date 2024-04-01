

import java.util.Scanner;

class Pattern7{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of rows:- ");
		int rows = sc.nextInt();
		int temp = rows;
		for(int i = 1 ; i<=rows; i++){
		
			for (int j=1; j<=temp; j++){
			
				System.out.print(j + " ");

			}
			temp--;
			System.out.println();
		}
	}
}
