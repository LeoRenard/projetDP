

/**
 * Class Vendeur
 */
public class Vendeur {

  private String nom;
  private String prenom;
  private String email;
  private int nbClient;
  

  public Vendeur () { };
  
  public Vendeur(String nom, String prenom, String email) {
	  this.nom = nom;
	  this.prenom = prenom;
	  this.email = email;
	  this.nbClient = 0;
  }
  
  public void setNom (String newVar) {
    nom = newVar;
  }

  public String getNom () {
    return nom;
  }

  public void setPrenom (String newVar) {
    prenom = newVar;
  }

  public String getPrenom () {
    return prenom;
  }

  public void setEmail (String newVar) {
    email = newVar;
  }

  public String getEmail () {
    return email;
  }

public int getNbClient() {
	return nbClient;
}

public void setNbClient(int nbClient) {
	this.nbClient = nbClient;
}

public void afficher() {
	System.out.println(nom+" "+prenom+", nombre de ventes : "+this.nbClient);
}

}
