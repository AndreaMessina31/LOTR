package app.personaje;

import app.IEsMagico;
import app.IHaceMagia;
import app.ILlevaReliquia;
import app.arma.Arma;
import app.reliquia.Reliquia;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private String nombre;
    private int salud; // max 100
    private int stamina;// resistencia
    private List<Arma> armas = new ArrayList<Arma>(); // las armas disponibles que tiene que usar
    private List<Reliquia> reliquias = new ArrayList<Reliquia>();

    public Personaje(String nombre, int salud, int stamina) {
        this.nombre = nombre;
        this.salud = salud;
        this.stamina = stamina;
    }

    // Devuelve true si el personaje esta vivo
    public boolean estaVivo() {
        return salud > 0;
    }

    public boolean tieneStamina() {
        return stamina > 0;
    }
    // public void atacarConMagia(Personaje personajeAtacado, Arma arma) {
    // Ataca a personaje "personajeAtacado", usando el arma "arma"

    // if(this instanceof ILlevaReliquia){
    // ILlevaReliquia personajeQueLlevaReliquia = (ILlevaReliquia) this;
    // Reliquia r = personajeQueLlevaReliquia.getReliquia();
    // System.out.println(" FACTOR ATAQUE ");
    // r.atacarConReliquia(arma);
    // }

    // if (personajeAtacado instanceof ILlevaReliquia) {
    // ILlevaReliquia atacado = (ILlevaReliquia) personajeAtacado;
    // Reliquia r = atacado.getReliquia();
    // System.out.println(" FACTOR DEFENSA ");
    // r.defensaReliquia(personajeAtacado);
    // }

    // atacarConMagia(personajeAtacado, arma);

    // }

    public void atacar(Personaje personajeAtacado, Arma arma ) {

       //   if (this instanceof ILlevaReliquia){
         //  Reliquia reliquiaP = ((ILlevaReliquia) personajeAtacado).getReliquia();
            //reliquiaP.ataqueConReliquia();
           // personajeAtacado.setSalud(personajeAtacado.getSalud() - (int)( arma.getDanio() + arma.getDanio()* reliquiaP.getFactorDeAtaque()));
            //this.setSalud(this.getSalud()+ (int)(this.getSalud() * reliquiaP.getFactorDeDefensa()));
            //this.setStamina(this.getStamina() - arma.getStamina());
               // La stamina del arma decrementa la stamina del personaje.
          //ILlevaReliquia personajeConReliquia = (ILlevaReliquia) this;
          // personajeConReliquia.ataqueReliquia(personajeAtacado,arma, reliquia);
        //System.out.println("oh el personaje lleva reliquia" );
        //  }
        if (this instanceof ILlevaReliquia){
            Reliquia reliquiaP = ((ILlevaReliquia) personajeAtacado).getReliquia();
             //reliquiaP.ataqueConReliquia();
             arma.setDanio(arma.getDanio()+(int)(arma.getDanio()*reliquiaP.getFactorDeAtaque() ));
           //  personajeAtacado.setSalud(personajeAtacado.getSalud() - (int)(  arma.getDanio()* reliquiaP.getFactorDeAtaque()));
             this.setSalud(this.getSalud()+ (int)(this.getSalud() * reliquiaP.getFactorDeDefensa()));
            // personajeAtacado.setSalud(personajeAtacado.getSalud() - (int)( arma.getDanio() + arma.getDanio()* reliquiaP.getFactorDeAtaque()));
            // this.setSalud(this.getSalud()+ (int)(this.getSalud() * reliquiaP.getFactorDeDefensa()));
             //this.setStamina(this.getStamina() - arma.getStamina());
                // La stamina del arma decrementa la stamina del personaje.
           //ILlevaReliquia personajeConReliquia = (ILlevaReliquia) this;
           // personajeConReliquia.ataqueReliquia(personajeAtacado,arma, reliquia);
         System.out.println("oh el personaje lleva reliquia" );
           }

        if (this instanceof IHaceMagia) {
            IHaceMagia personajeQueHaceMagia = (IHaceMagia) this;
            personajeQueHaceMagia.ataqueEpico(personajeAtacado, arma);
           //  if(personajeQueHaceMagia.puedoEjecutarAtaqueEpico()){
             //personajeQueHaceMagia.ataqueEpico(personajeAtacado, arma);
             //}else {
            // Se le resta danio al personaje atacado y se le descuenta en "salud"
             //personajeAtacado.setSalud(personajeAtacado.getSalud() - arma.getDanio());
            // La stamina del arma decrementa la stamina del personaje.
             //this.setStamina(this.getStamina() - arma.getStamina());
            // se le resta magia por cada ataque utilizado
           //  personajeQueHaceMagia.setEnergiaMagica(personajeQueHaceMagia.getEnergiaMagica()
            // - 10);
        
              }  else{
              // Se le resta danio al personaje atacado y se le descuenta en "salud"
        personajeAtacado.setSalud(personajeAtacado.getSalud() - arma.getDanio());
        // La stamina del arma decrementa la stamina del personaje.
        this.setStamina(this.getStamina() - arma.getStamina());
               }
        }
    


    

     
    



  //  public void ataqueConReliquia(Personaje personajeAtacado, Arma arma , Reliquia reliquia) {
        // Se le resta danio al personaje atacado y se le descuenta en "salud"
      //     personajeAtacado.setSalud(personajeAtacado.getSalud() - (int)(arma.getDanio()*reliquia.getFactorDeAtaque()));
      //   this.setSalud(getSalud()*(int)reliquia.getFactorDeDefensa());
            // La stamina del arma decrementa la stamina del personaje.
       // this.setStamina(this.getStamina() - arma.getStamina());
       // }
    
    


    public void agregarArma(Arma arma) {
        this.armas.add(arma);
    }

    public Reliquia agregarReliquia(Reliquia reliquia) {
        this.reliquias.add(reliquia);
        return reliquia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    private void setEnergiaMagica(int i) {
    }


    
    @Override
    public String toString() {
        return "Personaje{" + "nombre='" + nombre + '\'' + ", salud=" + salud + ", stamina=" + stamina + ", armas="
                + armas + "reliquia : "
                + reliquias +
                '}';
    }

    public double setSalud() {
        return 0;
    }
}
