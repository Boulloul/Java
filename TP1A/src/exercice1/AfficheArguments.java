package exercice1;

public class AfficheArguments {

	public static void main(String[] args) {
		int a=args.length;
		if(a==0) {
			System.out.println("vous n'avez passer aucun argument");
		}
		else {
			for(int i=0;i<a;i++) {
				System.out.println("argument "+(i+1)+" : "+args[i]);
			}

		}
		
	}

}
