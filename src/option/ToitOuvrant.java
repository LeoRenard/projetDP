package option;

import voiture.Voiture;

/**
 * Class ToitOuvrant
 */
public class ToitOuvrant extends Option {

  public ToitOuvrant (Voiture voiture) { 
	  this.voiture = voiture;
	  this.setDescription("Option : Toit ouvrant");
	  this.setPrix(300);
  };
  
}
