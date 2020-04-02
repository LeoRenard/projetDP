package modele;

import marque.Marque;

/**
 * Class Modele
 */
public class Modele {

  //
  // Fields
  //

  private String nom;
  private float prix;
  private Marque marque;
  
  //
  // Constructors
  //
  public Modele () { };
  
  public Modele (Marque marque) { 
	  this.marque = marque;
  };
  
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

  public void setMarque (Marque newVar) {
    marque = newVar;
    this.nom+=" "+newVar.getNom();
  }

  public Marque getMarque () {
    return marque;
  }
  
  public String toString() {
	  return nom+" prix de base = "+prix+" euros";
  }

  public void afficher() {
	  System.out.println(marque.toString()+" "+nom+" prix de base = "+prix+" euros");
  }

  
}
