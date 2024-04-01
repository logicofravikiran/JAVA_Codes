

class Nested10{

	public static void main(String[]args){
	
		for(int i = 1; i<=2; i++){
		
			char low = 'a';
			char upper = 'A';
			for(int j=1; j<=4; j++){
			
				System.out.print(upper++ + " ");
			}
			System.out.println();

			for(int k=1; k<=4; k++){
			
				System.out.print(low++ + " ");
			}
			System.out.println();
		}
	}
}
