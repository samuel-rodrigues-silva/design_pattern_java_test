package br.edu.univas.factory;

import br.edu.univas.vo.Animal;
import br.edu.univas.vo.Vertebrates;

public class VertebratesFactory implements AbstractFactory{

	@Override
	public Animal createAnimal() {
		
		return new Vertebrates();
	}

}
