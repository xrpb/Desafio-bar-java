package application;

import java.util.Locale;
import java.util.Scanner;

import entities.bill;

public class baroo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		bill bl = new bill();
		
		System.out.println("Sexo (M / F): ");
		bl.gender = sc.next().charAt(0);
		
		System.out.println("Quantidade de cervejas: ");
		bl.beer = sc.nextInt();
		
		System.out.println("Quantidade de refrigerantes: ");
		bl.softDrink = sc.nextInt();
		
		System.out.println("Quantidade de espetinhos: ");
		bl.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELATORIO: ");
		
		System.out.printf(String.format("Consumo = R$ %.2f%n", bl.feeding()));
		if (bl.cover() == 0) {
			System.out.println("Isento de Couvert"); 
		} else {
			System.out.printf(String.format("Couvert = R$ %.2f%n" , bl.cover()));
		}
		System.out.printf(String.format ("Ingresso = R$ %.2f%n", bl.ticket()));
		System.out.println();
		System.out.println(String.format ("Valor a pagar = R$ %.2f%n" , bl.total()));
		
		sc.close();
	}

}
