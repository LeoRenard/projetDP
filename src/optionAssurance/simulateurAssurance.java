package optionAssurance;

import assurance.Assurance;
import assurance.AssuranceRespCivile;
import optionAssurance.*;

public class simulateurAssurance {

	public static void main(String[] args) {
		Assurance incroyable = new AssuranceRespCivile();
		incroyable.afficher();
		incroyable = new Vol(incroyable);
		incroyable.afficher();
	}
}
