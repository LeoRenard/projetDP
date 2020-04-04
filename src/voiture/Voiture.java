package voiture;

import assurance.Assurance;
import assurance.AucuneAssurance;
import carburant.Carburant;
import marque.Marque;

public abstract class Voiture {
	
	 float prix;
	 String nom;
		
	 Assurance assurance = new AucuneAssurance();
	 Carburant carburant;
	 Marque marque;

	public void infoConsommation() {
		carburant.infos();
	}
	
	public void infoAssurance() {
		assurance.infosAssurance();
	}

	public void setPrix (float newVar) {
		prix = newVar;
	}

	public float getPrix () {
		return prix;
	}

	public void setNom (String newVar) {
		nom = newVar;
	}

	public String getNom () {
		return nom;
	}

	public void setAssurance (Assurance newVar) {
		assurance = newVar;
	}

	public Assurance getAssurance () {
		return assurance;
	}

	public void setCarburant (Carburant newVar) {
		carburant = newVar;
	}

	public Carburant getCarburant () {
		return carburant;
	}

	public void setMarque (Marque newVar) {
		marque = newVar;
	}

	public Marque getMarque () {
		return marque;
	}

	public String toString() {
		String o = "";
		int i = 1;
		return nom+", type : "+carburant.toString()+"\n"+o+"Coût total = "+prix+" euros"+"\n";
	}

	public void afficher() {
		System.out.println(toString());
	}
	
	
	public void afficherNom() {
		System.out.println(this.nom);
	}
	

}
