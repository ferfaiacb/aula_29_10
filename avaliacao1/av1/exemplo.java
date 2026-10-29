package avaliacao1.av1;

import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, resultado;
		
		System.out.println("Informe o numero para tabuada:  ");
		n= ler.nextInt();
		
		for(int i=1; i <= 10;  i++) {
			resultado= n*1;
			System.out.println(n + "x" + i + " = " + resultado);
		}
		ler.close();
 
	}

}
