

class pr11{
	public static void main(String[]args){
		int a = 8;			//0000 1000
		System.out.println(a>>3);	//0000 0001 (1)
		int b = 8;			//0000 1000
		System.out.println(a<<3);	//0100 0000 (64)
	}
}
