package voiture;

import java.util.ArrayList;

import carburant.Diesel;
import marque.Peugeot;
import option.Option;

public class P208Diesel extends Voiture{
	
	public P208Diesel() {
		marque = new Peugeot();
		carburant = new Diesel();
		nom = marque.nom()+" 208 Diesel";
		prix = marque.prix()+5000f;
		
		options = new ArrayList<Option>();
	}

}
