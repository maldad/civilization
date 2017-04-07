package civilization;
/*
 * @author Zidai
 */
public class CiudadanoGuerrero extends Ciudadano{
    private int stamina=5;
    public CiudadanoGuerrero(String name, int hp, int atk, int def) {
        super(name, hp, atk, def);
        oficio= new OfiGuerrero();
    }
    public void mostrar(){
        System.out.println(this.name+" comienza la vigilancia del perimetro... ");
    }
    public int getStamina(){
        return stamina;
    }
    
    @Override
    public void setStamina(int s){
        stamina += s;
    }

    public void setOficio(Oficio o){
      oficio = o;
    }
    
    public Oficio getOficio(){
        return oficio;
    }
}
