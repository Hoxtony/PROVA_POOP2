import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
		public static void main(String[] args) {
			List <Item> itens = new ArrayList<>();
			Scanner scan = new Scanner(System.in);
			int op;
			int op2;
			do {
				System.out.println("---- BEM VINDO AO APP DE COLEÇÕES! ----");
				System.out.println("--------------- MENU -----------------");
				System.out.println("| 1 Para adicionar um item à coleção |");
				System.out.println("|---- 2 Exibir coleção de itens  ----|");
				System.out.println("|---- 3 Exibir valor da coleção  ----|");
				System.out.println("|---- 0 Para Desligar o sistema  ----|");

				op = scan.nextInt();

				if (op == 4) {
					System.out.print("\nAté logo!\n");
					scan.close();
				}
				switch (op) {
					case 1:
						do {
							System.out.println("------------- ARMAZENAMENTO ------------");
							System.out.println("|----------------- MENU ---------------|");
							System.out.println("|------- 1  Adicionar uma moeda -------|");
							System.out.println("|---- 2  Adicionar um selo regular ----|");
							System.out.println("|-- 3 Adicionar um selo comemorativo --|");
							System.out.println("|------------ 4 Para voltar -----------|");
							op2 = scan.nextInt();
							if (op2< 1) {
								System.out.println("Opção inválida!");
							} else if (op2 >= 5) {
								System.out.println("Opção inválida!");
							}
							switch(op2) {
								case 1: {
										float valorMoeda;
										Scanner valorM = new Scanner(System.in);
										System.out.print("Por favor, insira o valor da Moeda: ");
										valorMoeda = valorM.nextFloat();
										itens.add(new Moeda(null, valorMoeda));
										System.out.println("Moeda Adicionada!");
										break;
									}
								case 2: {
										float valorSeloRegular;
										Scanner valorSR = new Scanner(System.in);
										System.out.print("Por favor, insira o valor do Selo Regular: ");
										valorSeloRegular = valorSR.nextFloat();
										itens.add(new SeloRegular(null, valorSeloRegular));
										System.out.println("Selo Regular adicionado!");
										break;
									}
								case 3: {
										float valorSeloComemorativo;
										Scanner valorSC = new Scanner(System.in);
										System.out.print("Por favor, insira o valor do Selo Comemorativo: ");
										valorSeloComemorativo = valorSC.nextFloat();
										itens.add(new SeloComemorativo(null, valorSeloComemorativo));
										System.out.println("Selo Comemorativo adicionado!");
										break;
									}
								case 4:
									break;
							}
						} while (op2 ==1 || op2 ==2 || op2==3);
						break;
					case 2:
						for ( Item i : itens) {
							i.exibir();
							System.out.println("\n");
						}
						break;

					case 3:
						float soma = 0;

						for (int j = 0; j < itens.size(); j++) {
							soma += itens.get(j).getValor();
						}

						for ( Item i : itens) {
							i.exibir();
							System.out.println("\n");
						}
						System.out.printf("A soma dos valores da colecao é: %.2f\n", soma);
						break;

					case 0:
						System.out.println("Sistema Desligado\nAté Logo!");
						break;
					default:
						System.out.println("Opcao Invalida!");
						break;
				}
			} while (op ==1 || op ==2 || op==3);
			scan.close();
		}
}