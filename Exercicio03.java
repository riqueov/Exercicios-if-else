package exercicios.dois;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner resp = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite uma idade: ");
		idade = resp.nextInt();
		resp.close();
		if(idade < 10) {
			System.out.print("Idade Minima Permitida: 5 \nReinicie o programa. \nAtenciosamente.");
		} else if(idade >= 10 && idade <= 14){
			System.out.print("idade informada: " + idade + "\nCategoria: Infantil");
		
		} else if(idade >= 15 && idade <= 17){
			System.out.print("idade informada: " + idade + "\nCategoria: Juvenil"); 
		
		} else if(idade >= 18 && idade <= 25){
			System.out.print("idade informada: " + idade + "\nCategoria: Adulto");
		
		} else{
			System.out.print("Idade Maxima perimitida: 25 \n reinicie o programa. \nAtenciosamente. ");
		}
		
	}

}
