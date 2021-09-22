package br.edu.univas.factory;

public class FactoryProvider {
	
	public static AbstractFactory getFactory(int animal) {
		if (animal == 2) {
			return new InvertebratesFactory();
			
		} else if (animal == 1) {
			return new VertebratesFactory();
		}
		
		return null;
	}

}
