package br.com.generation.aula01;

import java.util.Scanner;


public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double x1, x2, y1, y2, d, a, b;
		System.out.println("digite o valor de x1:");
		x1 = leia.nextDouble();
		System.out.println("digite o valor de x2:");
		x2 = leia.nextDouble();
		System.out.println("digite o valor de y1:");
		y1 = leia.nextDouble();
		System.out.println("digite o valor de y2:");
		y2 = leia.nextDouble();
		leia.close();
		b = (x2-x1) * (x2-x1);
		a = (y2-y1)*(y2-y1);
		d = Math.sqrt(a+b);
		System.out.println("o resultado é: "+d);
		
		
	}

}
