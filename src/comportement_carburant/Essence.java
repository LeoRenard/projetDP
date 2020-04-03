package comportement_carburant;



/**
 * Class Essence
 */
public class Essence implements ComportementCarburant {

  public void setCarburant() { 
	  System.out.println("Essence");
	  //this.setPrixLitre(1.41f);
  };

  public float getPrix() {
	  return 200;
  }
  
}
