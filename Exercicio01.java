package exercicios.dois;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner resp = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite tr�s numeros inteiros: ");
		
		System.out.println("digite o primeiro: ");
		a = resp.nextInt();
		System.out.println("digite o segindo: ");
		b = resp.nextInt();
		System.out.println("digite o terceiro: ");
		c = resp.nextInt();
		
		if(a > b && a > c) {
			System.out.println("O maior numero � o: " + a);
		} else if(b > a && b > c){
			System.out.println("O maior numero � o: " + b);
		} else if(c > a && c > b) {
			System.out.println("O maior numero � o: " + c);
		} else if (a == b || a == c || b == c) {
			System.out.println("Empate de numeros... digite novamente"); 
			/*informa��o acrescentada, em caso de n�meros iguais, o usu�rio deve digitar novamente.*/
		}
		
		resp.close();
	}

}
