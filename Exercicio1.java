package turma8;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[])
	{	int a,b,c;
		Scanner ler = new Scanner(System.in);
			System.out.printf("Escreva sua udade em anos");
			a=ler.nextInt();
			b=a*12;
			c=b*365;
			System.out.printf("\nSua idade � em anos: %d",a);
			System.out.printf("\nSua idade � em meses: %d",b);
			System.out.printf("\nSua idade � em dias: %d",c);
	}
}
