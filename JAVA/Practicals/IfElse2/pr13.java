

class pr13{
	public static void main(String r[]){
		int a = 0;
		if (a==0){	
			System.out.println("Please enter number another than zero");
		}else{	
			if (a%13==0){			
				System.out.println(a+" is divisible by 13");
			}
			else {	
				System.out.println(a+" is not divisible by 13");
			}
		}	
	}
}
