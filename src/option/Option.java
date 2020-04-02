package option;



/**
 * Class Option
 */
public class Option {

  //
  // Fields
  //

  private String nom;
  private float prix;
  
  //
  // Constructors
  //
  public Option () { };
  
  public void setNom (String newVar) {
    nom = newVar;
  }

  public String getNom () {
    return nom;
  }

  public void setPrix (float newVar) {
    prix = newVar;
  }

  public float getPrix () {
    return prix;
  }
  
  public String toString() {
	  return this.nom+" "+this.prix;
  }
  
  public void afficher() {
	  System.out.println(this.nom+" "+this.prix+" euros ");
  }

}
