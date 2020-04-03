package option;

import voiture.abstractVoiture;

/**
 * Class ToitOuvrant
 */
public class ToitOuvrant extends Option {

  public ToitOuvrant (abstractVoiture voiture) { 
	  this.voiture = voiture;
	  this.setDescription("Option : Toit ouvrant");
	  this.setPrix(300);
  };
  
}
