/*
 * PROBLEMA: "diagonal_negativo"
 * VER ARQUIVO "07-matrizes-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Diagonal_negativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		
		for (int i = 0; i < n; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		int quantidadeNegativos = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					quantidadeNegativos++;
				}				
			}
		}
		
		System.out.println("\nQUANTIDADE DE NEGATIVOS = " + quantidadeNegativos);
		
		// fecha scanner
		sc.close();

	}

}
