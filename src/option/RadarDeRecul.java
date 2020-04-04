package option;

import voiture.Voiture;

/**
 * Class RadarDeRecul
 */
public class RadarDeRecul extends Option {

  public RadarDeRecul (Voiture voiture) { 
	  this.voiture = voiture;
	  System.out.println(voiture.getPrix());
	  this.setDescription("Option : Radar de recul");
	  this.prix = voiture.getPrix();
	  System.out.println(prix);
  };
 
  public float getPrix() {
	  return voiture.getPrix() + 1500;
  }
}