/*
 * PROBLEMA: "media_idades"
 * VER ARQUIVO "05-estruturas-repetitivas-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Media_idades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as idades:");
		int idade = sc.nextInt();
		
		if (idade < 0) {
			System.out.println("IMPOSSÍVEL CALCULAR");
		} else {
			int divisor = 0;
			double media = 0;
			while (idade >= 0) {
				divisor++;
				media = media + idade;				
				idade = sc.nextInt();
			}
			media = media / divisor;
			System.out.println("MEDIA = " + String.format("%.2f", media));
		}
		
		// fecha scanner
		sc.close();

	}

}
