import java.util.Scanner;

public class For {
	public static void main (String args[])
	{
		int x, numero;
		Scanner ler = new Scanner (System.in);
		for(x=1000;x<=1999;x++)
			{ if(x%11==5)
			{
				numero=x;
				System.out.printf("\nNumero: %d ", numero );
			}
			}
	}

}
