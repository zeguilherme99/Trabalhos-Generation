package turma8;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String args[])
	{
		float seg,min,hor;
		Scanner ler = new Scanner(System.in);
			System.out.printf("Tempo de duracao do evento em segundos");
			seg=ler.nextInt();
			min=seg/60;
			hor=min/60;
			System.out.printf("\nTempo de duracao do evento em segundos: %f", seg);
			System.out.printf("\nTempo de duracao do evento em minutos: %f", min);
			System.out.printf("\nTempo de duracao do evento em horas: %f", hor);
			
	}

}
