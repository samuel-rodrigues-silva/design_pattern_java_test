package br.edu.univas.factory;

import br.edu.univas.vo.Animal;
import br.edu.univas.vo.Invertebrates;

public class InvertebratesFactory implements AbstractFactory{

	@Override
	public Animal createAnimal() {
		
		return new Invertebrates();
	}

}
