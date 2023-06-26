import java.util.ArrayList;

public class Eleve {
	public String nom;
	public ArrayList<Integer> note = new ArrayList<>();

	public Eleve() {
		this.nom = "jacque";
		
		
		this.note.add(18);
		this.note.add(14);
		this.note.add(20);
		this.note.add(1);
	}

	@Override
	public String toString() {
		return "Eleve [nom=" + nom + ", note=" + note + "]";
	}
	
	
	public double calculMoyenne() {
		double resultat =0;
		
		for (int i=0; i<this.note.size(); i=i+1) {
			resultat = resultat + this.note.get(i);
		}
		
		resultat = resultat / this.note.size();
		
		return resultat;
	}

}
