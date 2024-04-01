

class Switch3{
	public static void main(String[]args){
		int a = 2;
		System.out.println("Before Switch");
		switch (a){
		
			case 1:
				System.out.println("ONE");
			case 2 :
				System.out.println("TWO");
			case 3:
				System.out.println("THREE");	
			default:
				System.out.println("In the Default State");
		}
		System.out.println("After Switch");
	}
}
