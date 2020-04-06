package observateur_region;

import main.Concessionnaire;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("****************DEBUT SIMULATEUR DP OBSERVATEUR****************");
		
		Concessionnaire c1 = new Concessionnaire("Pere&Co", "42 avenue Saint Jean", "0683838383");
		Concessionnaire c2 = new Concessionnaire("AutoConc'", "138 avenue de Verdun", "0683838386");
		Concessionnaire c3 = new Concessionnaire("Pandora", "62 boulevard des petites branches", "0683837883");
		
		RegionCentreConcessionnaire regionCentreConcessionnaire = new RegionCentreConcessionnaire();
		
		Acheteur acheteur1 = new Acheteur("Renard", "Léo-Paul", "0683902133", "1 rue Marie Virginie Vaslin", "lp.renard@outlook.fr", 20000f);
		acheteur1.setSujet(regionCentreConcessionnaire);
		
		acheteur1.afficher();
		acheteur1.afficherConcessionnaireDisponible();
		
		regionCentreConcessionnaire.addConcessionnaires(c1);
		regionCentreConcessionnaire.addConcessionnaires(c2);
		
		
	}

}
