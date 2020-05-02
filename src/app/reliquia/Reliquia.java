package app.reliquia;

public class Reliquia {
    public String nombre;
    public double factorDeAtaque;
    public double factorDeDefensa;

    public Reliquia(String nombre, double factorDeAtaque, double factorDeDefensa) {
        this.nombre = nombre;
        this.factorDeAtaque = factorDeAtaque;
        this.factorDeDefensa = factorDeDefensa;
    }

    public double getFactorDeAtaque() {
        return factorDeAtaque;
    }

    public double getFactorDeDefensa() {
        return factorDeDefensa;
    }

    public String getNombre() {
        return nombre;
    }
}
