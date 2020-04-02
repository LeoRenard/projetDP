package main;
import java.util.ArrayList;

/**
 * Class Acheteur
 */
public class Acheteur {

	//
	// Fields
	//

	private String nom;
	private String prenom;
	private String numTel;
	private String adresse;
	private String email;
	private float budget;

	private ArrayList<Voiture> voitures;

	//
	// Constructors
	//
	public Acheteur () { 
		this.voitures = new ArrayList<Voiture>();
	};

	public Acheteur(String nom, String prenom, String numTel, String adresse, String email, float budget) {
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.adresse = adresse;
		this.email = email;
		this.budget = budget;
		this.voitures = new ArrayList<Voiture>();
	}

	public void addVoiture(Voiture voiture) {
		this.voitures.add(voiture);
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

	public void setNumTel (String newVar) {
		numTel = newVar;
	}

	public String getNumTel () {
		return numTel;
	}

	public void setAdresse (String newVar) {
		adresse = newVar;
	}

	public String getAdresse () {
		return adresse;
	}

	public void setEmail (String newVar) {
		email = newVar;
	}

	public String getEmail () {
		return email;
	}

	public void setBudget (float newVar) {
		budget = newVar;
	}

	public float getBudget () {
		return budget;
	}

	public void afficherVoitureParticulier() {

		String voit = "Voitures : "+"\n";
		for(Voiture v : voitures) {
			voit+= "- "+v.toStringAfficheMini()+"\n";
		}
		
		System.out.println(voit);
	}

	public void afficher() {
		System.out.println("Acheteur => "+nom+" "+prenom+" BUDGET : "+budget+" euros");
	}

}
