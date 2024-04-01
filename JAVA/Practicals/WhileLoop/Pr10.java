

class Pr10{

	public static void main(String[]args){
	
		long num = 9307922405l;
		long sum = 0;
		while (num>0){
		
			long rem = num%10;
			num /=10;
			sum += rem;
		}
		System.out.println("Sum: "+ sum);
	}
}
