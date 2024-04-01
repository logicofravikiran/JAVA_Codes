
class Static5{

	int x = 34;
	static int y = 34;
	public static void main(String[]args){
	
		System.out.println("In Main method");

		Static5 obj = new Static5();
		System.out.println(obj.x);
		System.out.println(y);
	}
}
