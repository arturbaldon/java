/*
 * PROBLEMA: "operadora"
 * VER ARQUIVO "04-estrutura-condicional-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Operadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de minutos: ");
		int minutos = sc.nextInt();
		
		double valorPagar = 50.00;
		if (minutos > 100) {
			valorPagar = valorPagar + ((minutos - 100) * 2.00);			
		}
		
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", valorPagar));
		
		// fecha scanner
		sc.close();

	}

}
