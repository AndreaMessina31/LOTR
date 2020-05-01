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
    public static Arma buscarArma(int indiceA) {
        if (indiceA >= 1 && indiceA <= 5) {
            return armas.get(indiceA - 1);
        }

        System.out.println("El numero que ingreso no es valido");
        return null;
    }

    // recorre lista de personajes.
    public static Personaje buscarPersonaje(int indiceP) {
        if (indiceP >= 1 && indiceP <= 9) {
            return personajes.get(indiceP - 1);
        }

        System.out.println("El numero que ingreso no es valido");
        return null;
    }

    static void iniciarBatalla(Personaje p1, Personaje p2) {

         //El juego sigue hasta que uno de los jugadores se queda sin vida.
        do { 
            if (p1.tieneStamina() || p2.tieneStamina()) {

                if (p1.estaVivo() && p1.tieneStamina()) {
                    if (p1.tieneStamina()) {
                        System.out.println("                    ");
                        System.out.println("                            JUGADOR 1");
                        Arma a1 = elegirOpcionArma();
                        p1.agregarArma(a1);
                        p1.atacar(p2, a1);
                        System.out.println("                       ATACANDO JUGADOR 1");
                        resultadoJugadores(p1, p2);
                    } 
                    else {
                       System.out.println(p1.getNombre() + "   TE QUEDASTE SIN STAMINA ");
                    }

                } else {
                    System.out.println(p1.getNombre() + "              GAME OVER ");
                }

                if (p2.estaVivo()&& p2.tieneStamina()) {
                    if (p2.tieneStamina()) {
                        System.out.println("                    ");
                        System.out.println("                            JUGADOR 2");
                        Arma a2 = elegirOpcionArma();
                        p2.agregarArma(a2);
                        p2.atacar(p1, a2);

                        System.out.println("                       ATACANDO JUGADOR 2");
                        resultadoJugadores(p1, p2);   
                    } 
                   else {
                        System.out.println(p2.getNombre() + "   TE QUEDASTE SIN STAMINA ");

                    }
                } else {
                    System.out.println(p2.getNombre() + "              GAME OVER ");

                }

                 } else {
                System.out.println(p1.getNombre() + p2.getNombre() + " ambos se quedaron sin Stamina");

                System.out.println("Empate");
                System.out.println("Empate");
                System.out.println("Empate");
                break;

            }
        

        }while(p1.estaVivo()&&p2.estaVivo());

    // Resultado de la Batalla
    System.out.println("Batalla finalizada salud de los jugadores "+"  "+p1.getNombre()+"  "+p1.getSalud()+"  "+p2.getNombre()+"  "+p2.getSalud());System.out.println("Batalla finalizada  stamina de los jugadores "+"  "+p1.getNombre()+"  "+p1.getStamina()+"  "+p2.getNombre()+"  "+p2.getStamina());

    if(p1.estaVivo())

    {
        System.out.println("El ganador es " + p1.getNombre());
    }if(p2.estaVivo())
    {
        System.out.println("El ganador es " + p2.getNombre());
    }

    if(!p1.estaVivo()&&!p2.estaVivo())
    {
        System.out.println("empate");
        System.out.println("empate");
        System.out.println("empate");
    }

    }

    static Arma elegirOpcionArma() {
        int arma;
        Arma arm;
        do {
            System.out.println("Ingrese el nombre del arma");
            System.out.println("*********************");
            System.out.println("1. Espada Sting");
            System.out.println("2. Espada Anduril");
            System.out.println("3. Hacha doble");
            System.out.println("4. Arco y flecha");
            System.out.println("5. Baculo");
            System.out.println("*********************");

            arma = Teclado.nextInt();

            arm = buscarArma(arma);

        } while (arm == null);

        return arm;
    }

    static Personaje elegirOpcionPersonaje() {
        int personaje;
        Personaje p;
        do {
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

            personaje = Teclado.nextInt();

            p = buscarPersonaje(personaje);

        } while (p == null);

        return p;
    }

    public static void resultadoJugadores(Personaje p1, Personaje p2) {
        System.out.println("                                          ");
        System.out.println("                                ");
        System.out.println("           JUGADOR 1 " + "                               JUGADOR 2 ");
        System.out.println("        NOMBRE " + p1.getNombre() + "                           NOMBRE " + p2.getNombre());
        System.out
                .println("         SALUD " + p1.getSalud() + "                                SALUD " + p2.getSalud());
        System.out.println(
                "       STAMINA " + p1.getStamina() + "                              STAMINA " + p2.getStamina());
        if (p1 instanceof IHaceMagia && p2 instanceof IHaceMagia) {
            System.out.println("ENERGIA MAGICA " + ((IHaceMagia) p1).getEnergiaMagica()
                    + "                       ENERGIA MAGICA " + ((IHaceMagia) p2).getEnergiaMagica());
        } else if (p2 instanceof IHaceMagia) {
            System.out.println("                                                ENERGIA MAGICA "
                    + ((IHaceMagia) p2).getEnergiaMagica());
        } else if (p1 instanceof IHaceMagia) {
            System.out.println("ENERGIA MAGICA " + ((IHaceMagia) p1).getEnergiaMagica());
        }

        if (p1 instanceof ILlevaReliquia && p2 instanceof ILlevaReliquia) {
            System.out.println("      RELIQUIA " + ((ILlevaReliquia) p1).getReliquia().getNombre()
                    + "                RELIQUIA " + ((ILlevaReliquia) p2).getReliquia().getNombre());
        } else if (p1 instanceof ILlevaReliquia) {
            System.out.println("      RELIQUIA " + ((ILlevaReliquia) p1).getReliquia().getNombre());
        } else if (p2 instanceof ILlevaReliquia) {
            System.out.println("                                               RELIQUIA "
                    + ((ILlevaReliquia) p2).getReliquia().getNombre());
        }
        System.out.println("                                          ");

        System.out.println("ARMAS 1");

        for (Arma a : p1.getArmas()) {
            System.out.println(a);
        }

        System.out.println("ARMAS 2");

        for (Arma a : p2.getArmas()) {
            System.out.println(a);
        }

        System.out.println("                                          ");
    }

    void inicializar() {
        // Arma

        Sting sting = new Sting("Espada Sting", 10, 22, 0);

        Anduril anduril = new Anduril("Espada Anduril", 14, 15, 0);

        HachaDoble hacha = new HachaDoble("Hacha doble", 10, 22);

        ArcoYFlecha arco = new ArcoYFlecha("Arco y flecha", 5, 20);

        Baculo baculo = new Baculo("Baculo", 18, 24, 0);

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