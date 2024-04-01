

class Break1{

	public static void main(String[]args){
	
		for (int i=1; i<=40; i++){
		
			if (i%4==0 && i%5==0){
			
				break;
			}
			System.out.println(i);
		}
	}
}
