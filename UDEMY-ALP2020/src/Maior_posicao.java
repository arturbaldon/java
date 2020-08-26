/*
 * PROBLEMA: "maior_posicao"
 * VER ARQUIVO "06-vetores-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Maior_posicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		double maiorValor = vetor[0];
		int maiorPosicao = 0;
		for (int i = 0; i < n; i++) {
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
				maiorPosicao = i;
			}
		}
		
		System.out.println("\nMAIOR VALOR = " + String.format("%.1f", maiorValor));
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + maiorPosicao);
		
		// fecha scanner
		sc.close();

	}

}
