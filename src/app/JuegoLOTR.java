package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import app.arma.*;
import app.reliquia.*;
import app.personaje.*;

public class JuegoLOTR {

    public static List<Arma> armas = new ArrayList<Arma>();
    public static List<Personaje> personajes = new ArrayList<Personaje>();
    //public List<Reliquia> reliquias = new ArrayList<Reliquia>();


     public static Arma buscarArma(int num){
         for (int i = 0; i < armas.size(); i++) {
             int posicionArma = i + 1;
             if (posicionArma == num) {
                 return armas.get(i);
             }
         }
         System.out.println("El numero que ingreso no es valido");
         return null;
     }

     public static Personaje buscarPersonaje(int personaje){

          for (int i = 0; i < personajes.size(); i++) {
              int p = i + 1;
              if (p == personaje) {
                    return personajes.get(i);
              }
          }
          System.out.println("El numero que ingreso no es valido");
          return null;
     }

     public void inicializar(){
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

         Humano humano1 = new Humano("Aragorn", 100 , 90, chalecoMithril);

         Humano humano2 = new Humano("Boromir", 100 , 90, anilloNenya);

         Wizard wizard = new Wizard ("Gandalf", 100 , 80, frascoGaladriel, 10);

         Hobbit hobbit = new Hobbit ("Frodo", 100, 100, anilloSauron);

         Elfo elfo = new Elfo ("Legolas <3 ", 100, 100, anilloElfo, 30);

         Orco orco= new Orco ("Orco", 100, 100);

         Goblin goblin = new Goblin ("Goblin", 100, 100);

         Enano enano = new Enano ("Gimli", 100, 100);

         Troll troll = new Troll ("Troll", 100, 120);

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
