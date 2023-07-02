
public class Professeur {

	private String nom;
	public String prenom;
	public Matiere matiere;
	
	
	@Override
	public String toString() {
		return "( " + nom + "," + prenom + ", " + matiere + ")";
	}


	public Professeur() {
		this.nom = "JACK";
		this.prenom = "Bob";
		this.matiere = Matiere.PYSIQUE_CHIMIE;
	}
	
	
	public Professeur(String nom, String prenom, Matiere matiere) {
		this.nom = nom;
		this.prenom = prenom;
		this.matiere = matiere;
	}
	
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom =nom;
	}
	
}
