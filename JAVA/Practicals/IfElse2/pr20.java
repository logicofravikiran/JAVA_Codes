

class pr20{
	public static void main(String[]args){
		float cgpa = 7.05f;
		String branch = "Compur";
		int backlogs = 1;
		boolean java = false;	
		if (branch=="Computer" || branch == "IT" || branch == "E&TC"){
		
			if(backlogs==0){
				
				if (cgpa >=7.5){
				
					if (java == true){
					
						System.out.println("Eligible for Placement Drive");
					}
					else {
					
						System.out.println("You Don't have skills to use JAVA , hence SORRY you are Not Eligible for Placement Drive");
					}
				}

				else {
					
					System.out.println("Required CGPA not accomplished , hence SORRY you are Not Eligible for Placement Drive");
				}
			}

			else {
					
				System.out.println("No Backlogs are required , hence SORRY you are Not Eligible for Placement Drive");
			}
		}

		else {
					
			System.out.println("Branch not match , SORRY Not Eligible for Placement Drive");
		}
	}
}
