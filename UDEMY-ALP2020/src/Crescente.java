/*
 * PROBLEMA: "crescente"
 * VER ARQUIVO "05-estruturas-repetitivas-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != y) {
			if (x < y) {
				System.out.println("CRESCENTE!");
			} else {
				System.out.println("DECRESCENTE!");
			}
			System.out.println("Digite outros dois números:");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		// fecha scanner
		sc.close();

	}

}
