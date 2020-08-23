/*
 * PROBLEMA: "soma_impares"
 * VER ARQUIVO "05-estruturas-repetitivas-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Soma_impares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x > y) {
			int trocaPosicao = x;
			x = y;
			y = trocaPosicao;
		}
		
		int soma = 0;
		for (int i = (x + 1); i < y; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}			
		}
		
		System.out.println("SOMA DOS IMPARES = " + soma);
		
		// fecha scanner
		sc.close();

	}

}
