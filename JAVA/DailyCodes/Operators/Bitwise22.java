

class Bitwise22{
	public static void main(String[]args){
		int x = 8;			//0000 1000
		int y = 9;			//0000 1001

		System.out.println(x&y);	//0000 1000 (8)
		System.out.println(x|y);	//0000 1001 (9)
		System.out.println(x^y);	//0000 0001 (1)
	}
}
