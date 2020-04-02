package assurance;



/**
 * Class Assurance
 */
public class Assurance {

  //
  // Fields
  //

  private String type;
  private float prixAn;
  
  //
  // Constructors
  //
  public Assurance () { };
  
 public void setType (String newVar) {
    type = newVar;
  }

  public String getType () {
    return type;
  }

  public void setPrixAn (float newVar) {
    prixAn = newVar;
  }

  public float getPrixAn () {
    return prixAn;
  }

}
