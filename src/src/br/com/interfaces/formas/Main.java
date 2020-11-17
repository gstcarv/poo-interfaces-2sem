package src.br.com.interfaces.formas;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(2);
		Quadrado quadrado = new Quadrado(3);
		Retangulo retangulo = new Retangulo(2, 3);
		Triangulo triangulo = new Triangulo(2);
		
		Casa casa = new Casa();
		
		ArrayList<Forma> formas = new ArrayList<Forma>();
		formas.add(circulo);
		formas.add(quadrado);
		formas.add(triangulo);
		formas.add(retangulo);
		
		casa.setComodos(formas);
		casa.ordenar();
		
		for(Forma forma : casa.getComodos()) {
			System.out.println("Área " + forma.getNome() + ": " + forma.calcularArea());
			System.out.println();
		}
		

	}

}
