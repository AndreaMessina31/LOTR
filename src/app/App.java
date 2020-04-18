package app;


import app.arma.Arma;

import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("BIENVENIDO A THE LOTR");

        //elegir personaje
        System.out.println("Elija su personaje");


        //elegir arma
        System.out.println("Elegir arma");

        System.out.println("Acha Doble - Espada - Fecha");

        String arma = Teclado.nextLine();
       // personaje.seleccionarArma(String arma, List<Arma> armas1);


    }

    

}