package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int segundosMarca, horas, minutos, segundos;
		System.out.println("Digite o tempo em segundos da duração do evento: ");
		segundosMarca = leia.nextInt();
		leia.close();
		horas = segundosMarca / 3600;
		minutos = (segundosMarca%3600)/60;
		segundos = (segundosMarca%3600)%60;
		System.out.println("o tempo total foi em " + horas + "hrs:" + minutos + "min:"
				+ segundos + "seg");
	}

}
