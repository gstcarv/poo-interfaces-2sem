package src.br.com.interfaces.formas;

public class Triangulo extends Forma implements AreaCalculavel, PerimetroCalculavel {

	private double lado;
	
	public Triangulo(double lado) {
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
		return "Triângulo";
	}

	@Override
	public double calcularPerimetro() {
		return this.lado * 3;
	}

	@Override
	public double calcularArea() {
		return (Math.pow(this.lado, 2) * Math.sqrt(3)) / 4;
	}
	
}
