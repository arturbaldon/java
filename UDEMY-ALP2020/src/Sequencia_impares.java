/*
 * PROBLEMA: "sequencia_impares"
 * VER ARQUIVO "05-estruturas-repetitivas-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Sequencia_impares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		// fecha scanner
		sc.close();

	}

}
