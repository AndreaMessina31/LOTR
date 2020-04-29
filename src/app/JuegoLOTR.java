package app;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import app.arma.*;
import app.reliquia.*;
import app.personaje.*;

public class JuegoLOTR {
    public static Scanner Teclado = new Scanner(System.in);
    public static List<Arma> armas = new ArrayList<Arma>();
    public static List<Personaje> personajes = new ArrayList<Personaje>();
    public static final String blue = "\033[34m";

    // Recorre lista de armas.
    public static Arma buscarArma(int num) {
        for (int i = 0; i < armas.size(); i++) {
            int posicionArma = i + 1;
            if (posicionArma == num) {
                return armas.get(i);
            }
        }
        System.out.println("El numero que ingreso no es valido");
        return null;
    }

    // recorre lista de personajes.
    public static Personaje buscarPersonaje(int personaje) {

        for (int i = 0; i < personajes.size(); i++) {
            int p = i + 1;
            if (p == personaje) {
                return personajes.get(i);
            }
        }
        System.out.println("El numero que ingreso no es valido");
        return null;
    }

    // como detenemos el while para avisar que un personaje puede usar ataque epico

    public static void iniciarBatalla(Personaje p1, Personaje p2, Arma a1, Arma a2  ) {

        String color = blue;
        int i = 1;
        // El juego sigue hasta que uno de los jugadores se queda sin vida.
        while (p1.estaVivo() && p2.estaVivo()) {
            if (p1.estaVivo()) {
                if (p1.tieneStamina()) {
                    System.out.println("ATACANDOOOOO P1");
                    if (i != 0) {
                        a1 = elegirOpcionArma();
                      //  a1 = JuegoLOTR.elegirOpcionArma();
                        // p1.agregarArma(a1);
                        p1.atacar(p2, a1);
                    } 

                    System.out.println("Jugador 1: " + p1.toString()  );
                    System.out.println("Jugador 2: " + p2.toString()  );
                } else{
                    System.out.println(p1.getNombre() + " No puedes atacar, te quedaste sin stamnina ");
                }

            } else {
                System.out.println(p1.getNombre() + " Estas muerto ! :c ");
            }

            if (p2.estaVivo()) {
                if (p2.tieneStamina()) {
                    System.out.println("ATACANDOOOOO P2");
                    if (i != 0) {
                        a2 = elegirOpcionArma();
                      //  a2 = JuegoLOTR.elegirOpcionArma();
                        //p2.agregarArma(a2);
                    }
                    p2.atacar(p1, a2);

                    System.out.println("Jugador 1: " + p1.toString());
                    System.out.println("Jugador 2: " + p2.toString() );
                } else {
                    System.out.println(p2.getNombre() + " no puedes atacar, te quedaste sin stamnina ");

                }
            } else {
                System.out.println(p2.getNombre() + " estas muerto ! :c  ");
                System.out.println("                                                                  \n" +
                        "  __ _   __ _  _ __ ___    ___             ___  __   __  ___  _ __ \n" +
                        " / _` | / _` || '_ ` _ \\  / _ \\           / _ \\ \\ \\ / / / _ \\| '__|\n" +
                        "| (_| || (_| || | | | | ||  __/          | (_) | \\ V / |  __/| |   \n" +
                        " \\__, | \\__,_||_| |_| |_| \\___|           \\___/   \\_/   \\___||_|   \n" +
                        "  __/ |                                                            \n" +
                        " |___/                                                   ");
            }
            i++;

        }

        // elegir proxima arma
        // puede usar ataque epico

        // Resultado de la Batalla
        System.out.println("Batalla finalizada salud de los jugadores " + "  "+p1.getNombre() +"  "+ p1.getSalud()
                + "  " + p2.getNombre() + "  " +p2.getSalud());
        System.out.println("Batalla finalizada  stamina de los jugadores " + "  " + p1.getNombre() + "  " + p1.getStamina()
                + "  " + p2.getNombre() +"  " + p2.getStamina());

        if (p1.estaVivo()) {

            System.out.println("El ganador es " + p1.getNombre());

        } else {
            System.out.println("El ganador es " + p2.getNombre());
        }

    }

    static Arma elegirOpcionArma() {
        System.out.println("Ingrese el nombre del arma");
        System.out.println("*********************");
        System.out.println("1. Espada Sting");
        System.out.println("2. Espada Anduril");
        System.out.println("3. Hacha doble");
        System.out.println("4. Arco y flecha");
        System.out.println("5. Baculo");
        System.out.println("*********************");

        int arma = Teclado.nextInt();

        Arma arm = buscarArma(arma);

        return arm;
    }

    static Personaje elegirOpcionPersonaje() {
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

        int personaje = Teclado.nextInt();

        Personaje p = buscarPersonaje(personaje);

        return p;
    }

        
  //  public void preguntarAtaqueEpico(Wizard w, Elfo e) {
        
  //      if(w.puedoEjecutarAtaqueEpico()|| e.puedoEjecutarAtaqueEpico()){

    //   }
        
   //         System.out.println("¿Quieres ejecutar ataque epico ?");



    public void inicializar() {
        // Arma

        Sting sting = new Sting("Espada Sting", 20, 21, 10);

        Anduril anduril = new Anduril("Espada Anduril", 30, 11, 10);

        HachaDoble hacha = new HachaDoble("Hacha doble", 35, 11);

        ArcoYFlecha arco = new ArcoYFlecha("Arco y flecha", 11, 20);

        Baculo baculo = new Baculo("Baculo", 35, 15,10);

        armas.add(sting);
        armas.add(anduril);
        armas.add(hacha);
        armas.add(arco);
        armas.add(baculo);

        // Reliquia

        FrascoGaladriel frascoGaladriel = new FrascoGaladriel("Gabriel", 10, 12, 0 );

        ChalecoMithril chalecoMithril = new ChalecoMithril("LOL", 20, 23);

        AnilloSauron anilloSauron = new AnilloSauron("Sauron", 30, 42, 8);

        AnilloElfo anilloElfo = new AnilloElfo("Elfo", 20, 20, 5);

        AnilloNarya anilloNarya = new AnilloNarya("Nerya", 22, 24, 4);

        AnilloNenya anilloNenya = new AnilloNenya("Nenya", 22, 21, 6);

        AnilloVilya anilloVilya = new AnilloVilya("Vilya", 20, 20, 9);

        // Personaje

        Humano humano1 = new Humano("Aragorn", 100, 70, chalecoMithril);

        Humano humano2 = new Humano("Boromir", 100, 400, anilloNenya);

        Wizard wizard = new Wizard("Gandalf", 100, 80, frascoGaladriel, 100);

        Hobbit hobbit = new Hobbit("Frodo", 100, 100, anilloSauron);

        Elfo elfo = new Elfo("Legolas <3 ", 100, 100, anilloElfo, 100);


        Orco orco = new Orco("Orco", 100, 100);

        Goblin goblin = new Goblin("Goblin", 100, 100);

        Enano enano = new Enano("Gimli", 100, 100);

        Troll troll = new Troll("Troll", 100, 120);

        personajes.add(humano1);
        personajes.add(humano2);
        personajes.add(wizard);
        personajes.add(hobbit);
        personajes.add(elfo);
        personajes.add(orco);
        personajes.add(goblin);
        personajes.add(enano);
        personajes.add(troll);

    }

	}


