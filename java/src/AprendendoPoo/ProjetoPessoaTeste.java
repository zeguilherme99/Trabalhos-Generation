package AprendendoPoo;

import java.util.*;

public class ProjetoPessoaTeste {
	public static void main (String args[])
	{
	 @SuppressWarnings("resource")
	Scanner ler = new Scanner (System.in);
	 Random random = new Random();

	 
	 ProjetoPessoa user = new ProjetoPessoa ("Roberto",251897,"(QUA e SEX)",5,"Calmo", 1564);
	 ProjetoPessoa a = new ProjetoPessoa ("Claudia",25496,"(QUA e SEX)",4,"Calmo", 1469);
	 int resp=0, resp2=0,resp3=0,tempo1=user.getTempo(), numero = random.nextInt(1000);
;
	 String nome1,dias,perfil;
	 
	 do
	 {
	 System.out.println("Entre com a senha:");
	 resp3=ler.nextInt();
	 	if(resp3==user.getAcesso() || resp3==a.getAcesso())
	 	{
	 	do
	 	{
		System.out.println("\nOlá Sr(a) "+user.getNome()+"\n\nO que gostaria de fazer hoje \n(1) Meu Perfil \n(2) Rotina Meditação \n(3) Inserir Meditação \n(4) Alterar dados \n(0) Sair");
		resp=ler.nextInt();
		
			switch(resp)
			{
			case 1: System.out.println("NOME: "+user.getNome()+"\nUSUARIO: "+user.getUsuario()+"\nESTADO: "+user.getPsico()+"\nSenha: "+user.getAcesso());
			break;
			case 2: System.out.println("\nDIAS: "+user.getRotina()+"\nTEMPO: "+user.getTempo()+"min");
			 break;
			case 3:System.out.println("Quantos minutos meditou hoje?");
			resp2=ler.nextInt();
			
				if(resp2>=user.getTempo() && resp2!=0)
				{
				System.out.println("Parabens!!! Mantenha o ritmo");
				}
				else if (resp2<user.getTempo() && resp2>0)
				{
				System.out.println("Muito bem, tente mais na proxima");
				}
				else if (resp2==0)
				{
				System.out.println("Puxa. Que tal tentar hoje?");
				}
				else
				{
				System.out.println("ERROR");
				}
			break;
			 case 4: //Tem um bug por aqui 	 
			
			 System.out.println("Entre com a nova senha");
			
			 
			 resp3=ler.nextInt();
			user.setAcesso(resp3);
			 if (resp3==user.getAcesso())
			 {nome1=ler.nextLine();
				 
			 
			 System.out.printf("Entre com seu nome: ");
			 nome1=ler.nextLine();
			 user.setNome(nome1);
			 user.setUsuario(numero);
			 
			 System.out.println("\nBeleza vamos lá!"+user.getNome());
			
			 System.out.println("Como você se sente? (CALMO) (ESTRESSADO) (IRRITADO): ");
			 perfil=ler.nextLine();
			 user.setPsico(perfil);
			 
			 System.out.println("Entre com seu dia da semana que quer meditar EX: (QUA e SEX): ");
			 dias=ler.nextLine();
			 user.setRotina(dias);
			 
			 do {System.out.println("Quantos minutos gostaria de meditar?: ");
			 tempo1=ler.nextInt();
			 user.setTempo(tempo1);
			 if (tempo1<=0)
				 {System.out.println("Invalido");}} while (tempo1<=0); 
				
			 
			 System.out.println("Dados alterados");
			 }
			 else
			 {
			 System.out.println("Senha incorreta");
			 }
			break;
	 		default:
	 		break;
			}
	 	}while(resp!=0);{
	 System.out.println("Obrigado por usar nosso sistema");
	 	}
	 	}
	 	else
	 	{
	 	System.out.println("Acesso Negado");
	 	}
}while(resp3!=user.getAcesso());
}

}
