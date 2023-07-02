import java.util.ArrayList;

public class Classe {
	public NiveauClasse niveau;
	public Professeur professeur_prinpale;
	public String nom;
	public ArrayList<Eleve> liste_eleve;
	
	
	public Classe() {	
		this.niveau = NiveauClasse.TERMINALE;
		this.nom = "Terminale B";
		this.liste_eleve = new ArrayList<Eleve>();
	}
	
	
	public Classe(String nom, NiveauClasse niveau, Professeur professeur_prinpale) {
		this.niveau = niveau;
		this.professeur_prinpale = professeur_prinpale;
		this.nom = nom;
		this.liste_eleve = new ArrayList<Eleve>();
	}


	@Override
	public String toString() {
		if (professeur_prinpale == null) {
			return  "(" + nom +  ", " + niveau + ", professeur_prinpale= pas de prof principal )";
		}
		else {
			return "(" + nom +  ", " + niveau + ", professeur_prinpale=" + professeur_prinpale.getNom()+")";
		}
	}

}
