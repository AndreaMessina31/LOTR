package app;

import java.util.ArrayList;
import java.util.List;

import app.arma.*;
import app.reliquia.*;
import app.personaje.*; 

public class JuegoLOTR {

    public List<Arma> armas = new ArrayList<Arma>();
    public List<Personaje> personajes = new ArrayList<Personaje>();
    //public List<Reliquia> reliquias = new ArrayList<Reliquia>();


     public JuegoLOTR(List<Arma> armas, List<Personaje> personajes) {
          this.armas = armas;
          this.personajes = personajes;
     }

     public Arma buscarArma(String nombre){
          for (Arma a : this.armas) {
               if (a.getNombre().equals(nombre)) {
                    return a;
               }
          }
          return null;
     }

     public Personaje buscarPersonaje(String nombrePersonaje){

          for (Personaje p : this.personajes) {
               if (p.getNombre().equals(nombrePersonaje)) {
                    return p;
               }
          }
          return null;
     }



}
