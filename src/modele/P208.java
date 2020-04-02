package modele;

import marque.Peugeot;

/**
 * Class 208
 */
public class P208 extends Modele {

  public P208 () { 
	  this.setNom("208");
	  this.setPrix(9000);
	  this.setMarque(new Peugeot());
  };

}
