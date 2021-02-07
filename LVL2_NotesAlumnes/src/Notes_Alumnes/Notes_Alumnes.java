package Notes_Alumnes;

import javax.swing.JOptionPane;
import java.util.*;

public class Notes_Alumnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ArrayNotesAlumnes [][]= new int [3][5]; // las notas van en la primera dimensión y los alumnos a la segunda dimensión.
		for (int i=0; i<5; i++){
			String alumno=JOptionPane.showInputDialog("Introduce nº de nuevo alumno, por favor");
			int alumnes = Integer.parseInt(alumno);
			ArrayNotesAlumnes[0][i]=alumnes;
	
			double media; //declaración de la variable media.
	        int suma = 0; // declaración e iniciación de la variable suma.
			for (int j=0; j<3; j++){
				
				String nota=JOptionPane.showInputDialog("Introduce nota, por favor");
				int notes =Integer.parseInt(nota);
				
				if (notes<=10){	// Condicional para que solo me acepte los valores entre 0 i 10.
					
					
					ArrayNotesAlumnes[j][0]=notes; // Guarda el valor escrito en el array.
					suma += ArrayNotesAlumnes[j][0]; // Guarda el valor del array en la variable "suma" y en cada bucle me lo suma
					media = (double)suma / ArrayNotesAlumnes.length;
					
					if (j==2){ //creo este condicional para que mes escriba la media solo despues de leer todas las notas.
						
						System.out.printf("El alumno nº " + alumnes + " tiene una media de " + "%1.2f", media );
						
						System.out.println();
						
					}
				
				}
				else {
					
					System.out.println("La nota no es valida");
					
				}
			}
			
			
		}
	

	}


}
