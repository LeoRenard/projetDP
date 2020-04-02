package main;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import singleton.HistoriqueVenteSingleton;

/**
 * Class Concessionnaire
 */
public class Concessionnaire {

	//
	// Fields
	//

	private String nom;
	private String adresse;
	private String numTel;
	private ArrayList<Voiture> voitures;
	private ArrayList<Vendeur> vendeurs;
	private Acheteur acheteur;
	private Map<String,ArrayList<String>> horaires;


	public Concessionnaire () { 
		voitures = new ArrayList<Voiture>();
		vendeurs = new ArrayList<Vendeur>();
	};

	public Concessionnaire (String nom, String adresse, String numTel) { 
		this.nom = nom;
		this.adresse = adresse;
		this.numTel = numTel;
		voitures = new ArrayList<Voiture>();
		vendeurs = new ArrayList<Vendeur>();
	};

	public void transaction(Voiture voiture, Vendeur vendeur) {
		if(acheteur == null) {
			System.out.println("Aucune personne ne veut acheter cette voiture");
		}
		else {
			if(vendeurs.contains(vendeur)) {
				if(acheteur.getBudget() >= voiture.getPrix()) {
					acheteur.addVoiture(voiture);
					acheteur.setBudget(acheteur.getBudget() - voiture.getPrix());
					this.voitures.remove(voiture);
					
					int indexVendeur = vendeurs.indexOf(vendeur);
					vendeurs.get(indexVendeur).setNbClient(vendeurs.get(indexVendeur).getNbClient()+1);
					
					System.out.println("Achat bien effectué !");
					
					String msgJournalisation = "\n"+voiture.toStringAfficheMini()+" prix : "+voiture.getPrix()+
							" euros; Vendu par "+vendeur.getNom();
					HistoriqueVenteSingleton.getInstance().journaliser(msgJournalisation, this);
					HistoriqueVenteSingleton.getInstance().terminerJournal();
					
					acheteur.afficherVoitureParticulier();
				}
				else
					System.out.println("Vous n'avez pas assez d'argent !");
			}
			else 
				System.out.println("Ce vendeur ne travaille pas dans cette concession !");
		}
	
	}

	public void addVoiture(Voiture voiture) {
		voitures.add(voiture);
	}

	public void addVendeur(Vendeur vendeur) {
		vendeurs.add(vendeur);
	}

	public void addAcheteur(Acheteur acheteur) {
		this.acheteur = acheteur;
	}

	public void setNom (String newVar) {
		nom = newVar;
	}

	public String getNom () {
		return nom;
	}

	public void setAdresse (String newVar) {
		adresse = newVar;
	}

	public String getAdresse () {
		return adresse;
	}

	public void setNumTel (String newVar) {
		numTel = newVar;
	}

	public String getNumTel () {
		return numTel;
	}

	public void setVoitures (ArrayList<Voiture> newVar) {
		voitures = newVar;
	}

	public ArrayList getVoitures () {
		return voitures;
	}

	public void setVendeurs (ArrayList<Vendeur> newVar) {
		vendeurs = newVar;
	}

	public ArrayList<Vendeur> getVendeurs () {
		return vendeurs;
	}

	public void setAcheteur (Acheteur newVar) {
		acheteur = newVar;
	}

	public Acheteur getAcheteur () {
		return acheteur;
	}

	public void setHoraires (Map<String,ArrayList<String>> newVar) {
		horaires = newVar;
	}

	public Map<String,ArrayList<String>> getHoraires () {
		return horaires;
	}

	//Methode permettant d'ajouter l'horaire douverture et de fermeture d'un jours 
	public void addHoraire(String jours, String ouverture, String fermeture) {
		ArrayList<String> h = new ArrayList<String>();
		h.add(ouverture);
		h.add(fermeture);
		horaires.put(jours, h);
	}

	public String afficheHoraire() {
		String h = "HORAIRES :"+"\n";
		if(horaires == null) {
			h+= "Aucun horaires renseignés.";
		}
		else {
			for(Map.Entry<String, ArrayList<String>> entry : horaires.entrySet()) {
				h+= " - "+entry.getKey()+" ";
				for(String s : entry.getValue()) {
					h+=s+" ";
				}
				h+="\n";
			}
		}
		return h;
	}

	public String toString() {
		String b = "*********************************";
		String info = "Concessionnaire "+nom+" \n Coordonnées => Numero de téléphone : "+numTel+", adresse : "+adresse+" ";

		String voit = "Voitures disponibles : "+"\n";

		if(voitures != null) {
			for(Voiture v : voitures) {
				voit+= "- "+v.toString()+"\n";
			}
		}
		else voit = "Aucune voiture disponible.";

		return b+"\n"+info+"\n"+afficheHoraire()+"\n"+voit+b;
	}
	
	public void afficherVendeur() {
		System.out.println("Vendeurs de la concession "+this.nom+" : ");
		for(Vendeur v : vendeurs) {
			v.afficher();
		}
		System.out.println("\n");
	}
	
	public void afficher() {
		System.out.println(toString());
	}

}
