package Fibonacci;

import javax.swing.JOptionPane;

public class Fibonacci_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero=JOptionPane.showInputDialog("Introduce numero, por favor");
		int N = Integer.parseInt(numero);
		
		int ArrayFibonacci [] = new int [N];
		
		
		int a = 0;
		
		for (int i=0; i<ArrayFibonacci.length; i++){
			
			if (i<2){
				
				ArrayFibonacci[i]= a;
				
				System.out.print(ArrayFibonacci[i] + ", ");
				
				a =+ 1;
				
			}
			else {
				
				ArrayFibonacci[i] = ArrayFibonacci[i-2] + ArrayFibonacci[i-1];
				
				
				System.out.print(ArrayFibonacci[i] + ", "); 
				
			}

		}

	}

}
