package questao05;

import java.util.Scanner;

public class AvaliacaoApp
{
	public static void main(String[] args) 
	{	Scanner teclado = new Scanner(System.in);
		Avaliacao avaliacao = new Avaliacao();
		boolean nota1Ok = false;
		boolean nota2Ok = false;
		do {
			try {
				System.out.print("Digite nota do estágio 1: ");
				avaliacao.setNota1(teclado.nextDouble());
				nota1Ok = true;
			} catch (NotaInvalidaException notaInv) {
				System.out.println(notaInv.getMessage());
			} 
		} while (!nota1Ok);
		do {
			try {
				System.out.print("Digite nota do estágio 2: ");
				avaliacao.setNota2(teclado.nextDouble());
				nota2Ok = true;
			} catch (NotaInvalidaException notaInv) {
				System.out.println(notaInv.getMessage());
			} 
		} while (!nota2Ok);
		System.out.println("Média: " + avaliacao.getMedia());
		teclado.close();
	}
}
