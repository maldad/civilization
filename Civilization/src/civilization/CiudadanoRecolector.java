package civilization;
/*
 * @author Zidai
 */
public class CiudadanoRecolector extends Ciudadano{
    private int capacidad= 5;
    private int retraso=1000;
    public CiudadanoRecolector(String name, int hp, int atk, int def) {
        super(name, hp, atk, def);
        oficio= new OfiRecolector();
    }
    public void mostrar(){
        System.out.println(this.name+" comienza la recoleccion de recursos... ");
    }
    public int getCapacidad(){
        return capacidad;
    }
    public void setCapacidad(int s){
        capacidad += s;
    }
    public int getRetraso(){
        return retraso;
    }
    public void setRetraso(int s){
        retraso = (int) retraso - (retraso/100)*s;
    }
    public void setOficio(Oficio o){
      oficio = o;
    }    
    //@Override
    public Oficio getOficio(){
        return oficio;
    }
}
