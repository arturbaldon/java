/*
 * PROBLEMA: "lanchonete"
 * VER ARQUIVO "04-estrutura-condicional-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código do produto comprado: ");
		int codigo = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		int quantidade = sc.nextInt();
		
		double valorPagar = 0;
		
		switch (codigo) {
		case 1:
			valorPagar = quantidade * 5.00;
			break;
		case 2:
			valorPagar = quantidade * 3.50;
			break;
		case 3:
			valorPagar = quantidade * 4.80;
			break;
		case 4:
			valorPagar = quantidade * 8.90;
			break;
		case 5:
			valorPagar = quantidade * 7.32;
			break;
		default:
			System.out.println("Código inválido!");
			break;
		}
		
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", valorPagar));
		
		// fecha scanner
		sc.close();

	}

}
