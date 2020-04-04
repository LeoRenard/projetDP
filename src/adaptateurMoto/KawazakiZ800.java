package adaptateurMoto;

import carburant.Essence;
import marque.Kawazaki;

public class KawazakiZ800 extends MotoAbstraite{

	public KawazakiZ800() {
		marque = new Kawazaki();
		nom = marque.nom()+" Z800";
		prix = marque.prix()+4000f;
	}
}
