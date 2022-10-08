package bar;

import java.util.*;

public class Program 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Bill bill = new Bill();
		
		System.out.print("Sexo: ");
		bill.gender = scan.nextLine().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		bill.beer = scan.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = scan.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = scan.nextInt();
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.println("Consumo: R$ " + String.format("%.2f", bill.feeding()));
		
		double cover = bill.feeding();
		if(cover < 30.00)
			System.out.println("Couvert: R$ " + String.format("%.2f", Bill.cover()));
		else
			System.out.println("Isento de Couvert");	
		
		System.out.println("Ingresso: R$ " + String.format("%.2f", bill.ticket()));
		System.out.println();
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", bill.total()));		
		
		scan.close();
	}
}















