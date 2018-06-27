package br.com.DateCalendarSimpleDateFomat;

import java.util.Scanner;

public class UseDataHelper {
	private static String data;
	private static int opcao;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Digite sua data no formato 'dd/MM/yyyy hh:mm:ss': ");
		data = readConsole();

		DataHelper dh = new DataHelper(data);

		do {

			showMenu();

			switch (opcao) {
			case 0: {
				System.out.println("At� mais...");
				break;
			}
			case 1: {
				System.out.println("Digite a quantidade de dias: ");
				int qtd = Integer.valueOf(readConsole());
				dh.adicionarDias(qtd);
				System.out.println("Nova data: " + dh.getAsString());
				break;
			}
			case 2: {
				System.out.println("Digite a data para comparar (formato dd/MM/yyyy hh:mm:ss):");
				String dataToCompare = readConsole();
				int c = dh.comparar(dataToCompare);
				if (c < 0) {
					System.out.println("A data original � menor que esta data");
				} else if (c > 0) {
					System.out.println("A data original � maior que esta data");
				} else {
					System.out.println("A data original � igual a esta data");
				}
				break;
			}
			case 3: {
				System.out.println("Horas = " + dh.getHoras());
				break;
			}
			case 4: {
				System.out.println("Minutos = " + dh.getMinutos());
				break;
			}
			case 5: {
				System.out.println("Digite a quantidade de dias a deletar: ");
				int qtd = Integer.valueOf(readConsole());
				dh.adicionarDias(-qtd);
				System.out.println("Nova data: " + dh.getAsString());
				break;
			}
			default:
				System.err.println("Opcao invalida");
				break;
			}

		} while (opcao != 0);
	}

	private static void showMenu() {

		System.out.println("1. Adicionar dias");
		System.out.println("2. Comparar datas");
		System.out.println("3. Retornar horas");
		System.out.println("4. Retornar minutos");
		System.out.println("5. Remover dias");
		System.out.println("0. Sair");
		System.out.println("Escolha uma das op��es acima: ");
		opcao = Integer.valueOf(readConsole());
	}

	@SuppressWarnings("resource")
	private static String readConsole() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

}
