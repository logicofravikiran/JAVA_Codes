

class Pr8{

	public static void main(String[]args){
	
		int a = 3;
		int b = 0;
		if (a>0 && b>0){

			int product = a*b;
			System.out.println("Product= "+ product);
			switch(product%2){
			
				case 0:
					System.out.println("Product is Even");
					break;
				case 1:
					System.out.println("Product is ODD");
					break;	
			}
		}else if (a==0 || b==0){
		
			System.out.println("One of the number is ZERO");
			System.out.println("Hence Product is ZERO");
		}else{
			
			System.out.println("Please Enter Positive Number");
		}
	}
}
