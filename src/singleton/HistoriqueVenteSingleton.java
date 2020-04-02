package singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import main.Concessionnaire;

public class HistoriqueVenteSingleton {

	private static HistoriqueVenteSingleton uniqueInstance = new HistoriqueVenteSingleton();
	private FileWriter writer;
	private String msg = "";

	private HistoriqueVenteSingleton() {}

	//Retourne l'unique objet instancié 
	public static HistoriqueVenteSingleton getInstance() {
		return uniqueInstance;
	}
	
	//Methode pour ecrire dans un fichier 
	public void journaliser(String msg, Concessionnaire concessionnaire) {
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
		this.msg += "[" + sdf.format(d) + "] " + msg + "\n";
		
		try {
			writer = new FileWriter(concessionnaire.getNom()+".txt",true);
			writer.write(this.msg);
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
	
	//Methode pour fermer le fichier 
	public void terminerJournal() {
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(msg);
		this.msg = "";
	}

}
