package Work;

import java.util.Scanner;

public class Matriz1 {
	public static void main (String args[])
	{
		float matriz1[][] = new float [3][3];
		int op=0;
		Scanner ler = new Scanner (System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.printf("\nColoque os valores da Matriz");
				matriz1[i][j]=ler.nextFloat();
				if(matriz1[i][j]>10)
				{
					op++;
				}
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.printf("\nOs valores da matriz sao: %f", matriz1[i][j]);
				
			}
		}
				System.out.printf("\nA quantidade de numeros maiores que 10 foram de: %d", op);
		
		
	}

}
