/*
 * PROBLEMA: "duracao"
 * VER ARQUIVO "03-estrutura-sequencial-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Duracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);
		
		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a duração em segundos: ");
		int duracao = sc.nextInt();
		
		int hora = duracao / 3600;
		int resto = duracao % 3600;
		int minuto = resto / 60;
		int segundo = resto % 60;
		
		System.out.println(hora + ":" + minuto + ":" + segundo);
		
		// fecha scanner
		sc.close();

	}

}
