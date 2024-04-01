

class Pr10{

	public static void main(String[]args){
	
		int num = 9367924;
		int sum = 0;
		int pro = 1;
		while (num>0){
		
			int rem = num%10;
			if (rem%2==1){
			
				sum +=rem;
			}
			else {
			
				pro *=rem;
			}
			num /=10;
			
			
		}
		System.out.println("Sum of Odd Digits ; "+ sum);	
		System.out.println("Product of Even Digits ; "+ pro);
	}
}
