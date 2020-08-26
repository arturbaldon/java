/*
 * PROBLEMA: "soma_vetor"
 * VER ARQUIVO "06-vetores-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

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
		
		System.out.print("\nVALORES = ");
		double soma = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f  ", vetor[i]));
			soma = soma + vetor[i];
		}
		
		double media = soma / n;
		System.out.println("\nSOMA = " + String.format("%.2f", soma));
		System.out.println("MEDIA = " + String.format("%.2f", media));		
		
		// fecha scanner
		sc.close();

	}

}
