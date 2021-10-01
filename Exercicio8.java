package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double custoFabrica, percentagemDistribuidor, impostos, custoConsumidor;
		System.out.println("digite o valor de fábrica do veículo:");
		custoFabrica = leia.nextInt();
		leia.close();
		percentagemDistribuidor = custoFabrica * (28.0/100);
		impostos = custoFabrica * (45.0/100);
		custoConsumidor = custoFabrica + percentagemDistribuidor + impostos;
		System.out.println("o valor para o consumidor será de:\n" + custoConsumidor);
	}

}
