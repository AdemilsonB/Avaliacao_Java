package Controllers;

import java.util.ArrayList;

import Models.Circulo;
import Models.Forma;
import Models.Retangulo;
import Models.Triangulo;

public class FormaController {
	
	private static ArrayList<Forma> formas = new ArrayList<Forma>();
	
	//-----------------------------------------------------//
	
	public static void cadastrar(Forma forma) {
        formas.add(forma);
    }
	
	//-----------------------------------------------------//
	
	public static ArrayList<Forma>Listar()
	{
		return formas;
	}
	
	//-----------------------------------------------------//
	
	public static ArrayList<Forma> listarRetangulos() 
	{
        Retangulo retangulo = new Retangulo();
        ArrayList<Forma> tipo = new ArrayList<Forma>(); 
        for(Forma retanguloRegistrado : formas) 
        {
            if(retanguloRegistrado.getClass().
            		equals(retangulo.getClass())) 
            {
                tipo.add(retanguloRegistrado);
            };
        }
        return tipo;
    }
	
	//-----------------------------------------------------//
	
	public static ArrayList<Forma> listarTriangulos() 
	{
        Triangulo triangulo = new Triangulo();
        ArrayList<Forma> tipo = new ArrayList<Forma>(); 
        for(Forma trianguloRegistrado : formas) 
        {
            if(trianguloRegistrado.getClass().
            		equals(triangulo.getClass())) 
            {
                tipo.add(trianguloRegistrado);
            };
        }
        return tipo;
    }
	
	//-----------------------------------------------------//

	
	public static ArrayList<Forma> listarCirculos() 
	{
        Circulo circulo = new Circulo();
        ArrayList<Forma> tipo = new ArrayList<Forma>(); 
        for(Forma circuloRegistrado: formas) 
        {
            if(circuloRegistrado.getClass().
            		equals(circulo.getClass())) 
            {
                tipo.add(circuloRegistrado);
            };
        }
        return tipo;
    }
}
