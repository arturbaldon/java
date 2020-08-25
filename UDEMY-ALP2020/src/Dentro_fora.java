/*
 * PROBLEMA: "dentro_fora"
 * VER ARQUIVO "05-estruturas-repetitivas-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Dentro_fora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int x, dentro = 0, fora = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		
		System.out.println(dentro + " DENTRO");
		System.out.println(fora + " FORA");
		
		// fecha scanner
		sc.close();

	}

}
