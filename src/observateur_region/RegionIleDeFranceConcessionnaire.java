package observateur_region;

import java.util.ArrayList;

import main.Concessionnaire;

public class RegionIleDeFranceConcessionnaire implements Sujet {

	private ArrayList<Observateur> observateurs = new ArrayList<Observateur>();
	private ArrayList <Concessionnaire> list_concessionnaire_region = new ArrayList<Concessionnaire>();
	
	@Override
	public void enregistrerObservateur(Observateur o) {
		observateurs.add(o);
		o.actualiser(list_concessionnaire_region);
	}

	@Override
	public void supprimerObservateur(Observateur o) {
		int i = observateurs.indexOf(o);
        if (i >= 0) {
            observateurs.remove(i);
        }
	}

	@Override
	public void notiferObservateurs() {
		for (int i = 0; i < observateurs.size(); i++) {
            Observateur observer = (Observateur)observateurs.get(i);
            observer.actualiser(list_concessionnaire_region);
        }
	}
	
	public void actualiserConcessionnaires() {
		notiferObservateurs();
	}
	
	public void addConcessionnaires(Concessionnaire concessionnaire) {
		list_concessionnaire_region.add(concessionnaire);
		actualiserConcessionnaires();
	}

}
