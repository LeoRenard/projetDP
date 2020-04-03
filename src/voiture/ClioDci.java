package voiture;

import carburant.Diesel;
import marque.Renault;

public class ClioDci extends Voiture{
	
	public ClioDci() {
		marque = new Renault();
		carburant = new Diesel();
		nom = marque.nom()+" Clio Dci";
		prix = marque.prix()+5000f;
		
	}

}
