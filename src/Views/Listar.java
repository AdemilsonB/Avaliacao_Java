package Views;

import Controllers.FormaController;
import Models.Forma;

public class Listar {
		
	public static void retangulo() 
	{
		System.out.println("\n".repeat(15));	
		System.out.println("\n-- LISTAR RETÂNGULO(S) --\n");
		for(Forma retanguloRegistrado : FormaController.listarRetangulos()) 
		{
			System.out.println(retanguloRegistrado);
		}
	}
	
	//--------------------------------------------------------------------------//

	public static void triangulo() 
	{
		System.out.println("\n".repeat(15));	
		System.out.println("\n-- LISTAR TRIÂNGULO(S) --\n");
		for(Forma trianguloRegistrado : FormaController.listarTriangulos()) 
		{
			System.out.println(trianguloRegistrado);
		}
	}
	
	//--------------------------------------------------------------------------//

		public static void circulo() 
		{
			System.out.println("\n".repeat(15));	
			System.out.println("\n-- LISTAR CIRCULO(S) --\n");
			for(Forma circuloRegistrado : FormaController.listarCirculos()) 
			{
				System.out.println(circuloRegistrado);
			}
		}
		
		//--------------------------------------------------------------------------//

		public static void todos(){
	        System.out.println("\n-- LISTAR TODOS--  \n");
	        for(Forma todos : FormaController.Listar()) 
	        {
	            System.out.println(todos);
	        }
	    }
		
}
