/*
 * PROBLEMA: "par_impar"
 * VER ARQUIVO "05-estruturas-repetitivas-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Par_impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int x;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			x = sc.nextInt();
			if (x == 0) {
				System.out.println("NULO");				
			} else {
				if (x % 2 == 0) {
					System.out.print("PAR ");
				} else {
					System.out.print("IMPAR ");
				}
				if (x > 0) {
					System.out.println("POSITIVO");
				} else {
					System.out.println("NEGATIVO");
				}
			}
		}
		
		// fecha scanner
		sc.close();

	}

}
