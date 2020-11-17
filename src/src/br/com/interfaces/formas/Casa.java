package src.br.com.interfaces.formas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Casa implements AreaCalculavel {
	private ArrayList<Forma> comodos;
	
	public ArrayList<Forma> getComodos() {
		return comodos;
	}

	public void setComodos(ArrayList<Forma> comodos) {
		this.comodos = comodos;
	}

	@Override
	public double calcularArea() {
		double somaAreas = 0;
		
		for(Forma c : comodos) {
			somaAreas += c.calcularArea();
		}
		
		return somaAreas;
	}
	
	public void ordenar() {
		Collections.sort(this.comodos, new Comparator<Forma>() {
			@Override
			public int compare(Forma f1, Forma f2) {
				return f1.comparar(f2);
			};
		});
	}
	
}
