package adaptateurMoto;

import carburant.Essence;
import voiture.Voiture;

public class AdaptateurMoto extends Voiture{
	MotoAbstraite moto;
	
	public AdaptateurMoto(MotoAbstraite moto) {
		this.moto = moto;
		carburant = new Essence();
		
	}
	
	@Override
	public void afficher() {
		moto.info();
	}
	
	public String toStringNomPrix() {
		return moto.nom+" "+moto.prix+" euros";
	}
	
	public String getNom() {
		return moto.nom;
	}
}
