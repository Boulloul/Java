package gestionEleves;
import java.util.*;

public class Eleve implements Comparable<Eleve> {
	private String nom;
	private ArrayList<Double> notes=new ArrayList<Double>();
	private double moyenne=0;
	public Eleve(String nom) {
		this.nom=nom;
	}
	public void Moyenne() {
		Iterator it= notes.iterator();
		double moy=0;
		while(it.hasNext()) {
			moy = moy + (double)it.next();
		}
		
		moyenne=moy/notes.size();
	}
	public double getMoyenne() {
		
		return this.moyenne;
	}
	public void ajouterNote(double note) {
		
		notes.add(note);
		Moyenne();
		
	}
	public String getNom() {
		return nom;
	}
	public ArrayList<Double> getListNotes(){
		return notes;
		
	}
	public String toString() {
		return "Nom : "+nom+" Notes : "+notes+" Moyenne : "+moyenne;
	}
	@Override
	public int compareTo(Eleve o) {
		
		return 0;
	}
	
}
