package controller;

import java.util.Scanner;

import view.*;

public class PedidosController {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        boolean sair = false;
        PedidosView.boasVindas();

        while (sair == false) {
            PedidosMenu.menu();
            String strInput = scnInput.nextLine();
            if (strInput.equals("1")) {
                PedidosNav.navegação();
            } else {
                PedidosDespedida.adeus();
                sair = true;
            }
        }
    }
}
