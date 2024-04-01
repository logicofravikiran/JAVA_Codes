

class Pr9{

	public static void main(String[]args){
	
		int num = 214367689;
		int ocount = 0;
		int ecount = 0;
		while (num>0){
		
			int rem = num%10;
			num /= 10;
			if (rem%2==1){
				ocount++;
			}
			else{
			
				ecount++;
			}
		}
		System.out.println("No of Odd Digits: "+ ocount);
		System.out.println("No of Even Digits: "+ ecount);
	}
}
