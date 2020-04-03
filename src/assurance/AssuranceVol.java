package assurance;

public class AssuranceVol implements Assurance {

	public void infosAssurance() {
		System.out.println("L'assurance incendie, vol, bris de glace etc couvre tous les dommages"
				+ "causés à votre véhicule autres que les dommages accidentels.");
		
	}

	public float prixAnnee() {
		return 300f;
	}

}
