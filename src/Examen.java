import java.util.Scanner;

/*
 * CSI Florida
 * Reto Putadon
 * 
 * El siguiente código busca una letra dentro de una frase
 * y devuelve dónde se ha encontrado y ctas veces
 * 
 * Hay dos errores
 * 
 */
public class Examen {
	
public static void main(String[] args) {
		String frase = introduceFrase();
		char letra = introduceLetra();
		calcular(frase,letra);
		
	}
	public static String introduceFrase(){
		Scanner sc=new Scanner(System.in);
		String frase="";
		System.out.println("Introduce tu frase");
		frase = sc.nextLine();
		
		return frase;
	}
		
	public static char introduceLetra(){
		char letra = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la letra a buscar");
		letra = sc.nextLine().charAt(0); 
		
		return letra;
		
	}
	public static void calcular (String frase,char letra){
		
		int numRepeticiones=0;
		
		
		
		for(int i=0;i<frase.length();i++){
			if(letra==frase.charAt(i)){
				numRepeticiones++;
				System.out.println("Letra "+letra+" encontrada en la posicion "+i);
			}
		}
		System.out.println("Total repeticiones "+numRepeticiones);
		
	}
}
