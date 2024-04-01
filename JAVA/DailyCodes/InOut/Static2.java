
class Static2{
	
	void fun(){						//non static method 
	
		System.out.println("In Fun Method");
	}

	static void run(){					//Static method 
	
		System.out.println("In Fun Method");
	
	}

	public static void main(String[]args){			//Static Method 

		System.out.println("In Main Method");
		run();
		fun();						//non static methods or vaariables cannot be called directly from static method 
								
	}
}


//Static Method ---> Memory allocated at Method Area 
//
//NON-Static Method ---> Memory is not allocated automatically, if wanted to access we have to create object to the respective class 
//
//object creation ---> classname obj = new classname();
