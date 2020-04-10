package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import observateur_region.Acheteur;
import singleton.HistoriqueVenteSingleton;
import voiture.Voiture;
import option.*;

/**
 * Class Concessionnaire
 */
public class Concessionnaire {

	//
	// Fields
	//
	Scanner sc = new Scanner(System.in);

	private String nom;
	private String adresse;
	private String numTel;
	private ArrayList<Voiture> voitures;
	private ArrayList<Vendeur> vendeurs;
	private Acheteur acheteur;
	private Map<String, ArrayList<String>> horaires;

	public Concessionnaire() {
		voitures = new ArrayList<Voiture>();
		vendeurs = new ArrayList<Vendeur>();
		horaires = new HashMap<String, ArrayList<String>>();
	};

	public Concessionnaire(String nom, String adresse, String numTel) {
		this.nom = nom;
		this.adresse = adresse;
		this.numTel = numTel;
		voitures = new ArrayList<Voiture>();
		vendeurs = new ArrayList<Vendeur>();
		horaires = new HashMap<String, ArrayList<String>>();
	};

	// Méthode d'achat de voiture avec l'indice de la voiture dans la liste de
	// voitures du concessionnaire
	public void transaction(int i, Vendeur vendeur) {
		if (acheteur == null) {
			System.out.println("Aucune personne ne veut acheter cette voiture");
		} else {
			if (vendeurs.contains(vendeur)) {
				if (acheteur.getBudget() >= voitures.get(i).getPrix()) {
					acheteur.addVoiture(voitures.get(i));
					acheteur.setBudget(acheteur.getBudget() - voitures.get(i).getPrix());
					this.voitures.remove(i);

					int indexVendeur = vendeurs.indexOf(vendeur);
					vendeurs.get(indexVendeur).setNbClient(vendeurs.get(indexVendeur).getNbClient() + 1);

					System.out.println("Achat bien effectué !");

					String msgJournalisation = "\n" + voitures.get(i).getNom() + " prix : " + voitures.get(i).getPrix()
							+ " euros; Vendu par " + vendeur.getNom();
					HistoriqueVenteSingleton.getInstance().journaliser(msgJournalisation, this);
					HistoriqueVenteSingleton.getInstance().terminerJournal();

					acheteur.afficherVoitureParticulier();
				} else
					System.out.println("Vous n'avez pas assez d'argent !");
			} else
				System.out.println("Ce vendeur ne travaille pas dans cette concession !");
		}

	}

	// Methode de transaction avec la voiture placée directement en paramètre
	public void transaction(Voiture voiture, Vendeur vendeur) {
		if (acheteur == null) {
			System.out.println("Aucune personne ne veut acheter cette voiture");
		} else {
			if (vendeurs.contains(vendeur)) {
				if (acheteur.getBudget() >= voiture.getPrix()) {
					acheteur.addVoiture(voiture);
					acheteur.setBudget(acheteur.getBudget() - voiture.getPrix());
					this.voitures.remove(voiture);

					int indexVendeur = vendeurs.indexOf(vendeur);
					vendeurs.get(indexVendeur).setNbClient(vendeurs.get(indexVendeur).getNbClient() + 1);

					System.out.println("Achat bien effectué !");

					String msgJournalisation = "\n" + voiture.getNom() + " prix : " + voiture.getPrix()
							+ " euros; Vendu par " + vendeur.getNom();
					HistoriqueVenteSingleton.getInstance().journaliser(msgJournalisation, this);
					HistoriqueVenteSingleton.getInstance().terminerJournal();

					acheteur.afficherVoitureParticulier();
				} else
					System.out.println("Vous n'avez pas assez d'argent !");
			} else
				System.out.println("Ce vendeur ne travaille pas dans cette concession !");
		}

	}

