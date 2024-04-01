

class Pr8{

	public static void main(String[]args){
	
		int rows = 4;
		int num = 1;
		int ch = 64+ rows;
		for (int i=1; i<=rows; i++){
		
			for (int j=1; j<=rows; j++){
			
				System.out.print((char)ch);
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
