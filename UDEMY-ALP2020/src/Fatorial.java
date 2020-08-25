/*
 * PROBLEMA: "fatorial"
 * VER ARQUIVO "05-estruturas-repetitivas-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();
		
		if (n >= 0 && n <= 15) {
			int fatorial = 1;
			for (int i = 1; i <= n; i++) {
				fatorial = fatorial * i;
			}
			System.out.println("FATORIAL = " + fatorial);
		}
		
		// fecha scanner
		sc.close();

	}

}
