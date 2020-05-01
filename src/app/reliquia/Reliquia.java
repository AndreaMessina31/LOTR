package app.reliquia;

public class Reliquia {
    public String  nombre;
    public int  factorDeAtaque;
    public int factorDeDefensa;

    public Reliquia(String nombre, int factorDeAtaque, int factorDeDefensa) {
        this.nombre = nombre; 
        this.factorDeAtaque  = factorDeAtaque;
		this.factorDeDefensa  = factorDeDefensa;
    }

    public int getFactorDeAtaque() {
        return factorDeAtaque;
    }

    public int getFactorDeDefensa() {
        return factorDeDefensa;
    }

    public String getNombre() {
        return nombre;
    }
}




