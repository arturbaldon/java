/*
 * PROBLEMA: "pares_consecutivos"
 * VER ARQUIVO "05-estruturas-repetitivas-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Pares_consecutivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int x = sc.nextInt();
		
		int soma;
		while (x != 0) {
			if (x % 2 != 0) {
				x++;
			}
			soma = (5 * x) + 20;
			System.out.println("SOMA = " + soma);
			System.out.print("Digite um número inteiro: ");
			x = sc.nextInt();
		}
		
		// fecha scanner
		sc.close();

	}

}
