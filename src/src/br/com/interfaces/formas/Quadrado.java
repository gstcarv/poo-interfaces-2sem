package src.br.com.interfaces.formas;

public class Quadrado extends Forma implements AreaCalculavel, PerimetroCalculavel {
	
	private double lado;

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String getNome() {
		return "Quadrado";
	}

	@Override
	public double calcularPerimetro() {
		return lado * 2;
	}

	@Override
	public double calcularArea() {
		return Math.pow(this.lado, 2);
	}

	@Override
	public int comparar(Comparavel c) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
