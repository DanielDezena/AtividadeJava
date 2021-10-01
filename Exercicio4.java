package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c, d, r, s;
		System.out.println("digite o valor de A:");
		a = leia.nextInt();
		System.out.println("digite o valor de B:");
		b = leia.nextInt();
		System.out.println("digite o valor de C:");
		c = leia.nextInt();
		leia.close();
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s)/ 2;
		System.out.println("O valor de D será: " + d);
		
	}

	
}
