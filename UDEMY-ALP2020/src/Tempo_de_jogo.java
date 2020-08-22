/*
 * PROBLEMA: "tempo_de_jogo"
 * VER ARQUIVO "04-estrutura-condicional-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Tempo_de_jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hora inicial: ");
		int horaInicial = sc.nextInt();
		System.out.print("Hora final: ");
		int horaFinal = sc.nextInt();
		
		int duracao;
		
		if (horaFinal > horaInicial) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = (24 - horaInicial) + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		// fecha scanner
		sc.close();

	}

}
