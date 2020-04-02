package modele;

import marque.Citroen;

/**
 * Class C2
 */
public class C2 extends Modele {

  public C2 () { 
	  this.setNom("C2");
	  this.setPrix(8000);
	  this.setMarque(new Citroen());
  };

}
