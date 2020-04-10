package main;
import option.*;
import voiture.ClioTce;
import voiture.Voiture;
import marque.*;
import observateur_region.Acheteur;
import observateur_region.RegionCentreConcessionnaire;
import observateur_region.RegionIleDeFranceConcessionnaire;
import carburant.*;
import factory_voiture.FabriqueDeVoiture;
import factory_voiture.FabriqueDeVoitureAbstraite;

import java.util.Scanner;

import adaptateurMoto.*;
import assurance.*;

public class Test {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************INITIALISATION****************");

		RegionCentreConcessionnaire regionCentreConcessionnaire = new RegionCentreConcessionnaire();
		RegionIleDeFranceConcessionnaire regionIDFConcessionnaire = new RegionIleDeFranceConcessionnaire();

		//Fabrique de voiture
		FabriqueDeVoitureAbstraite fabriqueDeVoiture = new FabriqueDeVoiture();
		Voiture clioTce = fabriqueDeVoiture.creerVoiture("ClioTce");
		Voiture clioTce2 = fabriqueDeVoiture.creerVoiture("ClioTce");
		Voiture clioDci = fabriqueDeVoiture.creerVoiture("ClioDci");
		Voiture P208Essence = fabriqueDeVoiture.creerVoiture("P208Essence");
		Voiture C2Diesel = fabriqueDeVoiture.creerVoiture("C2Diesel");
		Voiture P208Diesel = fabriqueDeVoiture.creerVoiture("P208Diesel");
		
		//Adaptateur Moto 
		Voiture kawazakiZ800 = new AdaptateurMoto(new KawazakiZ800());
		Voiture yamahaMT07 = new AdaptateurMoto(new YamahaMT07());

		//Concessionnaire
		Concessionnaire concessionnaire1 = new Concessionnaire("Pere&Co","142 rue des Lilas", "0683902122");
		Concessionnaire concessionnaire2 = new Concessionnaire("Auto-Sur","33 boulevard des Jonquilles", "0705221940");
		Concessionnaire concessionnaire3 = new Concessionnaire("JarrA240","3 avenue du Petit Sentier", "0685322297");
		Concessionnaire concessionnaire4 = new Concessionnaire("AutoPromo","66 rue de la Camomille", "0789679045");
		
		concessionnaire1.addHoraire("lundi-samedi", "8h", "18h");
		concessionnaire1.addVoiture(clioTce);
		concessionnaire1.addVoiture(clioDci);

		concessionnaire2.addHoraire("mardi-vendredi", "7h", "20h");
		concessionnaire2.addVoiture(C2Diesel);
		concessionnaire2.addVoiture(kawazakiZ800);
		concessionnaire2.addVoiture(yamahaMT07);

		concessionnaire3.addHoraire("lundi-dimanche", "8h30", "18h30");
		concessionnaire3.addVoiture(P208Essence);

		concessionnaire4.addHoraire("lundi-dimanche", "8h30", "18h30");
		concessionnaire4.addVoiture(clioTce2);
		concessionnaire4.addVoiture(C2Diesel);
		
		//Vendeur 
		Vendeur vendeur1 = new Vendeur("Sam","Jean","jean.sam@gmail.com");
		Vendeur vendeur2 = new Vendeur("Pierre","Louis","pl@orange.fr");
		Vendeur vendeur3 = new Vendeur("Mou","Jacques","mou_jacques@hotmail.fr");
		Vendeur vendeur4 = new Vendeur("Toc","Tac","toctac@gmail.com");
		Vendeur vendeur5 = new Vendeur("Francis","Kristos","pl@orange.fr");
		
		concessionnaire2.addVendeur(vendeur4);
		concessionnaire2.addVendeur(vendeur5);
		
		concessionnaire4.addVendeur(vendeur1);
		concessionnaire4.addVendeur(vendeur2);
		concessionnaire4.addVendeur(vendeur3);

		//DP observateur
		regionCentreConcessionnaire.addConcessionnaires(concessionnaire1);
		regionCentreConcessionnaire.addConcessionnaires(concessionnaire2);

		regionIDFConcessionnaire.addConcessionnaires(concessionnaire3);
		regionIDFConcessionnaire.addConcessionnaires(concessionnaire4);

		//Acheteur
		Acheteur acheteur1 = new Acheteur("Duck", "Riri", "0683902133", "11 rue Marie Virginie", "riri@outlook.fr", 20000);
		Acheteur acheteur2 = new Acheteur("Duck", "Fifi", "0683875400", "111 rue Begunia", "titi@outlook.fr", 10000);
		Acheteur acheteur3 = new Acheteur("Duck", "Loulou", "0683120911", "30 rue des meniers", "loulou@outlook.fr", 7000);

		System.out.println("****************ACHETEUR****************");
		acheteur1.afficher();
		acheteur2.afficher();
		acheteur3.afficher();
		
		System.out.println("****************PATTERN OBSERVATEUR****************");
		System.out.println("AVANT :");
		System.out.println(acheteur1.getPrenom());
		acheteur1.afficherConcessionnaireDisponible();
		System.out.println(acheteur2.getPrenom());
		acheteur2.afficherConcessionnaireDisponible();
		System.out.println(acheteur3.getPrenom());
		acheteur3.afficherConcessionnaireDisponible();
		
		System.out.println();
		System.out.println("APRES :");
		System.out.println(acheteur1.getPrenom());
		acheteur1.setSujet(regionIDFConcessionnaire);
		System.out.println(acheteur2.getPrenom());
		acheteur2.setSujet(regionIDFConcessionnaire);
		System.out.println(acheteur3.getPrenom());
		acheteur3.setSujet(regionCentreConcessionnaire);
		
		System.out.println();
		System.out.println("****************TEST OBSERVATEUR - AJOUT DE CONCESSIONNAIRE****************");
		Concessionnaire concessionnaire5 = new Concessionnaire("CarPlus","4 rue des Mimosa", "07843790");
		concessionnaire5.addHoraire("lundi-vendredi", "9h", "19h");
		concessionnaire5.addVoiture(P208Diesel);
		
		regionCentreConcessionnaire.addConcessionnaires(concessionnaire5);
		
		System.out.println("Ajout d'un concessionnaire dans la région centre. "+acheteur3.getPrenom()+" voit donc sa liste de concessionnaire"
				+ " mis à jour :");
		acheteur3.afficherConcessionnaireDisponible();
		
		System.out.println();
		System.out.println("****************SIMULATION ACHAT DE MOTO POUR "+acheteur1.getPrenom()+" "+acheteur1.getNom()+" (REGION : IDF)****************");
		
		System.out.println("Selection du concessionnaire "+concessionnaire4.getNom());
		concessionnaire4.addAcheteur(acheteur1);
		concessionnaire4.afficher();
		concessionnaire4.afficherVendeur();
		
		concessionnaire4.transaction();
		
		concessionnaire4.afficher();

		System.out.println();
		System.out.println("****************SIMULATION ACHAT DE VOITURE POUR "+acheteur3.getPrenom()+" "+acheteur3.getNom()+" (REGION : Centre)****************");
		
		System.out.println("Selection du concessionnaire "+concessionnaire2.getNom());
		concessionnaire2.addAcheteur(acheteur3);
		concessionnaire2.afficher();
		concessionnaire2.afficherVendeur();
		
		concessionnaire2.transaction();
		
		concessionnaire2.afficher();
	}

}
