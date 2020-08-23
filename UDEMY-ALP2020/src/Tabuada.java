/*
 * PROBLEMA: "tabuada"
 * VER ARQUIVO "05-estruturas-repetitivas-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Deseja a tabuada para qual valor? ");
		int n = sc.nextInt();
		
		int produto;
		for (int i = 1; i <= 10; i++) {
			produto = n * i;
			System.out.println(n + " x " + i + " = " + produto);
		}
		
		// fecha scanner
		sc.close();

	}

}
