package option;

import voiture.Voiture;

/**
 * Class ToitOuvrant
 */
public class ToitOuvrant extends Option {

  public ToitOuvrant (Voiture voiture) { 
	  this.voiture = voiture;
	  this.prix = voiture.getPrix();
	  this.setDescription("Option : Toit ouvrant");
	  this.addPrix(300);
  };
  
}
