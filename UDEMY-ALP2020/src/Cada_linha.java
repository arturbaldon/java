/*
 * PROBLEMA: "cada_linha"
 * VER ARQUIVO "07-matrizes-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Cada_linha {

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
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
		
		int maiorElemento = 0;
		
		for (int i = 0; i < n; i++) {
			maiorElemento = matriz[i][0];
			for (int j = 0; j < n; j++) {				
				if (matriz[i][j] > maiorElemento) {
					maiorElemento = matriz[i][j];
				}
			}
			System.out.println(maiorElemento);
		}
		
		// fecha scanner
		sc.close();

	}

}
