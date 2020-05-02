package app;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import app.arma.*;
import app.reliquia.*;
import app.personaje.*;

public class JuegoLOTR {
    private static Scanner Teclado = new Scanner(System.in);
    private static List<Arma> armas = new ArrayList<Arma>();
    private static List<Personaje> personajes = new ArrayList<Personaje>();

    public static final String blue = "\033[34m";

    // Recorre lista de armas.
    private static Arma buscarArma(int indiceA) {
        if (indiceA >= 1 && indiceA <= 5) {
            return armas.get(indiceA - 1);
        }

        System.out.println("EL NUMERO QUE INGRESO NO ES VALIDO");
        return null;
    }

    // recorre lista de personajes.
    private static Personaje buscarPersonaje(int indiceP) {
        if (indiceP >= 1 && indiceP <= 9) {
            return personajes.get(indiceP - 1);
        }

        System.out.println("EL NUMERO QUE INGRESO NO ES VALIDO");
        return null;
    }

    static void iniciarBatalla(Personaje p1, Personaje p2) {

        // El juego sigue hasta que uno de los jugadores se queda sin vida.
        do {
            if (p1.tieneStamina() || p2.tieneStamina()) {

                if (p1.estaVivo()) {
                    if (p1.tieneStamina()) {
                        System.out.println("                    ");
                        System.out.println("                            JUGADOR 1");
                        Arma a1 = elegirOpcionArma();
                        p1.agregarArma(a1);
                        p1.atacar(p2, a1);
                        System.out.println("                                                 ");
                        System.out.println("                          ATACANDO JUGADOR 1");
                        System.out.println("               ★★★★★★★★★★★★★★★★★★★★★★★★★★");
                        resultadoJugadores(p1, p2);
                        System.out.println("         ARMA JUGADOR 1: " + a1.getNombre() + " ---  DAÑO " + a1.getDanio()
                                + " ---  STAMINA " + a1.getStamina());
                    } else {
                        System.out.println("         ");
                        System.out.println("                            TE QUEDASTE SIN STAMINA " + p1.getNombre());
                    }

                } else {
                    System.out.println("                  ");
                    System.out.println("                  ");
                    System.out.println("                            GAME OVER " + p1.getNombre());
                }

                if (p2.estaVivo()) {
                    if (p2.tieneStamina()) {
                        System.out.println("                    ");
                        System.out.println("                            JUGADOR 2");
                        Arma a2 = elegirOpcionArma();
                        p2.agregarArma(a2);
                        p2.atacar(p1, a2);
                        System.out.println("                                                 ");
                        System.out.println("                          ATACANDO JUGADOR 2");
                        System.out.println("               ★★★★★★★★★★★★★★★★★★★★★★★★★★");
                        resultadoJugadores(p1, p2);
                        System.out.println("         ARMA JUGADOR 2: " + a2.getNombre() + " ---  DAÑO " + a2.getDanio()
                                + " ---  STAMINA " + a2.getStamina());
                    } else {
                        System.out.println("         ");
                        System.out.println("                       TE QUEDASTE SIN STAMINA " + p2.getNombre());

                    }
                } else {
                    System.out.println("          ");
                    System.out.println("                  ");
                    System.out.println("                            GAME OVER " + p2.getNombre());
                }

            } else {
                System.out.println("                         ");
                System.out.println("                         ");

                System.out.println("                      AMBOS SE QUEDARON SIN STAMINA");

                System.out.println("                                 EMPATE         ");
                break;
            }

        } while (p1.estaVivo() && p2.estaVivo());

        // Resultado de la Batalla
        System.out.println("       ");
        System.out.println("       ");
        System.out.println("                          FINAL DE LA BATALLA ");
        System.out.println("                     ⛧⛧⛧⛧⛧⛧⛧⛧⛧⛧⛧⛧⛧⛧⛧");
        System.out.println("         JUGADOR 1:  " + p1.getNombre() + " ---  SALUD " + p1.getSalud() + " ---  STAMINA "
                + p1.getStamina());
        System.out.println("         JUGADOR 2:  " + p2.getNombre() + " ---  SALUD " + p2.getSalud() + " ---  STAMINA "
                + p2.getStamina());
        System.out.println("       ");
        System.out.println("       ");

        if (p1.estaVivo())

        {
            System.out.println("                      ⛧  GANADOR: " + p1.getNombre());
        }
        if (p2.estaVivo()) {
            System.out.println("                      ⛧  GANADOR: " + p2.getNombre());
        }

        if (!p1.estaVivo() && !p2.estaVivo()) {
            System.out.println("                                       AMBOS SE MURIERON");

            System.out.println("                                             EMPATE         ");
        }

    }

