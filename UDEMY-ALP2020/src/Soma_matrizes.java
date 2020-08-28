/*
 * PROBLEMA: "soma_matrizes"
 * VER ARQUIVO "07-matrizes-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Soma_matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		int m = sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		int n = sc.nextInt();
		
		int[][] matA = new int[m][n];
		System.out.println("Digite os valores da matriz A:");		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matA[i][j] = sc.nextInt();
			}
		}
		
		int[][] matB = new int[m][n];
		System.out.println("Digite os valores da matriz B:");		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matB[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("MATRIZ SOMA:");
		int[][] matC = new int[m][n];		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matC[i][j] = matA[i][j] + matB[i][j];
				System.out.print(matC[i][j] + " ");
			}
			System.out.println();			
		}		
		
		// fecha scanner
		sc.close();

	}

}
