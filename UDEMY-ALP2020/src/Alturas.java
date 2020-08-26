/*
 * PROBLEMA: "alturas"
 * VER ARQUIVO "06-vetores-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[] vetNome = new String[n];
		int[] vetIdade = new int[n];
		double[] vetAltura = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			vetNome[i] = sc.next();
			System.out.print("Idade: ");
			vetIdade[i] = sc.nextInt();
			System.out.print("Altura: ");
			vetAltura[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vetAltura[i];
		}
		
		double media = soma / n;
		System.out.println("\nAltura média: " + String.format("%.2f", media));
		
		int menores = 0;
		for (int i = 0; i < n; i++) {
			if (vetIdade[i] < 16) {
				menores++;
			}
		}
		
		double percentual = (double)(menores * 100.0) / n;
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f%%", percentual));
		
		for (int i = 0; i < n; i++) {
			if (vetIdade[i] < 16) {
				System.out.println(vetNome[i]);
			}
		}
		
		// fecha scanner
		sc.close();

	}

}
