package app;

import java.util.Scanner;

import app.personaje.*;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("                                ");
        System.out.println("                                ");
        String yellow = "\033[33m";
        System.out.println(yellow
                + "                           ___ . .  _                                                                                             \n"
                + "                  \"T$$$P\"   |  |_| |_                                                                                             \n"
                + "                   :$$$     |  | | |_                                                                                             \n"
                + "                   :$$$                                                      \"T$$$$$$$b.                                          \n"
                + "                   :$$$     .g$$$$$p.   T$$$$b.    T$$$$$bp.                   BUG    \"Tb      T$b      T$P   .g$P^^T$$  ,gP^^T$$ \n"
                + "                    $$$    d^\"     \"^b   $$  \"Tb    $$    \"Tb    .s^s. :sssp   $$$     :$; T$$P $^b.     $   dP\"     `T :$P    `T\n"
                + "                    :$$   dP         Tb  $$   :$;   $$      Tb  d'   `b $      $$$     :$;  $$  $ `Tp    $  d$           Tbp.   \n"
                + "                    :$$  :$;         :$; $$   :$;   $$      :$; T.   .P $^^    $$$    .dP   $$  $   ^b.  $ :$;            \"T$$p.  \n"
                + "                    $$$  :$;         :$; $$...dP    $$      :$;  `^s^' .$.     $$$...dP\"    $$  $    `Tp $ :$;     \"T$$      \"T$b \n"
                + "                    $$$   Tb.       ,dP  $$\"\"\"Tb    $$      dP \"\"$\"\"$\" \"$\"$^^  $$$\"\"T$b     $$  $      ^b$  T$       T$ ;      $$;\n"
                + "                    $$$    Tp._   _,gP   $$   `Tb.  $$    ,dP    $  $...$ $..  $$$   T$b    :$  $       `$   Tb.     :$ T.    ,dP \n"
                + "                    $$$;    \"^$$$$$^\"   d$$     `T.d$$$$$P^\"     $  $\"\"\"$ $\"\", $$$    T$b  d$$bd$b      d$b   \"^TbsssP\" 'T$bgd$P  \n"
                + "                    $$$b.____.dP                                 $ .$. .$.$ss,d$$$b.   T$b.                                       \n"
                + "                  .d$$$$$$$$$$P                                                         `T$b. ");
        System.out.println("                                ");
        System.out.println("                                ");
        System.out.println("                                ");


        int numero = 1;
        while (numero == 1) {
            inicializar();

            Personaje p1;
            Personaje p2;

            System.out.println("                          JUGADOR 1");
            p1 = JuegoLOTR.elegirOpcionPersonaje();
            System.out.println("                          JUGADOR 2");
            p2 = JuegoLOTR.elegirOpcionPersonaje();

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

            System.out.println("                                ");

            System.out.println("          __^__                                      __^__\n"
                    + "         ( ___ )------------------------------------( ___ )\n"
                    + "          | / |                                      | \\ |\n"
                    + "          | / |          COMENZANDO PELEA            | \\ |\n"
                    + "          |___|                                      |___|\n"
                    + "         (_____)------------------------------------(_____) \n");

            System.out.println("                                ");

            JuegoLOTR.iniciarBatalla(p1, p2);
            System.out.println("                                ");

            System.out.println("          __^__                                      __^__\n"
                    + "         ( ___ )------------------------------------( ___ )\n"
                    + "          | / |                                      | \\ |\n"
                    + "          | / |     PARA SEGUIR JUGANDO INGRESE 1    | \\ |\n"
                    + "          |___|                                      |___|\n"
                    + "         (_____)------------------------------------(_____) \n");

            System.out.println("                                ");
            System.out.println("         //// NO PODES USAR LOS PERSONAJES YA ELEGIDOS! ////");
            Scanner teclado = new Scanner(System.in);
            numero = teclado.nextInt();
        }

        //TODO - PERSONAJES

        System.out.println("                                           ___\n" +
                "                                         .';:;'.\n" +
                "                                        /_' _' /\\   __\n" +
                "                                        ;a/ e= J/-'\"  '.\n" +
                "  GOOD BYE MY PRECIOUS!                 \\ ~_   (  -'  ( ;_ ,.\n" +
                "                                         L~\"'_.    -.  \\ ./  )\n" +
                "                                         ,'-' '-._  _;  )'   (\n" +
                "                                       .' .'   _.'\")  \\  \\(  |\n" +
                "                                      /  (  .-'   __\\{`', \\  |\n" +
                "                                     / .'  /  _.-'   \"  ; /  |\n" +
                "                                    / /    '-._'-,     / / \\ (\n" +
                "                                 __/ (_    ,;' .-'    / /  /_'-._\n" +
                "                                `\"-'` ~`  ccc.'   __.','     \\j\\L\\\n" +
                "                                                 .='/|\\7      \n" +
                "                                                   ' `");
    }

    private static void inicializar() {
        // juego LOTR

        JuegoLOTR juego = new JuegoLOTR();
        juego.inicializar();
    }
    
}
