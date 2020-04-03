package voiture;

import java.util.ArrayList;

import assurance.Assurance;
import assurance.AucuneAssurance;
import carburant.Carburant;
import marque.Marque;
import option.Option;

public abstract class Voiture {
	
	protected float prix;
	protected String nom;
	
	protected ArrayList<Option> options;
	
	protected Assurance assurance = new AucuneAssurance();
	protected Carburant carburant;
	protected Marque marque;

	public void infoConsommation() {
		carburant.infos();
	}
	
	public void infoAssurance() {
		assurance.infosAssurance();
	}
	
	public void addOption(Option option) {
		this.options.add(option);
		this.prix+=option.getPrix();
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

	public void setOptions (ArrayList<Option> newVar) {
		options = newVar;
	}

	public ArrayList<Option> getOptions () {
		return options;
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
		for(Option opt : options) {
			o += "Option n°"+i+" : "+opt.toString()+"\n";
			i++;
		}
		return nom+", type : "+carburant.toString()+"\n"+o+"Coût total = "+this.prix+" euros"+"\n";
	}

	public void afficher() {
		System.out.println(toString());
	}
	
	
	public void afficherNom() {
		System.out.println(this.nom);
	}
	

}
