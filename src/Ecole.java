
public class Ecole {
	public String nom;
	public int capacite;

	public Ecole() {
		this.nom = "Lycee roches maigres";
		this.capacite = 10;
	}
	
	public Ecole(String name , int capacity) {
		this.nom = name;
		this.capacite = capacity;
	}
	
	

	@Override
	public String toString() {
		return " nom=" + nom + " || capacite=" + capacite ;
	}
	
	
	

}
