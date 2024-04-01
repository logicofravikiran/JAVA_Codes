

class Pr1{

	public static void main(String[]args){
			
		System.out.print("Digits Divisible 2 by are : ");
		int num = 2569185;
		while (num>0){
			
			int rem = num % 10;
			num = num/10;
			if (rem%2==0){
			
				System.out.print(rem + " ");
			}
		}

	}
}
