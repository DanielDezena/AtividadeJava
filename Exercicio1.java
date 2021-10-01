package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int diaAtual, mesAtual, anoAtual,
		diaNascimento, mesNascimento, anoNascimento,
		totalDias;
		
		System.out.println("Digite o dia atual:");
		diaAtual = leia.nextInt();
		System.out.println("Digite o mês atual:");
		mesAtual = leia.nextInt();
		System.out.println("Digite o ano atual:");
		anoAtual = leia.nextInt();
		
		System.out.println("Digite o dia de seu nascimento:");
		diaNascimento = leia.nextInt();
		System.out.println("Digite o mês de seu nascimento:");
		mesNascimento = leia.nextInt();
		System.out.println("Digite o ano de seu nascimento:");
		anoNascimento = leia.nextInt();
		leia.close();
		totalDias = (anoAtual - anoNascimento) 
				* 365 + (mesAtual  * 30 + diaAtual) -
				(mesNascimento * 30 + diaNascimento);
		System.out.println("a sua idade em dias é: " + totalDias);
		
	}

}
