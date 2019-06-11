package program;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		//Instanciando o tipo file com o caminho do arquivo
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		//Usando hasNextLine pra saber se tem algo escrito
		//Escrevendo na tela com prevencao usando try catch
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) 
				{
					System.out.println(sc.nextLine());
				}
			}catch (IOException e) 
					{
						System.out.println("Erro: " + e.getMessage());
					}
			finally {
			if(sc != null) 
			{
				sc.close();
			}
		}
	}

}
