package controller;

import model.Cardapio;
import view.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo a padoca mais gostosa do mundo!");
        Cardapio.exibirCardapio();
        System.out.println(interFacePadoca.varInt);
        
    }
}
