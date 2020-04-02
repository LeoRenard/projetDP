package main;

import java.util.*;

import assurance.*;
import carburant.*;
import modele.*;
import option.*;

/**
 * Class Voiture
 */
public class Voiture {

	//
	// Fields
	//

	private float prix;
	private String nom;
	private ArrayList<Option> options;
	private Assurance assurance;
	private Carburant carburant;
	private Modele modele;


	public Voiture () { 

		this.options = new ArrayList<Option>();

	};

	public Voiture (Carburant carburant, Modele modele) { 

		this.options = new ArrayList<Option>();
		this.carburant = carburant;
		this.modele = modele;
		this.setNom(modele.toString());
		this.setPrix(modele.getPrix());
		

	};


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

	public void setModele (Modele newVar) {
		modele = newVar;
	}

	public Modele getModele () {
		return modele;
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
	
	public String toStringAfficheMini() {
		return this.modele.getNom();
	}
	
	public void afficherMini() {
		System.out.println(this.modele.toString());
	}
	
}
