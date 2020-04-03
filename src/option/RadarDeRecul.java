package option;

import voiture.abstractVoiture;

/**
 * Class RadarDeRecul
 */
public class RadarDeRecul extends Option {

  public RadarDeRecul (abstractVoiture voiture) { 
	  this.voiture = voiture;

	  this.setDescription("Option : Radar de recul");
	  this.setPrix(150);
  };
 
}