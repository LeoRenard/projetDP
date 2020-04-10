package assurance;

public class AssuranceRespCivile implements Assurance {

	String description;
	float prix;
	
	public AssuranceRespCivile() {
		description = "L'assurance responsabilité civile est la forme la plus simple d'assurance."
				+"\n"+"Elle est couvre les dommages aux tiers causés par vous avec votre véhicule.";
		prix = (float) 282.5;
	}
	public void infosAssurance() {
		System.out.println("L'assurance responsabilité civile est la forme la plus simple d'assurance."
				+"\n"+"Elle est couvre les dommages aux tiers causés par vous avec votre véhicule.");
		
	}

	public float prixAnnee() {
		return 282.5f;
	}

	public float getPrix() {
		return prix;
	};
	
	public String getDescription() {
		return description;
	}
	
	public void afficher() {
		System.out.println(getDescription());
		System.out.println("Prix à l'année : " + getPrix());
		
	};
}
