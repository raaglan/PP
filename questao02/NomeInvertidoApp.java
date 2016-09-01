package questao02;

import java.util.Scanner;

public class NomeInvertidoApp 
{
	public static void main(String[] args) throws NomeInvalidoException 
	{	Scanner teclado = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		boolean pessoaOk = false;
		do {
			try {
				System.out.print("Digite o seu nome: ");
				pessoa.setNome(teclado.nextLine());
				pessoaOk = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		} while (!pessoaOk);
		System.out.println("Nome invertido: " + pessoa.getNomeInvertido());
	 	teclado.close();
	}
}
