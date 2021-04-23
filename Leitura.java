//Aluno: Rafael Cruz - RA: 2266261

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{

	public String entDados(String rotulo){

		System.out.println(rotulo);

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(teclado);
		
		String ret ="";
			
		try{
			ret = input.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}

		return ret;
	}
}
