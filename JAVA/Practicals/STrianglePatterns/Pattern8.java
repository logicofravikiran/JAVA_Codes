


import java.util.Scanner;

class Pattern8{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of rows:- ");
		int rows = sc.nextInt();
		int temp = rows;
		for(int i = 1 ; i<=rows; i++){
			
			for (int j=i; j<=temp; j++){
			
				System.out.print(j + " ");

			}
			System.out.println();
		}
	}
}
