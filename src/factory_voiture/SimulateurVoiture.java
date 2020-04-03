package factory_voiture;

import option.RadarDeRecul;
import voiture.Voiture;

public class SimulateurVoiture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FabriqueDeVoitureAbstraite fabrique = new FabriqueDeVoiture();
        System.out.println();
        System.out.println(" ****** Début simulation comportement Canard ******");
        Voiture titine = fabrique.creerVoiture("P208Essence");
        titine.afficher();
        System.out.println(" ****** Ajout d'un decorateur Radar de Recul comportement Canard ******");
        titine =new RadarDeRecul(titine);
        titine.afficher();
        System.out.println(" ****** Fin simulation comportement Canard ******");
        System.out.println();
        
	}

}
