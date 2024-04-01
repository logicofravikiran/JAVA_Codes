

class Q2{

	public static void main(String[]args){
	
		int num1 = 10;
		float num2 = num1; 

		System.out.println(System.identityHashCode(num1));
		System.out.println(System.identityHashCode(num2));
	}
}
