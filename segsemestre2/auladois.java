package segsemestre2;

import java.util.Scanner;

public class auladois {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int n;
		
		System.out.println("Digite um número maior que zero");
		
		n= ler.nextInt();
		
		for (int i=1; i <= n ; i++)
			System.out.println("Número "+i);
		ler.close();

	}

}
