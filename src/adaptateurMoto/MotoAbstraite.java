package adaptateurMoto;

import assurance.Assurance;
import carburant.Carburant;
import marque.Marque;

public abstract class MotoAbstraite implements Moto{

	String nom;
	float prix;
	
	Marque marque;
	Assurance assurance;
	
	
	public void info() {
		System.out.println(toString());
		
	}

	public String toString() {
		String o = "";
		return nom+"\n"+o+"Coût total = "+prix+" euros"+"\n";
	}
	
}
