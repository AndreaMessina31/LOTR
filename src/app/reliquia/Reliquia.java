package app.reliquia;

import app.ILlevaReliquia;
import app.arma.Arma;
import app.personaje.Personaje;

public class Reliquia implements ILlevaReliquia {
    public String  nombre; // Nombre de la reliquia.
    public double  factorDeAtaque ; // Numero que representa una forma de incremento de daño. De 0 a 1.
    public double factorDeDefensa ; //Numero que representa una forma de decremento de daño recibido. 0 a 1

    public Reliquia(String nombre, double factorDeAtaque, double factorDeDefensa) {
        this.nombre = nombre; 
        //this.factorDeAtaque  = 0.1; //aumenta danio de arma con factor de ataque
		//this.factorDeDefensa  = 0.2; // decrementa el daño recibido 
    }

   // public void atacarConReliquia(Arma arma){
        //aumenta danio de arma con factor de ataque
     //   arma.setDanio((int) (arma.getDanio() + arma.getDanio() * factorDeAtaque));
    //}

    //public void defensaReliquia(Personaje personaje){
        //la defensa ayuda a disminuir menos la salud
      //  personaje.setSalud((int) (personaje.getSalud() + factorDeDefensa));
   // }

    public String getNombre() {
        return nombre;
    }

    @Override
    public Reliquia getReliquia() {
       
        return getReliquia();
    }

    @Override
    public void setReliquia(Reliquia reliquia) {


    }

    //public void ataquereliquia(Personaje personajeAtacado, Arma arma) {
        // Se le resta danio al personaje atacado y se le descuenta en "salud"
      //  personajeAtacado.setSalud((int)personajeAtacado.getSalud() - (arma.getDanio()*getFactorDeAtaque()));
       // this.setSalud((int) getSalud()*factorDeDefensa);
        //// La stamina del arma decrementa la stamina del personaje.
        //this.setStamina(this.getStamina() - arma.getStamina());

    //}
    
  //  public void ataqueReliquia(Personaje personajeQueLlevaReliquia, Arma arma ) {
    //    this.setDanio((int) arma.getDanio() * this.getFactorDeAtaque());
      //  this.setSalud((int) getSalud()*factorDeDefensa);


    public double getFactorDeAtaque() {
        return factorDeAtaque = 0.1;
}

    public double getFactorDeDefensa() {
    return factorDeDefensa=0.05 ;
}

public void setFactorDeAtaque(double factorDeAtaque) {
    this.factorDeAtaque = factorDeAtaque;
}

    public void setFactorDeDefensa(double factorDeDefensa) {
        this.factorDeDefensa = factorDeDefensa;
    

}

	public void ataqueConReliquia() {
	}






}




