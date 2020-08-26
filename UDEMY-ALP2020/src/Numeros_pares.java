/*
 * PROBLEMA: "numeros_pares"
 * VER ARQUIVO "06-vetores-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Numeros_pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("\nNUMEROS PARES:");
		
		int quantidadePares = 0;
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + "  ");
				quantidadePares++;
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = " + quantidadePares);
		
		// fecha scanner
		sc.close();

	}

}
