package AprendendoPoo;

import java.util.Random;
import java.util.Scanner;

public class ProjetoPessoaTesteFinal {
	public static void main(String args[]) {
	@SuppressWarnings("resource")
	Scanner ler = new Scanner(System.in);
	Random random = new Random();

	ProjetoPessoa user = new ProjetoPessoa("Robertx", 251897, "(QUA e SEX)", 5, "Relax", 1564);
	int resp = 0, resp2 = 0, resp3 = 0, tempo1 = user.getTempo(), numero = random.nextInt(1000);
	String nome1, dias, perfil;

	do {
		System.out.println("Oioi, tutupom? Entre com a senha:");
		resp3 = ler.nextInt();
		if (resp3 == user.getAcesso()) {
			do {
				System.out.println("\nOl� Sr(a) " + user.getNome() + "!"
						+ "\n\nO que gostaria de fazer hoje? \n(1) Ver seu Perfilzinho \n(2) Acompanhar sua rotina de medita��o \n(3) Inserir sua de medita��o de hoje \n(4) Alterar todos os seus dados \n(0) Sair");
				resp = ler.nextInt();

				switch (resp) {
				case 1:
					System.out.println("SEU NOMEZINHO: " + user.getNome() + "\nSEU ID: " + user.getUsuario() + "\nVOC� EST�: "
							+ user.getPsico() + "\nSenha: " + "Shiu, � segredo!");
					break;
				case 2:
					System.out.println("\nDIAS: " + user.getRotina() + "\nTEMPO: " + user.getTempo() + "min por dia");
					break;
				case 3:
					System.out.println("Quantos minutos voc� meditou hoje?");
					resp2 = ler.nextInt();

					if (resp2 >= user.getTempo() && resp2 != 0) {
						System.out.println("Nossa, parab�ns!!! Isso foi show de boliche! Mantenha o ritmo!");
					} else if (resp2 < user.getTempo() && resp2 > 0) {
						System.out.println("Muito que bem, acredito que na pr�xima voc� consegue!");
					} else if (resp2 == 0) {
						System.out.println("Entendo que seu dia pode ter sido dif�cil. Que tal tentar um pouquinho hoje?");
					} else {
						System.out.println("UIUU UIUU, DEU ERRO, DEU ERRO!");
					}
					break;
				case 4:

					System.out.println("Beleza, ent�o entre com uma nova senha num�rica: ");

					resp3 = ler.nextInt();
					user.setAcesso(resp3);
					if (resp3 == user.getAcesso()) {
						nome1 = ler.nextLine();

						System.out.printf("Agora me diga seu nome: ");
						nome1 = ler.nextLine();
						user.setNome(nome1);
						user.setUsuario(numero);
						System.out.println("\nBeleza vamos l� " + user.getNome() + "!");

						System.out.println("Agora, papo reto, me diga brevemente, como voc� est� hoje: ");
						perfil = ler.nextLine();
						user.setPsico(perfil);
						
						System.out.println("Entendo, que bom que est� aqui, autocuidado � um detalhe t�o importante na nossa vida! N�o �?");
						perfil = ler.nextLine();

						System.out.println("Vamos l�, escolha o(s) dia(s) da semana que quer meditar EX: (QUA e SEX): ");
						dias = ler.nextLine();
						user.setRotina(dias);

						do {
							System.out.println("Me diga, quantos minutos por dia gostaria de meditar?: ");
							tempo1 = ler.nextInt();
							user.setTempo(tempo1);
							if (tempo1 <= 0) {
								System.out.println("Eita, voc� digitou alguma coisa que eu n�o consigo entender...");
							}
						} while (tempo1 <= 0);

						System.out.println("Seus dados foram alterados com sucesso!");
					} else {
						System.out.println("Cuidado, sua senha est� incorreta");
					}
					break;
				default:
					break;
				}
			} while (resp != 0);
			{
				System.out.println("Valeu Valeu, at� a pr�xima!");
			}
		} else {
			System.out.println("Deu ~bijuja~ oxe, assim n�o tem como entrar queridx");
		}
	} while (resp3 != user.getAcesso());
}

}
