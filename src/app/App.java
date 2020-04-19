package app;


import app.arma.*;
import app.personaje.*;
import app.reliquia.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);
    public static JuegoLOTR JuegoLotr;

    public static void main(String[] args) throws Exception {
        System.out.println("*************************");
        System.out.println("*                       *");
        System.out.println("* BIENVENIDO A THE LOTR *");
        System.out.println("*                       *");
        System.out.println("*************************");

        int opcion = 0;

        JuegoLotr = inicializar();


            opcion = elegirOpcion();

            switch (opcion) {
                case 1:
                    elegirOpcionPersonaje();
                    break;
                case 2:
                    elegirOpcionArma();
                    break;
                default:
                    break;
            }
    }

    private static int elegirOpcion() {
        System.out.println("*********************");
        System.out.println("Elija el nro de la opcion");
        System.out.println("1. Personaje");
        System.out.println("2. Arma");
        System.out.println("0. Salir");
        System.out.println("*********************");

        int opcion;

        opcion = Teclado.nextInt();
        Teclado.nextLine();

        return opcion;
    }

    private static void elegirOpcionArma() {
        System.out.println("Ingrese el nombre del arma");
        System.out.println("*********************");
        System.out.println("1. Espada Sting");
        System.out.println("2. Espada Anduril");
        System.out.println("3. Hacha doble");
        System.out.println("4. Arco y flecha");
        System.out.println("5. Baculo");
        System.out.println("*********************");

        String arma = Teclado.nextLine();

        Arma arm = JuegoLotr.buscarArma(arma);
        jugador1.add(arm);
    }

    private static void elegirOpcionPersonaje() {
        System.out.println("Ingrese el nombre del Personaje");
        System.out.println("*********************");
        System.out.println("1. Aragorn");
        System.out.println("2. Boromir");
        System.out.println("3. Gandalf");
        System.out.println("4. Frodo");
        System.out.println("5. Legolas <3 ");
        System.out.println("6. Orco");
        System.out.println("7. Goblin");
        System.out.println("8. Gimli");
        System.out.println("9. Troll");
        System.out.println("*********************");

        String personaje = Teclado.nextLine();

        jugador = JuegoLotr.buscarPersonaje(personaje);
    }

    public static JuegoLOTR inicializar() {

        //juego LOTR

        List<Arma> armas = new ArrayList<Arma>();
        List<Personaje> personajes = new ArrayList<Personaje>();

        JuegoLOTR juego = new JuegoLOTR(armas, personajes);

        //Arma

        Sting sting = new Sting ("Espada Sting", 10 , 10 );

        Anduril anduril = new Anduril ("Espada Anduril", 10, 10);

        HachaDoble hacha  = new HachaDoble("Hacha doble", 8 , 8 );

        ArcoYFlecha arco = new ArcoYFlecha( "Arco y flecha", 7 ,7 );

        Baculo  baculo = new Baculo ("Baculo", 6 , 7);

        armas.add(sting);
        armas.add(anduril);
        armas.add(hacha);
        armas.add(arco);
        armas.add(baculo);


        //Reliquia

        FrascoGaladriel frascoGaladriel = new FrascoGaladriel("Gabriel", 10, 12, 0);

        ChalecoMithril chalecoMithril = new ChalecoMithril("LOL", 20, 23);

        AnilloSauron anilloSauron = new AnilloSauron("Sauron", 30, 42, 8);

        AnilloElfo anilloElfo = new AnilloElfo("Elfo", 20, 20,5);

        AnilloNarya anilloNarya = new AnilloNarya("Nerya", 22, 24, 4);

        AnilloNenya anilloNenya = new AnilloNenya("Nenya", 22, 21, 6);

        AnilloVilya anilloVilya = new AnilloVilya("Vilya", 20, 20, 9);



        //Personaje

        Humano humano1 = new Humano("Aragorn", 100 , 90, armas, anilloElfo);

        Humano humano2 = new Humano("Boromir", 100 , 90, armas, anilloElfo);

        Wizard wizard = new Wizard ("Gandalf", 100 , 80, armas, anilloElfo, 10);

        Hobbit hobbit = new Hobbit ("Frodo", 100, 100, armas, anilloElfo);

        Elfo elfo = new Elfo ("Legolas <3 ", 100, 100, armas, anilloElfo, 30);

        Orco orco= new Orco ("Orco", 100, 100, armas);

        Goblin goblin = new Goblin ("Goblin", 100, 100, armas);

        Enano enano = new Enano ("Gimli", 100, 100, armas);

        Troll troll = new Troll ("Troll", 100, 120, armas);

        personajes.add(humano1);
        personajes.add(humano2);
        personajes.add(wizard);
        personajes.add(hobbit);
        personajes.add(elfo);
        personajes.add(orco);
        personajes.add(goblin);
        personajes.add(enano);
        personajes.add(troll);

        return juego;
    }

}
