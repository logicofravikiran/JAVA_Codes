

class Pr9{

	public static void main(String[]args){

		int num = 2469185;
		int sum = 0;
		while (num>0){
			
			int rem = num % 10;
			num = num/10;
			if (rem%2==1){
				int sq = rem*rem;
				sum +=sq;
			}	
			
		}System.out.println(sum);

	}
}
