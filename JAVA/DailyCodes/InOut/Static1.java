

class Static1{
	
	void fun(){
	
		System.out.println("In Fun Method");
	}

	static void run(){
	
		System.out.println("In Fun Method");
	
	}

	public static void main(String[]args){

		System.out.println("In Main Method");
		
	}
}


//only main function will work 
//as we know JVM starts with the main function as -----> classname.main()  ___ here Static1.main
//and in main method we didn't call other two methods
