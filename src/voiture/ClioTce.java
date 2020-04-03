package voiture;

import java.util.ArrayList;

import carburant.Essence;
import marque.Renault;
import option.Option;

public class ClioTce extends Voiture{

	public ClioTce() {
		marque = new Renault();
		carburant = new Essence();
		nom = marque.nom()+" Clio Tce";
		prix = marque.prix()+4000f;
		
		options = new ArrayList<Option>();
	}
	

}
