import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
		        Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes"));
		        int opcao = mainMenu.getSelection();

	        if (opcao == 2) {
				            Menu clienteMenu = new Menu("Menu Cliente", Arrays.asList("Listar Clientes"));
				            int opcaoCliente = clienteMenu.getSelection();

		            if (opcaoCliente == 1) {
						                System.out.println("Clientes cadastrados:");
						                System.out.println("- Joao Silva");
						                System.out.println("- Maria Souza");
						                System.out.println("- Pedro Santos");
					}
			}

	        System.out.println("Fim");
	}

}
