/*
 * PROBLEMA: "dados_pessoas"
 * VER ARQUIVO "06-vetores-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Dados_pessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		double[] vetAltura = new double[n];
		char[] vetGenero = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			vetAltura[i] = sc.nextDouble();
			System.out.print("Gênero da " + (i+1) + "a pessoa: ");
			vetGenero[i] = sc.next().charAt(0);
		}
		
		double menorAltura = vetAltura[0];
		double maiorAltura = vetAltura[0];
		
		for (int i = 1; i < n; i++) {
			if (vetAltura[i] < menorAltura) {
				menorAltura = vetAltura[i];
			}
			if (vetAltura[i] > maiorAltura) {
				maiorAltura = vetAltura[i];
			}
		}
		
		System.out.println("Menor altura = " + String.format("%.2f", menorAltura));
		System.out.println("Maior altura = " + String.format("%.2f", maiorAltura));
		
		double mediaAlturaMulheres = 0;
		int quantidadeMulheres = 0;
		int quantidadeHomens = 0;
		for (int i = 0; i < n; i++) {
			if (vetGenero[i] == 'f' || vetGenero[i] == 'F') {
				mediaAlturaMulheres = mediaAlturaMulheres + vetAltura[i];
				quantidadeMulheres++;
			} else {
				quantidadeHomens++;
			}
		}
		
		mediaAlturaMulheres = (double)mediaAlturaMulheres / quantidadeMulheres;
		System.out.println("Media das alturas das mulheres = " + String.format("%.2f", mediaAlturaMulheres));
		System.out.println("Número de homens = " + quantidadeHomens);
		
		// fecha scanner
		sc.close();

	}

}
