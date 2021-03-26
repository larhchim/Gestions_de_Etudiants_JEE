package Model;
import java.util.ArrayList;

public class GestionEtudiants {
	
	
	@Override
	public String toString() {
		return "GestionEtudiants [nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + "]";
	}

	private ArrayList<GestionEtudiants> maList;
	private String nom;
	private String prenom;
	private String cin;
	
	public GestionEtudiants(String nom, String prenom, String cin) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		
	}
	
	public GestionEtudiants() {
		
	}

	public String getNom() {
		
		return nom;
		
	}

	public void setNom(String nom) {
		
		this.nom = nom;
		
	}

	public String getPrenom() {
		
		return prenom;
		
	}

	public void setPrenom(String prenom) {
		
		this.prenom = prenom;
		
	}

	public String getCin() {
		
		return cin;
		
	}

	public void setCin(String cin) {
		
		this.cin = cin;
		
	}
	
	public ArrayList<GestionEtudiants> Function(){
		
		maList=new ArrayList<GestionEtudiants>();
		
		maList.add(new GestionEtudiants("LARHCHIM","ISMAIL","AD9647"));
		maList.add(new GestionEtudiants("CHIBANE","YAHYA","ADF965"));
		maList.add(new GestionEtudiants("BENREFAD","MEHDI","A8892"));
		maList.add(new GestionEtudiants("BALOUKI","YOUSSEF","AB9633"));
		maList.add(new GestionEtudiants("SAID","SAIDY","AR8963"));
		maList.add(new GestionEtudiants("ZAIDI","BIKI","AS369"));
		maList.add(new GestionEtudiants("FIFI","FIFO","AEZ985"));
		maList.add(new GestionEtudiants("DODO","RIMY","AG1236"));
		maList.add(new GestionEtudiants("MIMI","MAMA","ART963"));
		maList.add(new GestionEtudiants("GALA","GALY","QSW693"));
		maList.add(new GestionEtudiants("BIKI","TAHA","ARTYU96"));
		maList.add(new GestionEtudiants("NOUSAIR","MEZRAOUI","AZ46982"));
		maList.add(new GestionEtudiants("LIONEL","MESSI","W69872"));

		
		return maList;
		
	}
	
	
	
	
	

}
