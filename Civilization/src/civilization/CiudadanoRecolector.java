package civilization;
/*
 * @author Zidai
 */
public class CiudadanoRecolector extends Ciudadano{
    private int capacidad= 5;
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

    //@Override
    //public void setCapacidad(int s){
      //  capacidad += s;
    //}
    
    public void setOficio(Oficio o){
      oficio = (OfiRecolector)o;
    }
    
    //@Override
    public OfiRecolector getOficio(){
        return (OfiRecolector)oficio;
    }
}
