package Comparable;

public class CD implements Comparable<CD>{
private String auteur, titre;
private double prix;
public CD(String auteur,String titre,double prix) {
	this.auteur=auteur;
	this.titre=titre;
	this.prix=prix;
}
@Override
public String toString() {
	return "auteur=" + auteur + ", titre=" + titre + ", prix=" + prix;
}
public String getAuteur() {
	return auteur;
}
public void setAuteur(String auteur) {
	this.auteur = auteur;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
@Override
public int compareTo(CD o) {
	return (int)(o.prix-this.prix);
	
}

}
