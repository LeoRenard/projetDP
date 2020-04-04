package option;

import voiture.Voiture;

/**
 * Class RadarDeRecul
 */
public class RadarDeRecul extends Option {

  public RadarDeRecul (Voiture voiture) { 
	  this.voiture = voiture;
	  this.prix = voiture.getPrix();
	  this.setDescription("Option : Radar de recul");
	  this.addPrix(1500);
  };
 
}