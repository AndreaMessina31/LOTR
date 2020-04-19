package app;

import java.util.Scanner;

import app.personaje.Humano;
import app.personaje.Wizard;

public class App {

  public static Scanner Teclado = new Scanner(System.in);
  public static JuegoLOTR ComienzoJuego;

  public static <elegirOpcionPersonaje> void main(String[] args) throws Exception {

    System.out.println("**BIENVENIDO AL JUEGO LOTR**");

    System.out.println("**************************");
    System.out.println("Jugador 1, elija un personaje");
   // elegirOpcionPersonaje
    System.out.println("Jugador 1, elija un arma");
    // .elegirOpcionArma
    System.out.println("Jugador 2, elija un personaje");
    // .elegirOpcionPersonaje
    System.out.println("Jugador 2, elija un arma");
    // .elegirOpcionArma
    System.out.println("Que comience el juego!");

    // String arma = Teclado.nextLine();
    // personaje.seleccionarArma(String arma, List<Arma> armas1);


    int opcion = 0;

    ComienzoJuego = inicializar();
    
    do
  
    {
  
              opcion = elegirOpcionPersonaje();
  
              switch (opcion) {
                  case 1:
                      Object humano1;
                      break;
                  case 2:
                      Object humano2;
                      break;
                  case 3:
                      Object wizard;
                      break;
                  case 4:
                     Object hobbit;
                      break;
                  case 5:
                     Object elfo;
                      break;
                  case 6:
                      Object orco;
                      break;
                  case 7:
                      Object goblin;
                      break;
                  case 8:
                      Object enano;
                      break;
                  case 9:
                     Object troll;
                      break;
                  case 0:
                      System.out.println("Saliendo...");
                      break;
  
                  default:
                      break;
              }
          }while(opcion!=0);
    }
  
    private static JuegoLOTR inicializar() {
    return null;
  }

  public static int elegirOpcionPersonaje() {
  
          System.out.println("*********************");
          System.out.println("1. Aragorn");
          System.out.println("2. Boromir");
          System.out.println("3. Gandalf");
          System.out.println("4. Frodo");
          System.out.println("5. Legolas");
          System.out.println("6. Orco");
          System.out.println("7. Goblin");
          System.out.println("8. Gimli");
          System.out.println("9. Troll");
          System.out.println("0. Salir");
          System.out.println("*********************");
  
          int opcion;
  
          opcion = Teclado.nextInt();
          Teclado.nextLine();
  
          return opcion;
  
      }


    }
