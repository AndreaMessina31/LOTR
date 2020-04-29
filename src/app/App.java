package app;

import app.arma.*;
import app.personaje.*;

public class App {
    public static JuegoLOTR JuegoLotr;
    public static final String yellow = "\033[33m";

    // TODO preguntas para el profe

    public static void main(String[] args) throws Exception {
        System.out.println("                                ");
        System.out.println("                                ");
        System.out.println("BIENVENIDO!");
        System.out.println("                                ");
        System.out.println(yellow + "         ___ . .  _                                                                                             \n" +
                "\"T$$$P\"   |  |_| |_                                                                                             \n" +
                " :$$$     |  | | |_                                                                                             \n" +
                " :$$$                                                      \"T$$$$$$$b.                                          \n" +
                " :$$$     .g$$$$$p.   T$$$$b.    T$$$$$bp.                   BUG    \"Tb      T$b      T$P   .g$P^^T$$  ,gP^^T$$ \n" +
                "  $$$    d^\"     \"^b   $$  \"Tb    $$    \"Tb    .s^s. :sssp   $$$     :$; T$$P $^b.     $   dP\"     `T :$P    `T\n" +
                "  :$$   dP         Tb  $$   :$;   $$      Tb  d'   `b $      $$$     :$;  $$  $ `Tp    $  d$           Tbp.   \n" +
                "  :$$  :$;         :$; $$   :$;   $$      :$; T.   .P $^^    $$$    .dP   $$  $   ^b.  $ :$;            \"T$$p.  \n" +
                "  $$$  :$;         :$; $$...dP    $$      :$;  `^s^' .$.     $$$...dP\"    $$  $    `Tp $ :$;     \"T$$      \"T$b \n" +
                "  $$$   Tb.       ,dP  $$\"\"\"Tb    $$      dP \"\"$\"\"$\" \"$\"$^^  $$$\"\"T$b     $$  $      ^b$  T$       T$ ;      $$;\n" +
                "  $$$    Tp._   _,gP   $$   `Tb.  $$    ,dP    $  $...$ $..  $$$   T$b    :$  $       `$   Tb.     :$ T.    ,dP \n" +
                "  $$$;    \"^$$$$$^\"   d$$     `T.d$$$$$P^\"     $  $\"\"\"$ $\"\", $$$    T$b  d$$bd$b      d$b   \"^TbsssP\" 'T$bgd$P  \n" +
                "  $$$b.____.dP                                 $ .$. .$.$ss,d$$$b.   T$b.                                       \n" +
                ".d$$$$$$$$$$P  bug                                                    `T$b. ");
        System.out.println("                                ");
        System.out.println("                                ");
        System.out.println("                                ");


        JuegoLotr = inicializar();

        Personaje p1 = null;
        Personaje p2 = null;

        Arma a1 = null;
        Arma a2 = null;

        for(int i = 1; i <= 2; i++){
            System.out.println("                                ");
            System.out.println("                                ");
            System.out.println("Eleja jugador " + i);
            System.out.println("                                ");
            System.out.println("                                ");
            if(i == 1){
                p1 = JuegoLOTR.elegirOpcionPersonaje();
              // a1 = JuegoLOTR.elegirOpcionArma();
                //p1.agregarArma(a1);
            }else{
                p2 = JuegoLOTR.elegirOpcionPersonaje();
               // a2 = JuegoLOTR.elegirOpcionArma();
                //p2.agregarArma(a2);
            }
        }

        System.out.println("                                ");
        System.out.println("Jugador 1: " + p1.toString());
        System.out.println("Jugador 2: " + p2.toString());
        System.out.println("                                ");
      
       JuegoLOTR.iniciarBatalla(p1, p2, a1, a2);

       }

    public static JuegoLOTR inicializar() {

        //juego LOTR

        JuegoLOTR juego = new JuegoLOTR();
        juego.inicializar();

        return juego;
    }

   // public static void preguntar(){
     //   ataqueEpico= System.out
   // }

   

}
