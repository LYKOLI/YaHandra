
public class Personne {
	public String nom;
	public int age;

	public Personne() {
		this.nom = "dencane";
		this.age = 25;
	}
	
	
	public void changerNom(String nouveau_nom) {
		this.nom = nouveau_nom;
	}
	
	public void changerAge(int nouveau_age) {
		this.age = nouveau_age;
	}
	
	
	
	
	public int getAge() {
		return this.age;
	}
	
	public  String getName() {
		return "";
	}
	
	
	public String affichePersonne() {
		return "nom = "+ this.nom + "  age= "+ this.age;
	}

}
