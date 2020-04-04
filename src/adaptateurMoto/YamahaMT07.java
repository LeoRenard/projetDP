package adaptateurMoto;

import carburant.Essence;
import marque.Yamaha;

public class YamahaMT07 extends MotoAbstraite{

	public YamahaMT07() {
		marque = new Yamaha();
		nom = marque.nom()+" MT07";
		prix = marque.prix()+4000f;
	}
}
