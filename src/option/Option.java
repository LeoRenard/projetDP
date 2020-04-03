package option;

import voiture.abstractVoiture;

/**
 * Class Option
 */
public abstract class Option extends abstractVoiture {


	abstractVoiture voiture;
	String description;
	float cout;
  
  public float getCout() {
		return voiture.getPrix() + cout;
	}
	
  public String getDescription() {
		return voiture.getDescription() + description;
	}

 
  
}
