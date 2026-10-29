package avaliacao1.av1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	System.out.println("Digite a quantidade do produto :");
	double quantidade = nextDouble.ln;
	
	if (quantidade==1) {
	System.out.println("Estoque crítico" + quantidade);
	}
    
	If else (quantidade==2) {
		System.out.println("Estoque baixo " + quantidade);
		}
	
	If else (quantidade==3) {
		System.out.println("Estoque médio" + quantidade);
		}
	
	If else (quantidade==4) {
		System.out.println("Estoque alto" + quantidade);
		}
	
	If else (quantidade==5) {
		System.out.println("Estoque cheio" + quantidade);
		}
	else {
		System.out.println("Opção inválida" + quantidade);
	}
	ler.close();

}
