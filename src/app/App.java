package app;


import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("BIENVENIDO A THE LOTR");

        //elegir personaje
        //System.out.println("Elija su personaje");
        //System.out.println("Gandallf = 1 ,,Troll,Orco,Hobbit,Goblin,Enano,Elfo");

        //elegir arma
        System.out.println("Elegir arma");
        System.out.println("Espada Aduril = 1 , Espada Sting = 2 , Hacha doble = 3 , Baculo = 4 , Arco y flecha 5 ");

        String arma = Teclado.nextLine();
        
      // personaje.seleccionarArma(String arma, List<Arma> armas1);



  

}
}
