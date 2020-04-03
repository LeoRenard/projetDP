package voiture;

import carburant.Essence;
import marque.Citroen;

public class C2Essence extends Voiture{
	
	public C2Essence() {
		marque = new Citroen();
		carburant = new Essence();
		nom = marque.nom()+" C2 Essence";
		prix = marque.prix()+3500f;
		
	}

}
