import animal.Animal;
import animal.Chat;
import animal.Chien;

public class TestAnimal {

	public TestAnimal() {
	
	}

	public static void main(String[] args) {
		Animal A1=new Animal();
		Animal A2=new Animal(12,"Milou");
		System.out.println(Animal.nbrAnimal);
		System.out.println(A1);
		System.out.println(A2);
		A1.parle();
		System.out.println("----Chat---------");
		Chat Ch1=new Chat();
		System.out.println(Ch1);
		Ch1.parle();
		System.out.println("----Chien---------");
		Chien Ch2=new Chien();
		System.out.println(Ch2);
		Ch2.parle();
		
		

	}

}
