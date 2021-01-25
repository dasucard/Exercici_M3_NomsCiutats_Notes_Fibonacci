package Level1;
import java.util.*;


public class Fase3_ArrayCiutatModificades {

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
		String [] ArrayCiutats = new String[6];
				
		ArrayCiutats[0]= ciutat1;
		ArrayCiutats[1]= ciutat2;
		ArrayCiutats[2]= ciutat3;
		ArrayCiutats[3]= ciutat4;
		ArrayCiutats[4]= ciutat5;
		ArrayCiutats[5]= ciutat6;

				
		Arrays.sort(ArrayCiutats);
				
		// Fase 3
		for (int i=0; i<ArrayCiutats.length; i++){ 
			
			String [] ArrayCiutatModificades = new String [1];
					
			String CiutatModificada = ArrayCiutats[i].replace('a', '4');
								
			ArrayCiutatModificades[0]= CiutatModificada;
			
			Arrays.sort(ArrayCiutatModificades);
					
			System.out.println(CiutatModificada);
						
			}
		
				
				
		}
	

	}


