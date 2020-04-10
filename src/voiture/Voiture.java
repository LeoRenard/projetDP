package voiture;

import assurance.Assurance;
import carburant.Carburant;
import marque.Marque;

public abstract class Voiture {
	
	 float prix;
	 String nom;
		
	 Assurance assurance;
	 protected Carburant carburant;
	 protected Marque marque;

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
		return nom+"\n"; 
	}
	
	public String toStringNomPrix() {
		return nom+" "+prix+" euros";
	}
	
	public void afficher() {
		System.out.println(toString()+affichePrix());
		
	}
	
	public void afficherNom() {
		System.out.println(this.nom);
	}

	public String getDescription() {
		return this.toString();
	}
	
	public String affichePrix() {
		return "Coût total = "+getPrix()+" euros"+"\n";
	}

}
