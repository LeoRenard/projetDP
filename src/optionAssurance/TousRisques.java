package optionAssurance;

import assurance.Assurance;

public class TousRisques extends OptionAssurance {
	  
	public TousRisques (Assurance assurance) {
		this.assurance = assurance;
		this.description = "L'assurance tous risques couvre tout les dommages accidentels. "
				+"\n"+"Rôle important si vous êtes responsable d'un accident. "
				+"\n"+"Celle-ci englobe aussi les frais de réparations et la location potentielle d'une voiture provisoire";
		this.prix = 1200;
	}
	
}
