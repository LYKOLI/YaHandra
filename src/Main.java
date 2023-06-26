



public class Main {



	public static void main(String[] args) {

		Ecole e1 = new Ecole();
		Ecole harvard = new Ecole("HARVARD", 16);

		System.out.println(    e1.toString()   );
		System.out.println(    harvard.toString()   );
		
		
		Eleve jaque = new Eleve();
		System.out.println(  jaque.toString()  );
		
		System.out.println(  jaque.calculMoyenne() );
		



	}

}



