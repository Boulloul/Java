package gestionEleves;
import java.util.*;
public class GroupeEleves {
	private ArrayList<Eleve> listeEleves = new ArrayList<Eleve>();
	public int nombre() {
		return listeEleves.size();
	}
	public ArrayList<Eleve> getListe(){
		return listeEleves;
	}
	public void ajouterEleve(Eleve eleve) {
		listeEleves.add(eleve);
	}
	public Eleve chercher(String nom) {
		Iterator it=listeEleves.iterator();
		Eleve e=null;
		String Nom;
		while(it.hasNext()) {
			Eleve e1=(Eleve)it.next();
			Nom=e1.getNom();
			
			if(Nom.equals(nom)) {
				e=e1;
			}
		}
		return e;
		
	}
	public void lister() {
		Iterator it2=listeEleves.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	}

}
