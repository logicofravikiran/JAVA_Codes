
//BITWISE OPERATORS :- operates only on the bits (binary)
//used in bit manipulation
//----> &(bitwise AND) , | (bitwise OR) , ~ (bitwise negation-->toggles each bit)


class BitwiseAND{
	public static void main(String[]args){
		int x = 15;			//00001111
		int y = 9;			//00001001
		System.out.println(x&y);	//00001001 (9)
	}

}


//bitwise AND ---> operates same like truth table of AND gate 
//T&T--->T
//T&F--->F
//F&T--->F
//F&F--->T
