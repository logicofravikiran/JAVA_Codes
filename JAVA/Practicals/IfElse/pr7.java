

class pr7{
	public static void main(String[]args){
		int a = 10;
		int b = 100;
		int c = 100;
		if (a>b && a>c){
			
			System.out.println('a' + " is maximum");
		}
		else if (b>a && b>c){
			
			System.out.println('b' + "is maximum");
		}
		else if (c>a && c>b){
			
			System.out.println('c' + "is maximum");
		}
		else {
				
			System.out.println("any 2 of them are equal");
		}
	}
}
