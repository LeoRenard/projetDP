package adaptateurMoto;

import carburant.Essence;
import voiture.Voiture;

public class AdaptateurMoto extends Voiture{
	Moto moto;
	
	public AdaptateurMoto(Moto moto) {
		this.moto = moto;
		carburant = new Essence();
		
	}
	
	@Override
	public void afficher() {
		moto.info();
	}
}
