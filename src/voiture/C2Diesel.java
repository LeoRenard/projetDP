package voiture;

import carburant.Diesel;
import marque.Citroen;

public class C2Diesel extends Voiture{
	
	public C2Diesel() {
		marque = new Citroen();
		carburant = new Diesel();
		nom = marque.nom()+" C2 Diesel";
		prix = marque.prix()+3000f;
		
	}

}
