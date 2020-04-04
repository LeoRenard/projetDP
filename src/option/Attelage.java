package option;

import voiture.Voiture;

public class Attelage extends Option{

	public Attelage (Voiture voiture) {
		  this.voiture = voiture;
		  this.setDescription("Option : Attelage ");
		  this.prix = voiture.getPrix();
	  };
	  
	  public float getPrix() {
		  return voiture.getPrix() + 800;
	  }
	  
}
