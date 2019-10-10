import java.util.Scanner;

public class main {

	public static void main(String[] args){
		
		final String question = "Entrez un nombre entier: ";
		final String erreur = "Ceci n'est pas un nombre entier. Réessayez : ";
		int number = 0;
		int i = 1;
		boolean isNumber = true;
		
		System.out.println(question);
		
		do {
			Scanner sc = new Scanner(System.in);
		try {
			String reponse = sc.nextLine();
			  number = Integer.parseInt(reponse); 
			  isNumber = true;
			}
			catch(Exception e) {
			  System.out.println(erreur);
			  isNumber = false;
			}
		}while(isNumber != true);
		
		FizzBuzz fb = new FizzBuzz(number);
		fb.afficher();
	}
}
