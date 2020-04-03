package comportement_carburant;



/**
 * Class Diesel
 */
public class Diesel implements ComportementCarburant {

	
  public void afficheCarburant() { 
	  System.out.println("Diesel");
  };
  
  public String setCarburant() {
	  return "Carburant : Disesel ";
  }
  
  public float getPrix() {
	  return 400;
  }
}
