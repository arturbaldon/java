/*
 * PROBLEMA: "temperatura"
 * VER ARQUIVO "04-estrutura-condicional-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
		char escala = sc.next().charAt(0);
		
		double fahrenheit, celsius;
		
		if (escala == 'F' || escala == 'f') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			fahrenheit = sc.nextDouble();
			celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
			System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", celsius));
		} else {
			System.out.print("Digite a temperatura em Celsius: ");
			celsius = sc.nextDouble();
			fahrenheit = (celsius * (9.0 / 5.0)) + 32.0;
			System.out.println("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", fahrenheit));
		}
		
		// fecha scanner
		sc.close();

	}

}
