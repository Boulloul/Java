class Solo<T>{
	private T valeur;
	
	public void setValeur(T valeur) {
		this.valeur=valeur;
	}
	
	public T getValeur() {
		return this.valeur;
	}
	
	public Solo() {
		
	}
	public Solo(T valeur) {
		this.valeur=valeur;
	}
}
public class Test {

	public static void main(String[] args) {
		Solo<Integer> S1 = new Solo(1);
		Solo<String> S2 = new Solo("Mehdi");
		Solo<Double> S3 = new Solo(30.0);
		Solo<Boolean> S4 = new Solo(true);
		
		System.out.println(S1.getValeur());	
		System.out.println(S2.getValeur());	
		System.out.println(S3.getValeur());	
		System.out.println(S4.getValeur());	
			}

}
