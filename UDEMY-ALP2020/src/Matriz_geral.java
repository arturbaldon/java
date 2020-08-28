/*
 * PROBLEMA: "matriz_geral"
 * VER ARQUIVO "07-matrizes-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Matriz_geral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		
		double[][] matriz = new double[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		double somaPositivos = 0;		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] > 0) {
					somaPositivos = somaPositivos + matriz[i][j];
				}				
			}
		}
		
		System.out.println("\nSOMA DOS POSITIVOS: " + String.format("%.1f", somaPositivos));
		
		System.out.print("\nEscolha uma linha: ");
		int linha = sc.nextInt();
		System.out.print("LINHA ESCOLHIDA: ");
		for (int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", matriz[linha][i]) + " ");
		}
		
		System.out.println();
		
		System.out.print("\nEscolha uma coluna: ");
		int coluna = sc.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", matriz[i][coluna]) + " ");
		}
		
		System.out.println();
		
		System.out.print("\nDIAGONAL PRINCIPAL: ");
		for (int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", matriz[i][i]) + " ");
		}
		
		System.out.println();
		
		System.out.println("\nMATRIZ ALTERADA:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					matriz[i][j] = Math.pow(matriz[i][j], 2);					
				}
				System.out.print(String.format("%.1f", matriz[i][j]) + " ");				
			}
			System.out.println();
		}
		
		// fecha scanner
		sc.close();

	}

}
