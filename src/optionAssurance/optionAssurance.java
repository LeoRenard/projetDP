package optionAssurance;

import assurance.Assurance;
import assurance.AssuranceRespCivile;

public abstract class optionAssurance implements Assurance{
	Assurance assurance;
	float prix;
	String description;
	

	@Override
	public void infosAssurance() {
		System.out.println(this.getDescription());
		
	}

	@Override
	public float getPrix() {
		return this.prix + assurance.getPrix();
	}
	
	@Override
	public String getDescription() {
		return assurance.getDescription() + description;
	}

	@Override
	public void afficher() {
		System.out.println(getDescription());
		System.out.println("Prix à l'année : " + getPrix());
		
	}
}
