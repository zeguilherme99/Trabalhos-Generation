package Work;

import java.util.Scanner;

public class Vetor1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int arrayNum[] = new int[6], soma=0,x;
		for(x=0;x<6;x++)
		{
			System.out.printf("Atribua os valores ao vetor");
			arrayNum[x]=ler.nextInt();
			if(x==0 || x==1 || x==5)
			{
				soma = soma + arrayNum[x];
			}
			if(x==4)
			{
				arrayNum[x]=100;
			}
			
		}
		for(x=0;x<6;x++)
		{
			System.out.printf("\nO vetor é: %d", arrayNum[x]);
		}
			System.out.printf("\nA soma das posicoes é de: %d", soma);
		
	}

}
