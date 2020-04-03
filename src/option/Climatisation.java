package option;

import voiture.Voiture;

/**
 * Class Climatisation
 */
public class Climatisation extends Option {

  public Climatisation (Voiture voiture) {
	  this.voiture = voiture;
	  this.prix = voiture.getPrix();
	  this.setDescription("Option : Climatisation");
	  this.addPrix(75);
  };

}