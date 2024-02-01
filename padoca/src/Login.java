import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        //view
        String menu[] = {"1 - Bolo","2 - Torta","3 - Chá","0 - Sair"};
        boolean exit = false;
        try {
            System.out.println("Olá! Bem vindo a Padoka!");
            while (exit == false) {
                Scanner scnInput = new Scanner(System.in);
                System.out.println("Gostaria de ver nosso cardapio?");
                System.out.println("1 - Cardapio\n\r2 - Sair");
                //controller
                String strResp = scnInput.nextLine();
                if (strResp.equals("1")) {
                    for (int i = 0; i < 4; i++) {
                        System.out.println(menu[i]);
                    }
                strResp = scnInput.nextLine();
                switch (strResp) {
                    case "1":
                        System.out.println("Adicionado no carrinho.");
                        break;
                    case "2":
                        System.out.println("Adicionado no carrinho.");
                        break;
                    case "3":
                        System.out.println("Adicionado no carrinho.");
                        break;
                    default:
                        exit = true;
                        break;
                }
                } else {
                    exit = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Ops! ocorreu o erro " + e);
        }
    }
}
