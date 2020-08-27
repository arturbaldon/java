/*
 * PROBLEMA: "negativos_matriz"
 * VER ARQUIVO "07-matrizes-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Negativos_matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int m = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("VALORES NEGATIVOS:");
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					System.out.println(matriz[i][j]);
				}
			}
		}
		
		// fecha scanner
		sc.close();

	}

}
