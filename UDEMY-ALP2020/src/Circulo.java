/*
 * PROBLEMA: "circulo"
 * VER ARQUIVO "03-estrutura-sequencial-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);
		
		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio do círculo: ");
		double raio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2.0);
		System.out.println("AREA = " + String.format("%.3f", area));
		
		// fecha scanner
		sc.close();

	}

}
