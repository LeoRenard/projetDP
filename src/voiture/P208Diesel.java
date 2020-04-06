package voiture;

import carburant.Diesel;
import marque.Peugeot;

public class P208Diesel extends Voiture{
	
	public P208Diesel() {
		marque = new Peugeot();
		carburant = new Diesel();
		nom = marque.nom()+" 208 Diesel";
		prix = marque.prix()+5000f;
		
	}

}
