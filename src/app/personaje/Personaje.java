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
    

    public void atacar(Personaje personajeAtacado, Arma arma ) {

        if (this instanceof IHaceMagia) {
            IHaceMagia personajeQueHaceMagia = (IHaceMagia) this;
             personajeQueHaceMagia.ataqueEpico(personajeAtacado, arma);
            
        
              }  else{
                  
              // Se le resta danio al personaje atacado y se le descuenta en "salud"
        personajeAtacado.setSalud(personajeAtacado.getSalud() - arma.getDanio());
        // La stamina del arma decrementa la stamina del personaje.
        this.setStamina(this.getStamina() - arma.getStamina());
             }
       
             if (this instanceof ILlevaReliquia){
                Reliquia reliquiaP = ((ILlevaReliquia) this).getReliquia();
                System.out.println("oh el atacante lleva reliquia factor daño" );
                 //reliquiaP.ataqueConReliquia();
                personajeAtacado.setSalud(personajeAtacado.getSalud() - (int)(arma.getDanio()*reliquiaP.getFactorDeAtaque()));
             }
            
               if(personajeAtacado instanceof ILlevaReliquia){
                Reliquia reliquia2 = ((ILlevaReliquia) personajeAtacado).getReliquia();
                this.setSalud(this.getSalud()+ (int)(this.getSalud() * reliquia2.getFactorDeDefensa()));
                System.out.println("oh atacado lleva reliquia factor defensa" );

                if (this instanceof IHaceMagia) {
                    IHaceMagia personajeQueHaceMagia = (IHaceMagia) this;
                  //Reliquia objetoMagico = (IHaceMagia) objetoMagico.getEnergiaMagica();
                    //  IHaceMagia objetoMagico = (IHaceMagia) this.getEnergiaMagica();
                    System.out.println("La magia no es ilimitada energia magica"  );
                    personajeQueHaceMagia.setEnergiaMagica(personajeQueHaceMagia.getEnergiaMagica()- 10);
                }

               }
            }
        
    
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

    
  //  public void setEnergiaMagica(int energiaMagica) {
    //    this.energiaMagica= energiaMagica;
    //}
      //  public int getEnergiaMagica(){
        //    return energiaMagica ;
        //}
    


    
    @Override
    public String toString() {
    
		return "Personaje{" + "nombre='" + nombre + '\'' + ", salud=" + salud + ", stamina=" + stamina + ", armas="
                + armas +
                
                '}';
    }

}
