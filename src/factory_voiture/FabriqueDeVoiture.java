package factory_voiture;

import voiture.*;

public class FabriqueDeVoiture extends FabriqueDeVoitureAbstraite {

	public Voiture creerVoiture(String s) {
		
		Voiture v = null;
		
		if(s.equals("P208Diesel"))v = new P208Diesel();
		if(s.equals("P208Essence"))v = new P208Essence();
		if(s.equals("ClioTce"))v = new ClioTce();
		if(s.equals("ClioDci"))v = new ClioDci();
		if(s.equals("C2Essence"))v = new C2Essence();
		if(s.equals("C2Diesel"))v = new C2Diesel();
		
		if(v == null)System.out.println("Nous n'avons pas cette voiture");
		
		return v;
	}

}