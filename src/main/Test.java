package main;
import option.*;
import voiture.ClioTce;
import voiture.Voiture;
import marque.*;
import carburant.*;
import assurance.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//Carburant
//		Essence essence = new Essence();
//		Diesel diesel = new Diesel();
//		Hybride hybride = new Hybride();
//
//		//Assurance 
//		AssuranceRespCivile assuRespCivile = new AssuranceRespCivile();
//		AssuranceTousRisques assuTousRisques = new AssuranceTousRisques();
//		AssuranceVol assuVol = new AssuranceVol();
//
//		//Option
//		Climatisation clim = new Climatisation();
//		RadarDeRecul radarDeRecul = new RadarDeRecul();
//		ToitOuvrant toitOuvrant = new ToitOuvrant();
//
//		//Modele
//		Clio clio = new Clio();
//		P208 p208 = new P208();
//		C2 c2 = new C2();
//
//		//Voitures
//		Voiture v1 = new Voiture(diesel, clio);
//		v1.addOption(clim);
//		v1.addOption(radarDeRecul);
//
//		Voiture v2 = new Voiture(essence, p208);
//		v2.addOption(toitOuvrant);
//		
//		Voiture v3 = new Voiture(essence, c2);
//		v3.addOption(clim);
//		v3.addOption(radarDeRecul);
//		v3.addOption(toitOuvrant);
//
//		//Concessionnaire
//		// Constr param (nom, adresse, numeroTel)
//		Concessionnaire concess1 = new Concessionnaire("Père&Co", "11 rue des Lilas", "0683902133");
//
//		concess1.addVoiture(v1);
//		concess1.addVoiture(v2);
//
//		Concessionnaire concess2 = new Concessionnaire("AutoAll", "120 rue des Magentas", "0683215423");
//
//		concess2.addVoiture(v1);
//		concess2.addVoiture(v2);
//		concess2.addVoiture(v3);
//
//		//Vendeur
//		//Constr param (nom, prenom, email)
//		Vendeur vendeur1 = new Vendeur("Jean", "Pierre", "jp@gmail.com");
//		
//		Vendeur vendeur2 = new Vendeur("Jacques", "Matthieu", "jm@gmail.com");
//		
//		//Add vendeur to concessionnaire
//		concess1.addVendeur(vendeur1);
//		concess2.addVendeur(vendeur2);
//		
//		concess1.afficherVendeur();
//		concess2.afficherVendeur();
//		
//		
//
//		//Acheteur 
//		//Constr param ( nom, prenom, numTel, adresse, email, budget)
//		Acheteur a1 = new Acheteur("Renard","Léo-Paul", "06060607","11 rue Fulbert", "lp.renard@outlook.fr", 12000);
//		
//		Acheteur a2 = new Acheteur("Legroux","Clément", "06060608","42 rue du Bois", "clementlegroux@orange.fr", 12000);
//
//		Acheteur a3 = new Acheteur("Nguyen","Nhan", "06060609","1 rue de l'impasse", "nhannguyen@gmail.com", 70000);
//		
//		//Transaction
//		concess2.addAcheteur(a2);
//		concess2.transaction(v2, vendeur2);
//		
//		concess1.addAcheteur(a1);
//		concess1.transaction(v1, vendeur1);
//
//		a1.afficher();
//		a1.afficherVoitureParticulier();
		
		Voiture v1 = new ClioTce();
		v1.afficherNom();
		v1.infoAssurance();
		v1.infoConsommation();
		
		v1.setAssurance(new AssuranceTousRisques());
		v1.infoAssurance();
		
	}

}
