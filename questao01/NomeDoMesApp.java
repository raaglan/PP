package questao01;

import java.util.Scanner;
public class NomeDoMesApp 
{
	public static void main(String[] args)  
	{	
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o n�mero do m�s: ");
		try
		{
			Mes mes = new Mes(teclado.nextInt());
			System.out.println("Nome do m�s: " + mes.getNome());
	 	
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
		} finally
		{
			System.out.println("Fechando a conexao");
		}
		teclado.close();
	}
}
