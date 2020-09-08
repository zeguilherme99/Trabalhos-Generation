package turma8;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String args[])
	{
		double x1,y1,x2,y2,calc1,calc2,calc3,raiz;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Escreva a coordenada x do primeiro ponto: ");
		x1=ler.nextFloat();
		System.out.printf("Escreva a coordenada y do primeiro ponto: ");
		y1=ler.nextFloat();
		System.out.printf("Escreva a coordenada x do segundo ponto: ");
		x2=ler.nextFloat();
		System.out.printf("Escreva a coordenada y do segundo ponto: ");
		y2=ler.nextFloat();
		calc1=(x2-x1)*(x2-x1);
		calc2=(y2-y1)*(y2-y1);
		calc3=calc1+calc2;
		raiz=Math.sqrt(calc3);
		System.out.printf("\nO resultado é: %f", raiz);
	}

}
