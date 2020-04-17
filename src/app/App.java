package app;

import app.arma.ArcoYFlecha;
import app.arma.Baculo;
import app.arma.Espada;
import app.arma.HachaDoble;
import app.reliquia.*;

public class App {
    public static void main(String[] args) throws Exception {

        Espada espada = new Espada("Espada", 10 , 10 );
        
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

    }
}