    private static Arma elegirOpcionArma() {
        int arma;
        Arma arm;
        do {
            System.out.println("                    INGRESE EL NUMERO DEL ARMA");
            System.out.println("                      *********************");
            System.out.println("                         1. Espada Sting");
            System.out.println("                         2. Espada Anduril");
            System.out.println("                         3. Hacha doble");
            System.out.println("                         4. Arco y flecha");
            System.out.println("                         5. Baculo");
            System.out.println("                      *********************");
            arma = Teclado.nextInt();
            arm = buscarArma(arma);

        } while (arm == null);

        return arm;
    }

    static Personaje elegirOpcionPersonaje() {
        int personaje;
        Personaje p;
        do {
            System.out.println("               INGRESE EL NUMERO DEL PERSONAJE");
            System.out.println("                    *********************");
            System.out.println("                         1. Aragorn");
            System.out.println("                         2. Boromir");
            System.out.println("                         3. Gandalf");
            System.out.println("                         4. Frodo");
            System.out.println("                         5. Legolas <3 ");
            System.out.println("                         6. Orco");
            System.out.println("                         7. Goblin");
            System.out.println("                         8. Gimli");
            System.out.println("                         9. Troll");
            System.out.println("                    *********************");

            personaje = Teclado.nextInt();

            p = buscarPersonaje(personaje);

        } while (p == null);

        return p;
    }

    private static void resultadoJugadores(Personaje p1, Personaje p2) {
        System.out.println("                            ");

        System.out.println("                                          ");

        System.out.println("         JUGADOR 1:  " + p1.getNombre() + " ---  SALUD " + p1.getSalud() + " ---  STAMINA "
                + p1.getStamina());
        System.out.println("         JUGADOR 2:  " + p2.getNombre() + " ---  SALUD " + p2.getSalud() + " ---  STAMINA "
                + p2.getStamina());

        System.out.println("                            ");
    }

    void inicializar() {
        // Arma

        Sting sting = new Sting("Espada Sting", 20, 12, 0);

        Anduril anduril = new Anduril("Espada Anduril", 16, 16, 0);

        HachaDoble hacha = new HachaDoble("Hacha doble", 18, 18);

        ArcoYFlecha arco = new ArcoYFlecha("Arco y flecha", 15, 20);

        Baculo baculo = new Baculo("Baculo", 18, 23, 0);

        armas.add(sting);
        armas.add(anduril);
        armas.add(hacha);
        armas.add(arco);
        armas.add(baculo);

        // Reliquia

        FrascoGaladriel frascoGaladriel = new FrascoGaladriel("Frasco Galadriel", 0.1, 0.05, 8);

        ChalecoMithril chalecoMithril = new ChalecoMithril("Chaleco Mithril", 0.1, 0.05);

        AnilloSauron anilloSauron = new AnilloSauron("Anillo Sauron", 0.1, 0.05, 8);

        AnilloElfo anilloElfo = new AnilloElfo("Anillo Elfo", 0.1, 0.05, 8);

        AnilloNarya anilloNarya = new AnilloNarya("Anillo Nerya", 0.1, 0.05, 8);

        AnilloNenya anilloNenya = new AnilloNenya("Anillo Nenya", 0.1, 0.05, 8);

        AnilloVilya anilloVilya = new AnilloVilya("Anillo Vilya", 0.1, 0.05, 8);

        // Personaje

        Humano humano1 = new Humano("Aragorn", 100, 100, chalecoMithril);

        Humano humano2 = new Humano("Boromir", 100, 100, anilloNenya);

        Wizard wizard = new Wizard("Gandalf", 100, 100, frascoGaladriel, 100);

        Hobbit hobbit = new Hobbit("Frodo", 100, 100, anilloSauron);

        Elfo elfo = new Elfo("Legolas <3 ", 100, 100, anilloElfo, 100);

        Orco orco = new Orco("Orco", 100, 100);

        Goblin goblin = new Goblin("Goblin", 100, 100);

        Enano enano = new Enano("Gimli", 100, 100);

        Troll troll = new Troll("Troll", 100, 100);

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