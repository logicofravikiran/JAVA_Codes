

//Bitwise OR ---> works same as Truth table of OR gate 
//T | T ---> T
//T | F ---> T
//F | T ---> T
//F | F ---> F

class BitwiseOR{

	public static void main(String[]args){
		int a = 10; 			//00001010
		int b = 50;			//00110010

		System.out.println(a|b);		//00111010  (58)
	
	}
}
