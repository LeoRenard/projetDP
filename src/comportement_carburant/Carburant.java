package carburant;


import java.util.*;


/**
 * Class Carburant
 */
public class Carburant {

  private String nomCarbu;
  private float prixLitre;
  
  public Carburant () { };
  
  public void setNomCarbu (String newVar) {
    nomCarbu = newVar;
  }

  public String getNomCarbu () {
    return nomCarbu;
  }

  public void setPrixLitre (float newVar) {
    prixLitre = newVar;
  }

  public float getPrixLitre () {
    return prixLitre;
  }
  
  public String toString() {
	  return nomCarbu;
  }

}
