package exercicios.dois;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
	
		Scanner resp = new Scanner(System.in);
		int num;
		double raiz, elevado;
		
		System.out.println("Digite um número inteiro: ");
		num = resp.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par......");
			raiz = Math.sqrt(num);
			System.out.println("Raiz quadrada: " + raiz);
			System.out.println("Raiz quadrada: " + Math.sqrt(num));
		}
		else if(num % 2 == 1){
			System.out.println("Impar......");
			elevado = Math.pow(num, 2);
			
			System.out.println("Potencia: " + elevado);
		}
		
		resp.close();
	}

}
