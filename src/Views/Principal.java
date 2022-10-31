package Views;
import Ultil.TratarCadastro;

public class Principal {
	public static void main(String[] args) {
	int op;
		do 
		{
		System.out.println("\n".repeat(3));
		System.out.println("1.Cadastrar Retângulo");
		System.out.println("2.Cadastrar Triângulo");
		System.out.println("3.Cadastrar Circulo");
		System.out.println("4.Listar Todos");
		System.out.println("5.Listar Retângulo");
		System.out.println("6.Listar Triângulo");
		System.out.println("7.Listar Circulo");
		System.out.println("0.Sair");
		op = TratarCadastro.lerInt("Insira a opção desejada: ");
		
		switch(op){
			case 1:
				Cadastrar.retangulo();
				break;
			case 2:
				Cadastrar.triangulo();
				break;
			case 3:
				Cadastrar.circulo();
				break;
			case 4: 
				Listar.todos();
				break;
			case 5:
				Listar.retangulo();
				break;
			case 6:
				Listar.triangulo();
				break;
			case 7:
				Listar.circulo();
				break;
			case 0:
		        System.out.println("Saindo...");
		        	break;
		    default:
		    	System.out.println("Opção inválida!");
		            break;
		}
		}while(op!=0);
		
		
	}
}
