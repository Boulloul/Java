package animal;

public class Chat extends Animal{

	public Chat() {
		this.setpoids();
	}
	public void setpoids() {
		this.poids = (int)(Math.random()*10+1);
	}
	public void parle() {
		System.out.println("Miiiiouuuuuuuu");
	}

}
