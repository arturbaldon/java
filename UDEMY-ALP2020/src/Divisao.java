/*
 * PROBLEMA: "divisão"
 * VER ARQUIVO "05-estruturas-repetitivas-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos você vai digitar? ");
		int n = sc.nextInt();
		
		int numerador, denominador;
		double resultado;
		for (int i = 0; i < n; i++) {
			System.out.print("Entre com o numerador: ");
			numerador = sc.nextInt();
			System.out.print("Entre com o denominador: ");
			denominador = sc.nextInt();
			if (denominador == 0) {
				System.out.println("DIVISÃO IMPOSSÍVEL");
			} else {
				resultado = (double) numerador / denominador;
				System.out.println("DIVISÃO = " + String.format("%.2f", resultado));
			}
		}
		
		// fecha scanner
		sc.close();

	}

}
