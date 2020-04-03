package option;

import voiture.Voiture;

/**
 * Class Option
 */
public abstract class Option extends Voiture {


	Voiture voiture;
	String description;
	float cout;
  
  public float getCout() {
		return voiture.getPrix() + cout;
	}
	
  public String getDescription() {
		return voiture.toString() + description;
	}

 public void setDescription(String s) {
	 this.description = s;
 }
  
}
