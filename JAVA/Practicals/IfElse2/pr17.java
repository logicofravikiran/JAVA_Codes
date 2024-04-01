

class pr17{
	public static void main(String r[]){
		float sp = 900f;
		float cp = 1000f;
		if (sp==cp){	
			System.out.println("No profit or loss");
		}else if (sp>cp){	
			System.out.println("Profit of "+ (sp-cp) );
		}else{	
			System.out.println("loss of "+ (cp-sp) );
		}
	}
}
