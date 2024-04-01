
class Pr3{

	public static void main(String[]args){
			
		System.out.print("Digits Divisible 2 or 3 by are : ");
		int num = 436780521;
		while (num>0){
			
			int rem = num % 10;
			num = num/10;
			if (rem==0){

				continue;
			}	
			else{
				if (rem%2==0 || rem%3==0){
			
				System.out.print(rem + " ");
			
				}
			}

		}
	}	
}
