package br.com.generation.aula01;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		System.out.println("escreva o valor de  A:");
		a = leia.nextDouble();
		System.out.println("escreva o valor de  B:");
		b = leia.nextDouble();
		System.out.println("escreva o valor de  C:");
		c = leia.nextDouble();
		System.out.println("escreva o valor de  D:");
		d = leia.nextDouble();
		System.out.println("escreva o valor de  E:");
		e = leia.nextDouble();
		System.out.println("escreva o valor de  F:");
		f = leia.nextDouble();
		leia.close();
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));
		System.out.println("o valor de x é: " + x +
				"\ne o valor de y é: " + y);
	}

}
