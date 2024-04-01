

class pr5{
	public static void main(String[]args){
		int a = 5;		//0000 0101
		int b = 8;		//0000 1000
		
		System.out.println(a&b);	//0000 0000 (0)
		System.out.println(a|b);	//0000 1101 (13)
		System.out.println(a^b);	//0000 1101 (13)
		System.out.println(a>>2);	//0000 0001 (1)
		System.out.println(a<<2);	//0001 0100 (20)
		System.out.println(a>>>2);	//0000 0001 (1)
		
	}
}
