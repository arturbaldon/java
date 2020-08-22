/*
 * PROBLEMA: "aumento"
 * VER ARQUIVO "04-estrutura-condicional-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salario da pessoa: ");
		double salario = sc.nextDouble();
		
		double porcentagem;
		
		if (salario <= 1000.0) {
			porcentagem = 20;			
		} else {
			if (salario <= 3000.0) {
				porcentagem = 15;
			} else {
				if (salario <= 8000.0) {
					porcentagem = 10;
				} else {
					porcentagem = 5;
				}
			}
		}
		
		double aumento = (salario * porcentagem) / 100;
		double novoSalario = aumento + salario;
		
		System.out.println("Novo salario = R$ " + String.format("%.2f", novoSalario));
		System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
		System.out.println("Porcentagem = " + String.format("%.0f", porcentagem) + " %");
		
		// fecha scanner
		sc.close();

	}

}
