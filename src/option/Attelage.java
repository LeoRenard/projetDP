package option;

import voiture.Voiture;

public class Attelage extends Option{

	public Attelage (Voiture voiture) {
		  this.voiture = voiture;
		  this.setDescription("Option : Attelage ");
		  this.setPrix(50);
	  };
}
