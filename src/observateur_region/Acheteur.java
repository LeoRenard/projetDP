package observateur_region;
import java.util.ArrayList;

import main.Concessionnaire;
import voiture.Voiture;

/**
 * Class Acheteur
 */
public class Acheteur implements Observateur{

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

	private ArrayList<Concessionnaire> list_concessionnaire_region;

	private Sujet concessionnairesRegion;

	//
	// Constructors
	//
	public Acheteur () { 
		this.voitures = new ArrayList<Voiture>();
		this.list_concessionnaire_region = new ArrayList<Concessionnaire>();
	};

	public Acheteur(String nom, String prenom, String numTel, String adresse, String email, float budget) {
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.adresse = adresse;
		this.email = email;
		this.budget = budget;
		this.voitures = new ArrayList<Voiture>();
		this.list_concessionnaire_region = new ArrayList<Concessionnaire>();
	}

	public Acheteur(String nom, String prenom, String numTel, String adresse, String email, float budget, Sujet concessionnairesRegion) {
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.adresse = adresse;
		this.email = email;
		this.budget = budget;
		this.voitures = new ArrayList<Voiture>();
		this.list_concessionnaire_region = new ArrayList<Concessionnaire>();
		this.concessionnairesRegion = concessionnairesRegion;
		concessionnairesRegion.enregistrerObservateur(this);

	}

	public void setSujet(Sujet concessionnairesRegion) {
		this.concessionnairesRegion = concessionnairesRegion;
		concessionnairesRegion.enregistrerObservateur(this);
	}

	@Override
	public void actualiser(ArrayList<Concessionnaire> list_concessionnaire_region) {
		// TODO Auto-generated method stub
		this.list_concessionnaire_region = list_concessionnaire_region;
		this.afficherConcessionnaireDisponible();

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

	public void afficherConcessionnaireDisponible() {
		String a = "Concessionnaires disponibles dans la région : "+"\n";
		if(list_concessionnaire_region.isEmpty()) {
			a+= "Il n'y a aucun de concessionnaire disponible dans votre région.";
		}
		else {
			for(int i = 0; i < list_concessionnaire_region.size(); i++) {
				a+=" - "+list_concessionnaire_region.get(i).getNom()+"\n";
			}
		}
		System.out.println(a);
	}

	public void afficherVoitureParticulier() {

		String voit = "Voitures : "+"\n";
		for(Voiture v : voitures) {
			voit+= "- "+v.getNom()+"\n";
		}

		System.out.println(voit);
	}

	public void afficher() {
		System.out.println("Acheteur => "+nom+" "+prenom+" BUDGET : "+budget+" euros");
	}


}
