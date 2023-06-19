


public class Main {

	public static String text = "HELLO";
	public static int n1 = 1;
	public static int n2 = 2;
	public static int n3 =  n1 + n2;
	public static double t =  100000000000.0005;
	public static Personne A;
	

	public static void main(String[] args) {
		A = new Personne();
		
		System.out.println(A.getAge());
		
		A.changerNom("zeler");
		A.changerAge(100);
		
		System.out.println(A.affichePersonne());
		
	}

}



