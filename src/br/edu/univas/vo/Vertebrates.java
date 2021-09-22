package br.edu.univas.vo;

public class Vertebrates implements Animal{

	@Override
	public void eat() {
		Shark shark = new Shark();
		shark.eat();
		
		Elephant elephant = new Elephant();
		elephant.eat();
				
	}
	

}
