package Models;

public class Triangulo extends Forma{
	
	private int altura;
	private int base;
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	@Override public double calcularArea()
	{
		double soma = (this.altura * this.base)/2;
		return soma;
	}
	
	@Override
	public String toString() {
		return "Triangulo, área:" + calcularArea();
	}
}
