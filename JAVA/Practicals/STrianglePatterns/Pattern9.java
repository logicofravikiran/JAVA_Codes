
import java.util.Scanner;

class Pattern9{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of rows:- ");
		int rows = sc.nextInt();
		int temp = rows;

		for(int i = 1 ; i<=rows; i++){

			int ch = 64 + rows;

			for (int j=i; j<=temp; j++){
			
				System.out.print((char)ch-- + " ");

			}
			System.out.println();
		}
	}
}
