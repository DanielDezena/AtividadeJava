package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int totalDias, anos, meses, dias;
		System.out.println("digite a quantidade de dias: ");
		totalDias = leia.nextInt();
		
		anos = totalDias/365;
		meses = (totalDias%365)/30;
		dias = (totalDias%365)%30;
		leia.close();
		System.out.println("A sua idade em anos é: " + anos +"\nMeses: " + meses 
				+ "\nDias: " + dias);
	}

}
