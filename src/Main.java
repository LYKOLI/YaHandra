import java.util.ArrayList;

public class Main {

	public static int n1 = 5;
	public static int n2 = 20;
	public static Personne p;
	

	public static int carre(int nombre) {
		return nombre * nombre;
	}
	
	
	public static ArrayList<Integer> tableau;
	public static ArrayList<Integer> tableau2;
	public static ArrayList<Integer> tableau3;
	

	
	public static int valeurAbsolue(int nombre) {
		int resultat;
		if ( nombre > 0) {
			resultat = nombre;
		}
		else {
			resultat = nombre * (-1);
		}
		
		return resultat;
	}

	
	public static int sommeTableau(ArrayList<Integer> tableau) {
		 int resultat = 0;
		 for(int index=0; index < tableau.size(); index=index+1) {
			resultat = resultat + tableau.get(index);
		 }
		 return resultat;
	}
	

	public static void main(String[] args) {
	
		//on veux afficher les nombre de 0 à 10
		//for (int  n = 1 ; n < 10 ; n=n+2) {
		//	System.out.println(   carre(n)  );
		//} 
		
		int i = 101;
		while( i > 1 ) {
			if (i % 2 == 0) {//si i est paire
				i =  i -10;
			}
			else {
				i = i -4 ;
			}
		//	System.out.println(i);
		}
		
		
		tableau = new ArrayList<Integer>();
		tableau2 = new ArrayList<Integer>();
		for (int n=0; n<10;n=n+1) {
			tableau.add(n);
		}
		
		for (int n=10; n<20;n=n+1) {
			tableau.add(n);
		}
		 
		
		
		Personne a = new Personne();
		
		 
		 
		 
		 
		 
		
		
	}

}



