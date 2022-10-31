package Views;

import Controllers.FormaController;
import Models.Circulo;
import Models.Retangulo;
import Models.Triangulo;
import Ultil.TratarCadastro;

public class Cadastrar {
	private static Retangulo retangulo;
	
	private static Triangulo triangulo;
	
	private static Circulo circulo;
	
	public static void retangulo()
	{
		retangulo = new Retangulo();
		retangulo.setAltura(TratarCadastro.lerInt("Insira a altura: "));
		retangulo.setLargura(TratarCadastro.lerInt("Insira a largura: "));
		FormaController.cadastrar(retangulo);
	}
	
	public static void triangulo()
	{
		triangulo = new Triangulo();
		triangulo.setAltura(TratarCadastro.lerInt("Insira a altura: "));
		triangulo.setBase(TratarCadastro.lerInt("Insira a base: "));
		FormaController.cadastrar(triangulo);
	}
	
	public static void circulo()
	{
		circulo = new Circulo();
		circulo.setRaio(TratarCadastro.lerInt("Insira o raio: "));
		FormaController.cadastrar(circulo);
	}
}
