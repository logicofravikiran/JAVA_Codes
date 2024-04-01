

class Pr6{

	public static void main(String[]args){
	
		int rows = 4;

		for (int i=1; i<=rows; i++){
			char ch = 'A';
			for (int j=1; j<=rows; j++){
			
				//System.out.print((j) + (char)ch + " ");
				/*if (j>=3){
				
					ch = 'C';
				}*/
				System.out.print(j);
				System.out.print(ch + " ");
				ch ++;
				
			}
			System.out.println();
		}
	}
}
