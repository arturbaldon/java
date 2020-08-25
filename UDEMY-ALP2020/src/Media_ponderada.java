/*
 * PROBLEMA: "media_ponderada"
 * VER ARQUIVO "05-estruturas-repetitivas-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Media_ponderada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos você vai digitar? ");
		int n = sc.nextInt();
		
		double x1, x2, x3, mediaPonderada;		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite três números:");
			x1 = sc.nextDouble();
			x2 = sc.nextDouble();
			x3 = sc.nextDouble();
			mediaPonderada = ((x1 * 2.0) + (x2 * 3.0) + (x3 * 5.0)) / (2.0 + 3.0 + 5.0);
			System.out.println("MEDIA = " + String.format("%.1f", mediaPonderada));
		}
		
		// fecha scanner
		sc.close();

	}

}
