package animal;

public class Chien extends Animal{

	public Chien() {
		this.setpoids();
	}
	public void setpoids() {
		this.poids = (int)(Math.random()*40+1);
	}
	public void parle() {
		System.out.println("Hoooooooow");
	}

}
