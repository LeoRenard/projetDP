package comportement_carburant;



/**
 * Class Hybride
 */
public class Hybride implements ComportementCarburant {

  public void setCarburant() { 
	  System.out.println("Hybride");
	  //this.setPrixLitre(1.0f);
  };

  public float getPrix() {
	  return 600;
  }
  
}
