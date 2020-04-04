package adaptateurMoto;

import voiture.Voiture;

public class SimulateurAdaptateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voiture kawazakiTouteBelle = new AdaptateurMoto(new KawazakiZ800());
		kawazakiTouteBelle.afficher();
	}

}
