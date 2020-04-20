package app;

import java.util.ArrayList;
import java.util.List;

import app.arma.*;
import app.reliquia.*;
import app.personaje.*; 

public class JuegoLOTR {
    
    public List<Arma> armas = new ArrayList<Arma>();
    public List<Personaje> personajes = new ArrayList<Personaje>();

       
    public void inicializar() {

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
 
         Wizard wizard = new Wizard ("Gandalf", 100 , 80, armas, anilloElfo, 0);
 
         Hobbit hobbit = new Hobbit ("Frodo", 100, 100, armas, anilloElfo);
 
         Elfo elfo = new Elfo ("Legolas <3 ", 100, 100, armas, anilloElfo, 0);
 
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

    }

    public Arma getArma(int nro) {
        
        // Recorrer cada Arma
        // Si el nro de Arma del ciclo es igual a "nro"
        // Devolver esa Arma

        for ( int i = 0; i < armas.size(); i++) 
        {
            int numero = i+1;
            if (numero == nro) {
                System.out.println(armas.get(0));
                return armas.get(0);
            }

        }

        return null;
       
    }


}
