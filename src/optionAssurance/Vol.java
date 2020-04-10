package optionAssurance;

import assurance.Assurance;

public class Vol extends OptionAssurance {
	
	public Vol(Assurance assurance) {
		this.assurance = assurance;
		this.description = "L'assurance incendie, vol, bris de glace etc couvre tous les dommages"
				+ "causés à votre véhicule autres que les dommages accidentels.";
		this.prix = 300;
	}
}
