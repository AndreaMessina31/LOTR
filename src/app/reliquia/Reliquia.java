package app.reliquia;

public class Reliquia {
    private String  nombre; // Nombre de la reliquia.
    private double  factorDeAtaque; // Numero que representa una forma de incremento de daño. De 0 a 1.
    private double factorDeDefensa; //Numero que representa una forma de decremento de daño recibido. 0 a 1

    public Reliquia(String nombre, double factorDeAtaque, double factorDeDefensa) {
        this.nombre = nombre;
        this.factorDeAtaque = factorDeAtaque;
        this.factorDeDefensa = factorDeDefensa;
    }
}