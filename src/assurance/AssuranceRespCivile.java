package assurance;

public class AssuranceRespCivile implements Assurance {

	public void infosAssurance() {
		System.out.println("L'assurance responsabilité civile est la forme la plus simple d'assurance."
				+"\n"+"Elle est couvre les dommages aux tiers causés par vous avec votre véhicule.");
		
	}

	public float prixAnnee() {
		return 282.5f;
	}

}
