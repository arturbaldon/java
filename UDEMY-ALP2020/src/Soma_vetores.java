/*
 * PROBLEMA: "soma_vetores"
 * VER ARQUIVO "06-vetores-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Soma_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vetorA = new int[n];		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < n; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		int[] vetorB = new int[n];		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < n; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		int[] vetorC = new int[n];		
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < n; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}
		
		// fecha scanner
		sc.close();

	}

}
