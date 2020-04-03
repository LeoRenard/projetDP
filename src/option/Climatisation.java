package option;

import voiture.abstractVoiture;

/**
 * Class Climatisation
 */
public class Climatisation extends Option {

  public Climatisation (abstractVoiture voiture) {
	  this.voiture = voiture;
	  this.setNom("Climatisation");
	  this.setPrix(75);
  };

}