package voiture;

import java.util.ArrayList;

import carburant.Essence;
import marque.Citroen;
import option.Option;

public class C2Essence extends Voiture{
	
	public C2Essence() {
		marque = new Citroen();
		carburant = new Essence();
		nom = marque.nom()+" C2 Essence";
		prix = marque.prix()+3500f;
		
		options = new ArrayList<Option>();
	}

}
