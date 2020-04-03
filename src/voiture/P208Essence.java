package voiture;

import carburant.Essence;
import marque.Peugeot;

public class P208Essence extends Voiture{
	
	public P208Essence() {
		marque = new Peugeot();
		carburant = new Essence();
		nom = marque.nom()+" 208 Essence";
		prix = marque.prix()+4000f;
		
	}

}
