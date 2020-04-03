package assurance;

public class AssuranceTousRisques implements Assurance {

	public void infosAssurance() {
		System.out.println("L'assurance tous risques couvre tout les dommages accidentels. "
				+"\n"+"Rôle important si vous êtes responsable d'un accident. "
				+"\n"+"Celle-ci englobe aussi les frais de réparations et la location potentielle d'une voiture provisoire");
		
	}

	@Override
	public float prixAnnee() {
		return 1200f;
	}

}
