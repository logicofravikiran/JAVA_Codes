
class Pr7{

	public static void main(String[]args){
		
		int sum = 0;	
		int num = 2569185;
		while (num>0){
			
			int rem = num % 10;
			num = num/10;
			if (rem%2==0){
			
				sum +=rem;
			}
		
		}System.out.println(sum);

	}
}
