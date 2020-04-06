package voiture;

import carburant.Essence;
import marque.Renault;

public class ClioTce extends Voiture{

	public ClioTce() {
		marque = new Renault();
		carburant = new Essence();
		nom = marque.nom()+" Clio Tce";
		prix = marque.prix()+4000f;
		
	}
	

}
