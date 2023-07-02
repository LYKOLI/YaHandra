import java.util.ArrayList;





public class Etablissement {
	public final int  CAPACITE_MAX = 10;
	public String nom;
	public NiveauEtablissent niveau;
	private ArrayList<Classe> liste_classe;
	public ArrayList<Professeur> liste_professeur;

	public Etablissement() {
		this.nom = "Lycee roches maigres";
		this.niveau = NiveauEtablissent.LYCEE;
		this.liste_classe = new ArrayList<Classe>();
		this.liste_professeur = new ArrayList<Professeur>();
	}

	
	public Etablissement(String nom, NiveauEtablissent niveau) {
		this.nom = nom;
		this.niveau = niveau;
		this.liste_classe = new ArrayList<Classe>();
		this.liste_professeur = new ArrayList<Professeur>();
	}


	public String toString() {
		return "Etablissement [nom=" + nom + ", niveau=" + niveau + "]";
	}

	
	public static void main(String[] args) {

		//Ecole 1	
		Etablissement lycoli = new Etablissement();

		lycoli.liste_professeur.add(new Professeur());
		lycoli.liste_professeur.add(new Professeur("BOULE","bill", Matiere.FRANCAIS));
		
		
		
		System.out.println(lycoli.toString());
		System.out.println(" ");
		System.out.println("  --------------------------------------------                      ");
		System.out.println("  --------------- liste prof----------------------------                      ");

		System.out.println("la taille des professeurs est egale a "+ lycoli.liste_professeur.size());
		System.out.println(lycoli.liste_professeur);
		
		System.out.println(" ");
		System.out.println("  --------------------------------------------                      ");
		System.out.println("  ----------------liste classe ----------------------------                      ");

		lycoli.liste_classe.add(new Classe());
		lycoli.liste_classe.add(new Classe( "SECONDE G", NiveauClasse.SECONDE, lycoli.liste_professeur.get(1) ));
		System.out.println("la taille de la liste des classe est egale a "+ lycoli.liste_classe.size());
		System.out.println(lycoli.liste_classe);
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * ////--ecole 2 Etablissement yavili = new Etablissement(
		 * "COLLEGE PLATEAU GOYAVE", Niveau.COLLEGE);
		 * System.out.println(yavili.toString());
		 * System.out.println(yavili.liste_professeur);
		 * System.out.println("la taille est egale e "+ yavili.liste_professeur.size());
		 * 
		 * 
		 * 
		 * 
		 */
	}
	

}
