package src.br.com.interfaces.formas;

public abstract class Forma implements AreaCalculavel, PerimetroCalculavel, Comparavel {
	public abstract String getNome();
	
	@Override
	public int comparar(Comparavel c) {
		
		Forma f = (Forma) c; 
		
		// TODO Auto-generated method stub
		if(this.calcularArea() == f.calcularArea()) {
			return 0;
		} else if(this.calcularArea() > f.calcularArea()) {
			return 1;
		} else {
			return -1;
		}
	}
}
