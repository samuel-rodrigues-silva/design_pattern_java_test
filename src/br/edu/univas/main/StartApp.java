package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.factory.AbstractFactory;
import br.edu.univas.factory.FactoryProvider;
import br.edu.univas.vo.Animal;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***ANIMAIS***");
		System.out.println("1 - Vertebrados");
		System.out.println("2 - Invertebrados");
		System.out.println("Digite sua opção:");
		
		int option = scanner.nextInt();
		
		scanner.close();
		
		AbstractFactory absFactory = FactoryProvider.getFactory(option);
		
		Animal animal = absFactory.createAnimal();
		animal.eat();
		
	}
}
