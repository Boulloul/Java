package animal;

public class Animal {
	public static int nbrAnimal=0;
	protected String nom;
	protected int age;
	protected double poids;
	protected double speed;
	protected int id;

	public Animal() {
		Animal.nbrAnimal++;
		this.setPoids();
	}
	public Animal(int age,String nom) {
		Animal.nbrAnimal++;
		this.setPoids();
		this.age=age;
		this.nom=nom;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids() {
		this.poids = (int)(Math.random()*100+1);
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "nom=" + nom + ", age=" + age + ", poids=" + poids + ", speed=" + speed + ", id=" + id ;
	}
	public void parle() {
		System.out.println("Waaaaaaaaaaaaaaw");
	}

	

	

}
