package exercicios.dois;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner resp = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite três numeros inteiros: ");
		
		System.out.print("digite o primeiro: ");
		a = resp.nextInt();
		System.out.print("digite o segindo: ");
		b = resp.nextInt();
		System.out.print("digite o terceiro: ");
		c = resp.nextInt();
		
		System.out.println("Abaixo estão informados em ordem: ");
		if(a > b && a > c) {
			System.out.print( a );
			if(b > c) {
				System.out.println(" " + b + " "+ c);	
			}else {
				System.out.println(" " + c + " "+ b);
			}
				
		}
		
		else if(b > a && b > c) {
			System.out.print( b );
			if(a > c) {
				System.out.println(" " + a + " "+ c);	
			}else {
				System.out.println(" " + c + " " + a);
			}	
		} 
		
		else if (c > a && c > b) {
			System.out.print( c );
			if(b > a) {
				System.out.println(" " + b + " "+ a);	
			}else {
				System.out.println(" " + a + " " + b);
			}	
		} 

		resp.close();
		
		
	}
}