package option;

import voiture.Voiture;

/**
 * Class ToitOuvrant
 */
public class ToitOuvrant extends Option {

  public ToitOuvrant (Voiture voiture) { 
	  this.voiture = voiture;
	  System.out.println(voiture.getPrix());
	  this.setDescription("Option : Toit ouvrant");
	  this.prix = voiture.getPrix() + 2350;
  };
  
  public float getPrix() {
	  return voiture.getPrix() + 2350;
  }
  
}
