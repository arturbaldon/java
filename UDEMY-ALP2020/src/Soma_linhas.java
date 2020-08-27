/*
 * PROBLEMA: "soma_linhas"
 * VER ARQUIVO "07-matrizes-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Soma_linhas {

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
		
		double[][] matriz = new double[m][n];
		
		for (int i = 0; i < m; i++) {
			System.out.println("Digite os elementos da " + (i+1) + "a. linha:");
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		double[] vetor = new double[m];
		for (int i = 0; i < m; i++) {
			vetor[i] = 0;
			for (int j = 0; j < n; j++) {
				vetor[i] = vetor[i] + matriz[i][j];
			}
		}
		
		System.out.println("VETOR GERADO:");
		for (int i = 0; i < m; i++) {
			System.out.println(vetor[i]);
		}
		
		// fecha scanner
		sc.close();


	}

}
