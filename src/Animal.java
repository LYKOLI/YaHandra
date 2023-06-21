
public class Animal {
	public  String type;
	public  String nom;
	public  int position;

	public Animal() {
		this.nom = "gatz";
		this.type = "chien";
		this.position = 0;
	}
	
	
	public void avancer() {
		this.position = this.position+1;
	}
	
	public void avancerPlus(int pas) {
		for(int i = 0; i<pas ;i=i+1) {
			this.avancer();
		}
		
		
		
	}
	


}
