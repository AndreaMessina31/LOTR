package app.personaje;

import app.arma.Arma;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private String nombre;
    private int salud; // max 100
    private int stamina;// resistencia
    private List<Arma> armas = new ArrayList<Arma>(); // las armas disponibles que tiene que usar

    public Personaje(String nombre, int salud, int stamina, List<Arma> armas) {
        this.nombre = nombre;
        this.salud = salud;
        this.stamina = stamina;
        this.armas = armas;
    }

    public void seleccionarArma(String arma, List<Arma> armas1){

       /*for(int i=0; i < armas.size(); i++){
            armas[i]
       }*/

       /* switch() {
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                // code block
                break;
            default:
        }*/

        /*for (Arma a: armas1) {
            if(a.getNombre().equals(arma)){
                armas.add(a);
            }
        }*/
    }

    public void atacar(){

    }

    // Devuelve true si el personaje esta vivo
    public boolean estaVivo() {
        return false;
    }

    // Ataca a personaje "personaje", usando el arma "arma"
    public void atacar(Personaje personaje, Arma arma) {
    }

}
