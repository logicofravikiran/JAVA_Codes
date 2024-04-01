
class Static7{

	int x = 30;
	static int y = 40;
	void fun(){
		System.out.println("Fun");
	}

	static void run(){
	
		System.out.println("Run");
	}
	public static void main(String[]args){
	
		System.out.println("In Main method");

		Static7 obj = new Static7();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.run();
	}
}
