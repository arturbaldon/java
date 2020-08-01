/*
 * PROBLEMA: "pagamento"
 * VER ARQUIVO "03-estrutura-sequencial-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);
		
		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Valor por hora: ");
		double valorHora = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();
		
		double pagamento = (double)valorHora * horasTrabalhadas;
		System.out.println("O pagamento para " + nome + " deve ser " + String.format("%.2f", pagamento));
		
		// fecha scanner
		sc.close();

	}

}
