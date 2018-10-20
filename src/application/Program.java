package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		Circle circle = new Circle(r);
		
		System.out.println("A= "+ String.format("%.4f", circle.area()));
		
		sc.close();

	}

}
