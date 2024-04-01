

//Bitwise Shifting ---> bit is shift to left or right side by desired no. of places 
//">>" ----> signed right shift (for both + & -)                                                                                                              //"<<" ----> left shift                                                                                                                                       //">>>" ---> unsigned right shift (only for +)


class BitShift{
	public static void main(String[]args){
		int x = 35;		//0010 0011
		int y = 10;		//0000 1010
		System.out.println(x<<2);	//means shifts two two places to left side   //1001 1000  (140)
		System.out.println(y<<4);	//means shifts 4 4 places to left side       //1010 0000  (160)

		int a = 5;		//0000 0101
		int b = 100;		//0110 0100 
		System.out.println(a>>3);	//means shifts 3 3 places to right side       //0000 0000  (0)
		System.out.println(b>>1);	//means shifts 1 1 places to right side       //0011 0010  (50)

		int s = -5;		
		System.out.println(s>>3);	
		

	}
}
