package app;

public class App {
    public static void main(String[] args) throws Exception {

        Espada espada = new Espada("Espada", 10 , 10 ); 
        
        HachaDoble hacha  = new HachaDoble("Hacha doble", 8 , 8 ); 

        ArcoYFlecha arco = new ArcoYFlecha( "Arco y flecha", 7 ,7 );
    
        Baculo baculo = new Baculo ("Baculo", 6 , 7);
        
    }
}