	// Methode de transaction dynamique
	public void transaction() {
		int indexVoit = -1;
		if (acheteur == null) {
			System.out.println("Aucune personne ne veut acheter cette voiture");
		} else {
			System.out.println("Quelle voiture voulez-vous ? (Veuillez entrer le numero correspondant)");
			this.afficheVoiture();
			while (indexVoit == -1) {
				indexVoit = sc.nextInt();
			}

			System.out
					.println("Avec quel vendeur voulez-vous réaliser la transaction ? (Entrer le numero correspondant");
			this.afficherVendeur();
			Integer indexVendeur = null;
			while (indexVendeur == null) {
				indexVendeur = sc.nextInt();
			}

			if (!vendeurs.contains(vendeurs.get(indexVendeur))) {
				System.out.println("Ce numero ne correspond à aucun vendeur, nous vous en assignons un par défaut :");
				indexVendeur = (int) (Math.random() * vendeurs.size());
				System.out.println(vendeurs.get(indexVendeur).getPrenom() + " " + vendeurs.get(indexVendeur).getNom());
			}
			if (voitures.contains(voitures.get(indexVoit))) {

				// Ajout options, assurances ici
				ajoutOptionVoiture(voitures.get(indexVoit));

				Voiture v = this.recupVoiture(indexVoit);

				if (acheteur.getBudget() >= v.getPrix()) {
					acheteur.addVoiture(v);
					acheteur.setBudget(acheteur.getBudget() - v.getPrix());

					vendeurs.get(indexVendeur).setNbClient(vendeurs.get(indexVendeur).getNbClient() + 1);

					System.out.println("Achat bien effectué !");

					String msgJournalisation = "\n" + voitures.get(indexVoit).getNom() + " prix : "
							+ voitures.get(indexVoit).getPrix() + " euros; Vendu par "
							+ vendeurs.get(indexVendeur).getNom();
					HistoriqueVenteSingleton.getInstance().journaliser(msgJournalisation, this);
					HistoriqueVenteSingleton.getInstance().terminerJournal();

					this.voitures.remove(indexVoit);

					acheteur.afficherVoitureParticulier();
				} else
					System.out.println("Vous n'avez pas assez d'argent !");
			} else {
				System.out.println("Ce numero ne correspond à aucune voiture ! ");
				this.transaction();
			}
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

	public void setNom(String newVar) {
		nom = newVar;
	}

	public String getNom() {
		return nom;
	}

	public void setAdresse(String newVar) {
		adresse = newVar;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setNumTel(String newVar) {
		numTel = newVar;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setVoitures(ArrayList<Voiture> newVar) {
		voitures = newVar;
	}

	public ArrayList getVoitures() {
		return voitures;
	}

	public void setVendeurs(ArrayList<Vendeur> newVar) {
		vendeurs = newVar;
	}

	public ArrayList<Vendeur> getVendeurs() {
		return vendeurs;
	}

	public void setAcheteur(Acheteur newVar) {
		acheteur = newVar;
	}

	public Acheteur getAcheteur() {
		return acheteur;
	}

	public void setHoraires(Map<String, ArrayList<String>> newVar) {
		horaires = newVar;
	}

	public Map<String, ArrayList<String>> getHoraires() {
		return horaires;
	}

	// Methode permettant d'ajouter l'horaire douverture et de fermeture d'un jours
	public void addHoraire(String jours, String ouverture, String fermeture) {
		ArrayList<String> h = new ArrayList<String>();
		h.add(ouverture);
		h.add(fermeture);
		horaires.put(jours, h);
	}

	public String afficheHoraire() {
		String h = "HORAIRES :" + "\n";
		if (horaires == null) {
			h += "Aucun horaires renseignés.";
		} else {
			for (Map.Entry<String, ArrayList<String>> entry : horaires.entrySet()) {
				h += " - " + entry.getKey() + " ";
				for (String s : entry.getValue()) {
					h += s + " ";
				}
				h += "\n";
			}
		}
		return h;
	}

	public Voiture recupVoiture(int i) {
		if (voitures.get(i) == null) {
			System.out.println("Aucune voiture ne correspond à ce numéro");
			return null;
		} else
			return voitures.get(i);
	}

	public void afficheVoiture() {
		if (voitures != null) {
			for (int i = 0; i < voitures.size(); i++) {
				System.out.println(i + ") " + voitures.get(i).toStringNomPrix());
			}
		} else
			System.out.println("Aucune voiture disponible.");
		;
	}

	public String toString() {
		String b = "*********************************";
		String info = "Concessionnaire " + nom + " \n Coordonnées => Numero de téléphone : " + numTel + ", adresse : "
				+ adresse + " ";

		String voit = "Voitures disponibles : " + "\n";

		if (voitures != null) {
			for (Voiture v : voitures) {
				voit += "- " + v.toStringNomPrix() + "\n";
			}
		} else
			voit = "Aucune voiture disponible.";

		return b + "\n" + info + "\n" + afficheHoraire() + "\n" + voit + b;
	}

	public void afficherVendeur() {
		System.out.println("Vendeurs de la concession " + this.nom + " : ");
		int i = 0;
		for (Vendeur v : vendeurs) {
			System.out.print(i + ") ");
			v.afficher();
			i++;
		}
		System.out.println("\n");
	}

	public void afficher() {
		System.out.println(toString());
	}

	public Voiture ajoutOptionVoiture(Voiture v) {
		boolean fin = false;
		String[] option = initOptionVoiture();
		String str = null;
		System.out.println("actuellement votre voiture est composé de : " + "\n" + v.toStringNomPrix());
		System.out.println("souhaitez vous ajouter une option à votre voiture ?");
		System.out.println("les options disponible sont : ");
		afficheTabEnString(option);

		while (fin == false) {

			str = sc.nextLine();

			if (str != "non" || str != "NON" || str != "Non") {
				
				if(str.equals("1")) {
					v = new Attelage(v);
					option[0] = "no";
				}
				else if(str.equals("2")) {
					v = new Climatisation(v);
					option[1] = "no";
				}
				else if(str.equals("3")) {
					v = new RadarDeRecul(v);
					option[2] = "no";
				}
				else if(str.equals("4")) {
					v = new ToitOuvrant(v);
					option[3] = "no";
				}
				else {
					System.out.println("Entrez une valeur correct svp");
				}
				
				v.afficher();
				System.out.println("Option ajouté ! les options encore disponible sont : ");
				afficheTabEnString(option);
				System.out.println("Entrez un numéro de l'option ou entrez NON");
				
			}else fin = true;

		
				
			
		}
		return v;
	}

	public String[] initOptionVoiture() {
		String[] tab = { "Attelage", "Climatisation", null, "Toit Ouvrant" };
		return tab;
	}

	public String[] initOptionAssurance() {
		String[] tab = { "Attelage", "Climatisation", "Option", "Radar de Recul", "Toit Ouvrant" };
		return tab;
	}

	public void afficheTabEnString(String[] tab) {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != "no")
				System.out.println((i + 1) + " : " + tab[i] + "." + "\n");
		}
	}
}
