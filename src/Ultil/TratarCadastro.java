package Ultil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratarCadastro 
{
	private static Scanner sc = new Scanner(System.in);

    public static int lerInt(String msg) 
    {
        boolean numeroLido = false;
        int valor = 0;
        do {
            try {
                System.out.println(msg);
                valor = Integer.parseInt(sc.next());
                numeroLido = true;
            } 
            catch (Exception e) 
            {
                System.out.println("Digite um número inteiro!");
            }
        }
        while(!numeroLido);

        return valor;
    }
}

