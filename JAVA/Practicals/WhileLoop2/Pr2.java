


class Pr2{

	public static void main(String[]args){
			
		System.out.print("Digits which are not Divisible 3 are : ");
		int num = 2569185;
		while (num>0){
			
			int rem = num % 10;
			num = num/10;
			if (rem%3!=0){
			
				System.out.print(rem + " ");
			}
		}

	}
}
