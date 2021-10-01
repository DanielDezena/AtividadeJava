package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		System.out.println("digite a primeira nota:");
		nota1 = leia.nextDouble();
		System.out.println("digite a segunda nota:");
		nota2 = leia.nextDouble();
		System.out.println("digite a terceira nota:");
		nota3 = leia.nextDouble();
		leia.close();
		media = (nota1*0.2)+(nota2*0.3)+(nota3*0.5);
		System.out.println("A média das notas foi: " + media);
	}

}
