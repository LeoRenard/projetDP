package marque;



/**
 * Class Marque
 */
public class Marque {

  private String nom;
  
  public Marque () { };
  
  public void setNom (String newVar) {
    nom = newVar;
  }

  public String getNom () {
    return nom;
  }
  
  public String toString() {
	  return nom;
  }

}
