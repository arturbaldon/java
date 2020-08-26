/*
 * PROBLEMA: "media_pares"
 * VER ARQUIVO "06-vetores-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Media_pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		int divisor = 0;
		double mediaPares = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 == 0) {
				mediaPares = mediaPares + vetor[i];
				divisor++;
			}
		}
		
		if (mediaPares != 0) {
			mediaPares = (double)mediaPares / divisor;
			System.out.println("MEDIA DOS PARES = " + mediaPares);
		} else {
			System.out.println("NENHUM NÚMERO PAR");
		}
		
		// fecha scanner
		sc.close();

	}

}
