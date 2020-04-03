package comportement_carburant;



/**
 * Class Essence
 */
public class Essence implements ComportementCarburant {


  public float getPrix() {
	  return 200;
  }

@Override
public String setCarburant() {
	return "Carburant : Essence ";
}

@Override
public void afficheCarburant() {
	// TODO Auto-generated method stub
	System.out.println("Essence");
}
  
}
