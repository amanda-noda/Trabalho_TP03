package usuario;

import java.util.Scanner;

/**
 * Primeira comunicacao do usuario com o programa.
 * 
 * @author Amanda Fernandes Custodio
 */
public class MainUsuario {

	/**
	 * Apresenta ao usuario as opcoes existentes, para que ele informe o que deseja
	 * fazer no programa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);

		System.out.print("\n\t\tSISTEMA DE VENDA DE ROUPAS E ACESSORIOS USADOS\n\n");
		System.out.print("|------------------------------------------------|\n");
		System.out.print("|    1. Cadastrar Novo Vendedor                  |\n");
		System.out.print("|    2. Cadastrar Novo Item                      |\n");
		System.out.print("|    3. Cadastrar Nova Categoria                 |\n");
		System.out.print("|    4. Cadastrar Nova Promoção                  |\n");
		System.out.print("|    5. Imprimir Lista De Desejos                |\n");
		System.out.print("|    6. Imprimir Lista De Destaques              |\n");
		System.out.print("|    7. Imprimir Relacao Vendedor-Cliente        |\n");
		System.out.print("|    8. Publicar Novo Item                       |\n");
		System.out.print("|    0. Sair                                     |\n");
		System.out.print("|------------------------------------------------|\n");
		System.out.print("\nInsira a opção desejada: ");

		int opcao = ler.nextInt();

		switch (opcao) {

		case 1:
			System.out.println("\n\t---- CADASTRAR VENDEDOR ----\n");

			System.out.println("\nVendedor cadastrado com sucesso! ");
			break;

		case 2:
			System.out.println("\n\t---- CADASTRAR ITEM ----\n");

			System.out.println("\nItem cadastrada com sucesso! ");
			break;

		case 3:
			System.out.println("\n\t---- CADASTRAR CATEGORIA ----\n");

			System.out.println("\nCategoria cadastrada com sucesso! ");
			break;

		case 4:
			System.out.println("\n\t---- CADASTRAR PROMOÇÃO ----\n");

			System.out.println("\nPromoção cadastrada com sucesso! ");
			break;

		case 5:
			System.out.println("\n\t----  LISTA DE DESEJOS ----\n");

			break;

		case 6:
			System.out.println("\n\t---- LISTA DE DESTAQUES ----\n");

			break;

		case 7:
			System.out.println("\n\t---- RELAÇÃO VENDEDOR E CLIENTE ----\n");

			break;

		case 8:
			System.out.println("\n\t---- PUBLICAR NOVO ITEM ----\n");

			System.out.println("\nItem publicado com sucesso! ");
			break;

		case 0:

			return;

		default:
			System.out.println("Opção inválida!");
			break;
		}

		System.out.println("\nDeseja continuar ou sair? \n1. Continuar \n2.Sair");
		int continuar = ler.nextInt();
		ler.nextLine();

		if (continuar == 1) {
		}

	}
}



