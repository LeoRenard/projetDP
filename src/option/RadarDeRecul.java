package option;

import voiture.abstractVoiture;

/**
 * Class RadarDeRecul
 */
public class RadarDeRecul extends Option {

  public RadarDeRecul (abstractVoiture voiture) { 
	  this.setNom("Radar de recul");
	  this.setPrix(150);
	  this.voiture = voiture;
  };
 
}