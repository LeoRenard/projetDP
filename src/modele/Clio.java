package modele;

import marque.Renault;

/**
 * Class Clio
 */
public class Clio extends Modele {
  
  //
  // Constructors
  //
  public Clio () { 
	  this.setNom("Clio");
	  this.setPrix(10000);
	  this.setMarque(new Renault());
  };


}
