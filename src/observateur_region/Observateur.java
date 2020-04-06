package observateur_region;

import java.util.ArrayList;

import main.Concessionnaire;

public interface Observateur {
	public void actualiser(ArrayList<Concessionnaire> list_concessionnaire_region);
}
