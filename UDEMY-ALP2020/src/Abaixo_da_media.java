/*
 * PROBLEMA: "abaixo_da_media"
 * VER ARQUIVO "06-vetores-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		double mediaVetor = 0;
		for (int i = 0; i < n; i++) {
			mediaVetor = mediaVetor + vetor[i];
		}
		
		mediaVetor = mediaVetor / n;
		System.out.println("\nMEDIA DO VETOR = " + String.format("%.3f", mediaVetor));
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		for (int i = 0; i < n; i++) {
			if (vetor[i] < mediaVetor) {
				System.out.println(vetor[i]);
			}
		}
		
		// fecha scanner
		sc.close();

	}

}
