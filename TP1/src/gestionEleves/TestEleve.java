package gestionEleves;

public class TestEleve {

	public static void main(String[] args) {
		
		Eleve e1=new Eleve("mehdi");
		e1.ajouterNote(20);
		e1.ajouterNote(15);
		e1.ajouterNote(10);
		System.out.println(e1);
		
		Eleve e2=new Eleve("khadija");
		e2.ajouterNote(20);
		e2.ajouterNote(15);
		e2.ajouterNote(10);
		System.out.println(e2);
		
		Eleve e3=new Eleve("anas");
		e3.ajouterNote(20);
		e3.ajouterNote(15);
		e3.ajouterNote(10);
		System.out.println(e3);
		
		System.out.println(" /////////////     Affichage en utilisant GroupeEleves   ///////// ");
		GroupeEleves grp1=new GroupeEleves();
		grp1.ajouterEleve(e1);
		grp1.ajouterEleve(e2);
		grp1.ajouterEleve(e3);
		grp1.lister();
		System.out.println(grp1.chercher("dqsdqs"));
	}

}
