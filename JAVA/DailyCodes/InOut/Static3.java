
class Static3{
	
	void fun(){						//non static method 
	
		System.out.println("In Fun Method");
	}

	static void run(){					//Static method 
	
		System.out.println("In Run Method");
	
	}

	public static void main(String[]args){			//Static Method 

		System.out.println("In Main Method");
		run();

		Static3 obj = new Static3();			//Object Creation for accessing non static method from a static method 
		obj.fun();							
	}
}

