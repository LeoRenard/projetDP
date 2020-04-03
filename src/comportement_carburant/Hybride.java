package comportement_carburant;



/**
 * Class Hybride
 */
public class Hybride implements ComportementCarburant {


  public float getPrix() {
	  return 600;
  }

@Override
public String setCarburant() {
	// TODO Auto-generated method stub
	return "Carburant : Hybride ";

}

@Override
public void afficheCarburant() {
	// TODO Auto-generated method stub
	  System.out.println("Hybride");

}
  
}
