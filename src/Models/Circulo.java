package Models;

public class Circulo extends Forma {
	

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	private int raio;
	
	
	@Override public double calcularArea()
	{
		return (this.raio * this.raio)*3.14;
	}
	
	
	@Override
	public String toString() {
		return "Circulo, área:" + calcularArea();
	}
}

