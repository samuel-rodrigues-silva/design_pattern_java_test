package br.edu.univas.vo;

public class Invertebrates implements Animal{

	@Override
	public void eat() {
		Ant ant = new Ant();
		ant.eat();
		
		Bee bee = new Bee();
		bee.eat();
	}
	
}
