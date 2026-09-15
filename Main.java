import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cadastrar Cliente", "Operacoes", "Sair"));
		while (true) {
			int sel = mainMenu.getSelection();
			System.out.println(sel + "foi selecionada");
			if (sel == 4) {
				break;
			}
		}
		System.out.println("Fim");
	}

}