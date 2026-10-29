package avaliacao1.av1;

import java.util.Scanner;

public class fatorial2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		
		for (int i = 1; i<= n; i++) {
			fat = fat * i;
			i++;
			
			System.out.println(" O fatorial é : " + fat);
			
			ler.close();
		}

	}

}
