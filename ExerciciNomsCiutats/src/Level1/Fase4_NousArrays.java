package Level1;
import java.util.*;


public class Fase4_NousArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fase 1
		Scanner sc = new Scanner(System.in); 
		System.out.println("Introduce ciudad :");
						
		String ciutat1 = sc.nextLine();
		String ciutat2 = sc.nextLine();
		String ciutat3 = sc.nextLine();
		String ciutat4 = sc.nextLine();
		String ciutat5 = sc.nextLine();
		String ciutat6 = sc.nextLine();
		sc.close();
							
						
		//Fase 2
		
		char [] ArrayCiutat1 = new char [ciutat1.length()]; // declaració i inicialització de l'array
		for (int i=0; i<ciutat1.length(); i++){ 
				
			int UltimaLetra = (ciutat1.length()-1); //retorna l'ultim numero de la cadena.
			ArrayCiutat1[i]= ciutat1.charAt(UltimaLetra-i); // Guarda a cada posició de l'array l'ultim caracter o lletra de la cadena un cop fet l'anterior bucle (va restant de un en un la posició).  
			System.out.print(ArrayCiutat1[i]);// imprimeix el caracter y torna a fer el bucle fins que s'arribi a la llargada total de la cadena.
			
		}
		
		System.out.println(); //Faig un salt de linea per cada array.
				
		char [] ArrayCiutat2 = new char[ciutat2.length()];
		for (int i=0; i<ciutat2.length(); i++){
				
			int UltimaLetra = (ciutat2.length()-1);
			ArrayCiutat2[i]= ciutat2.charAt(UltimaLetra-i);
			System.out.print(ArrayCiutat2[i]);
			
		}
		
		System.out.println();
		
		char [] ArrayCiutat3 = new char[ciutat3.length()];
		for (int i=0; i<ciutat3.length(); i++){	
					
			int UltimaLetra = (ciutat3.length()-1);
			ArrayCiutat3[i]= ciutat3.charAt(UltimaLetra-i);
			System.out.print(ArrayCiutat3[i]);
			
		}
		
		System.out.println();
		
		char [] ArrayCiutat4 = new char[ciutat4.length()];
		for (int i=0; i<ciutat4.length(); i++){
	
							
			int UltimaLetra = (ciutat4.length()-1);
			ArrayCiutat4[i]= ciutat4.charAt(UltimaLetra-i);
			System.out.print(ArrayCiutat4[i]);
			
		}
		System.out.println();
		
		
		char [] ArrayCiutat5 = new char[ciutat5.length()];
		for (int i=0; i<ciutat5.length(); i++){
						
			int UltimaLetra = (ciutat5.length()-1);
			ArrayCiutat5[i]= ciutat5.charAt(UltimaLetra-i);
			System.out.print(ArrayCiutat5[i]);
			
		}
		
		System.out.println();
		
		char [] ArrayCiutat6 = new char[ciutat6.length()];
		for (int i=0; i<ciutat6.length(); i++){
		
			int UltimaLetra = (ciutat6.length()-1); 
			ArrayCiutat6[i]= ciutat6.charAt(UltimaLetra-i);
			System.out.print(ArrayCiutat6[i]);
			
		}
		

	}

}
