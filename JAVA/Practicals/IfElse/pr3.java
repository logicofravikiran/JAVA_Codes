

class pr3{
	public static void main(String[]args){
		int num = 13;
		if (num%2==0 && num>10){
			System.out.println("Even & greater");
		}
		else if(num%2==1 && num>10) {
				
			System.out.println("ODD & greater");
		}
		else if (num%2==0 && num<10){
			
			System.out.println("Even & lesser");
		}
		
		else if (num%2==1 && num<10){
			System.out.println("Odd & lesser");
		}	
		else if (num%2==0 && num==10){

			System.out.println("even & equal");
		}
		else{
			System.out.println("Odd & Equal");
		
		}
	}
}
