package option;

import voiture.Voiture;

/**
 * Class Climatisation
 */
public class Climatisation extends Option {

  public Climatisation (Voiture voiture) {
	  this.voiture = voiture;
	  this.setDescription("Option : Climatisation");
	  this.prix = voiture.getPrix();
  };

  public float getPrix() {
	  return voiture.getPrix() + 675;
  }
  
}