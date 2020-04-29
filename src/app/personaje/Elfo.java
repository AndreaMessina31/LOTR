package app.personaje;
import app.arma.Arma;
import app.IHaceMagia;
import app.ILlevaReliquia;
import app.reliquia.Reliquia;

//IHaceMagia:El Wizard puede hacer magia por lo cual debe implementar
//esta interface. Sólo puede atacar epicamente si tiene menos de 10
//de stamina y al menos 20 de enrgia magica
public class Elfo extends Criatura implements IHaceMagia, ILlevaReliquia  {
    
    public int energiaMagica; // Posee la enregía mágica del Elfo (max 100)
    public Reliquia reliquia;// Reliquia que porta el Elfo

    public Elfo(String nombre, int salud, int stamina, Reliquia reliquia, int energiaMagica) {
        super(nombre, salud, stamina);
       // this.reliquia = reliquia;
        this.energiaMagica = energiaMagica;
        this.reliquia =agregarReliquia(reliquia);
    }


    @Override
    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    @Override
    public boolean puedoEjecutarAtaqueEpico() {
      // && this.getEnergiaMagica() >= 20
        return this.getStamina() < 50;
    }

    @Override
    public void ataqueEpico(Personaje personajeAtacado, Arma arma) {
      if (puedoEjecutarAtaqueEpico()){
      personajeAtacado.setSalud(personajeAtacado.getSalud() - (int)(arma.getDanio() + arma.getDanio() * 0.1));
     this.setStamina(0);
     this.setEnergiaMagica(0);
     System.out.println("ataque epicoooo");
     }// else {
      // Se le resta danio al personaje atacado y se le descuenta en "salud"
     // personajeAtacado.setSalud(personajeAtacado.getSalud() - arma.getDanio());
      //La stamina del arma  decrementa la stamina del personaje.
     // this.setStamina(this.getStamina() - arma.getStamina());
   // }
    }
	@Override
	public Reliquia getReliquia() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setReliquia(Reliquia reliquia) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int getEnergiaMagica() {
		// TODO Auto-generated method stub
		return 0;
	}

  

    //@Override
   // public Reliquia getReliquia() {
    //    return reliquia;
    //}

    //@Override
    //public void setReliquia(Reliquia reliquia) {
      //  this.reliquia = reliquia;
    //}

   // @Override
   // public int getEnergiaMagica() {
     //   return 0;
    //}

    //@Override
   // public void ataqueEpico(Personaje personaje, Arma arma) {   
    //}

     //@Override

   // public void atacar(Personaje personajeAtacado, Arma arma) {
       // super.atacar(personajeAtacado, arma);
     //   if (puedoEjecutarAtaqueEpico()){

  //  @Override
    //public void ataqueEpico(Personaje personaje, Arma arma) {
      //  personaje.setSalud(personaje.getSalud() - (int)(arma.getDanio() + arma.getDanio() * 0.1));
        //this.setStamina(0);
        //this.setEnergiaMagica(0);
        //System.out.println("ataque epicoooo");
    //}

  //  @Override
    //public String toString() {
      //  return super.toString() + "Elfo{" +
        ///        "energiaMagica=" + energiaMagica +
           //     '}';
    //}
}