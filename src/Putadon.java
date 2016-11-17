import java.util.Scanner;

/*
 * CSI Florida
 * Reto Putadon
 * 
 * El siguiente código calcula
 * 
 * PERO ESTA TODO MAL
 * 
 */
public class Putadon {
	
	public static void main(String[] args) {
		String frase="";
		int numPos=0;
		int numRepeticiones=0;
		char letra=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce tu frase");
		frase = sc.nextLine();
		
		System.out.println("Introduce la letra a buscar");
		letra = sc.nextLine().charAt(0);
		
		//Buscamos las letras
		for(int i=0;i<frase.length();i++){
			if(letra==frase.charAt(i-1)){
				++numRepeticiones;
				System.out.println("Letra "+letra+" encontrada en la posicion "+i);
			}
		}
		System.out.println("Total repeticiones "+numRepeticiones);
	
	}
}
