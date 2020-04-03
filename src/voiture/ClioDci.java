package voiture;

import java.util.ArrayList;

import carburant.Diesel;
import marque.Renault;
import option.Option;

public class ClioDci extends Voiture{
	
	public ClioDci() {
		marque = new Renault();
		carburant = new Diesel();
		nom = marque.nom()+" Clio Dci";
		prix = marque.prix()+5000f;
		
		options = new ArrayList<Option>();
	}

}
