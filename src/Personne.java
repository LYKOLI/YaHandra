
public class Personne {
	public String nom;
	public int age;
	public Animal animal ;

	public Personne() {
		this.nom = "dencane";
		this.age = 25;
		this.animal = new Animal();
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
		return this.nom;
	}
	
	
	public void changeNomAge(String nouveau_nom, int nouveau_age) {
	
	}
	
	public String getNomAge() {
		return "";
	}
	
	

	
	public String affichePersonne() {
		return "nom = "+ this.nom + "  age= "+ this.age;
	}

}
