package app.reliquia;

import app.IHaceMagia;
import app.ILlevaReliquia;
import app.arma.Arma;
import app.personaje.Personaje;

public class Reliquia implements ILlevaReliquia {
    public static int getEnergiaMagica;
	public String  nombre; // Nombre de la reliquia.
    public double  factorDeAtaque ; // Numero que representa una forma de incremento de daño. De 0 a 1.
    public double factorDeDefensa ; //Numero que representa una forma de decremento de daño recibido. 0 a 1

    public Reliquia(String nombre, double factorDeAtaque, double factorDeDefensa) {
        this.nombre = nombre; 
        
        
    }
    
    @Override
    public void setReliquia(Reliquia reliquia) {
    }

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


    @Override
    public String toString(){ 
     return super.toString()+ "nombre{" + nombre +
   "factor de ataque =" + factorDeAtaque+
    ", factor defensa =" + factorDeDefensa+
    '}';

    }

    @Override
    public Reliquia getReliquia() {
        return null;
    }






	}

    


	





