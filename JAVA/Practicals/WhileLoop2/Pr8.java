
class Pr8{

	public static void main(String[]args){

		int num = 256985;
		int pro = 1;
		while (num>0){
			
			int rem = num % 10;
			num = num/10;
			if (rem%2==1){
				pro *=rem;
			}	
			
		}System.out.println(pro);

	}
}
