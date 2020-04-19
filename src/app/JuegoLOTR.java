package app;


import app.arma.*;
import app.reliquia.*;
import app.personaje.*; 
public class JuegoLOTR {
    public static void main(String[] args) throws Exception {

        //Arma

        Espada espada = new Espada("Espada", 10 , 10 );

        Sting sting = new Sting ("Sting", 10 , 10 );

        Anduril anduril = new Anduril ("Anduril", 10, 10);
        
        HachaDoble hacha  = new HachaDoble("Hacha doble", 8 , 8 );

        ArcoYFlecha arco = new ArcoYFlecha( "Arco y flecha", 7 ,7 );
    
        Baculo baculo = new Baculo ("Baculo", 6 , 7);

        //Reliquia

        FrascoGaladriel frascoGaladriel = new FrascoGaladriel("Gabriel", 10, 12, 0);

        ChalecoMithril chalecoMithril = new ChalecoMithril("LOL", 20, 23);

        AnilloPoder anilloPoder = new AnilloPoder("Power", 28, 24, 7);

        AnilloSauron anilloSauron = new AnilloSauron("Sauron", 30, 42, 8);

        AnilloElfo anilloElfo = new AnilloElfo("Elfo", 20, 20,5);

        AnilloNarya anilloNarya = new AnilloNarya("Nerya", 22, 24, 4);

        AnilloNenya anilloNenya = new AnilloNenya("Nenya", 22, 21, 6);

        AnilloVilya anilloVilya = new AnilloVilya("Vilya", 20, 20, 9);

        //Personaje 

        Humano humano = new Humano("Humano", 100 , 90);

        Wizard wizard = new Wizard ("Wizard", 100 , 80);

        Criatura criatura = new Criatura ("Criatura", 100, 100);

        Hobbit hobbit = new Hobbit ("Hobbit", 100, 100);
        
        Elfo elfo = new Elfo ("Elfo", 100, 100);

        Orco orco = new Orco ("Orco", 100, 100);
   
        Goblin goblin = new Goblin ("Goblin", 100, 100);

        Enano enano = new Enano ("Enano", 100, 100);
        
        Troll troll = new Troll ("Troll", 100, 120);
    }
}

