import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes"));
        int opcao = mainMenu.getSelection();

        if (opcao == 2) {
            Menu clienteMenu = new Menu("Menu Cliente", Arrays.asList("Editar Cliente"));
            int opcaoCliente = clienteMenu.getSelection();

            if (opcaoCliente == 1) {
                System.out.println("Cliente editado com sucesso!");
            }
        }

        System.out.println("Fim");
    }

}
