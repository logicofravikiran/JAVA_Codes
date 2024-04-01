
class Pr6{

	public static void main(String[]args){

		int num = 234;
		int pro = 1;
		while (num>0){
			
			int rem = num % 10;
			num = num/10;
			pro *=rem;
			
		}System.out.println(pro);

	}
}
