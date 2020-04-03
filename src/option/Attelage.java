package option;

import voiture.Voiture;

public class Attelage extends Option{

	public Attelage (Voiture voiture) {
		  this.voiture = voiture;
		  this.prix = voiture.getPrix();
		  this.setDescription("Option : Attelage ");
		  this.addPrix(50);
	  };
}
