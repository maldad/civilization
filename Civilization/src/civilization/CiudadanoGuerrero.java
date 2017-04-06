package civilization;
/*
 * @author Zidai
 */
public class CiudadanoGuerrero extends Ciudadano{
    private int stamina=10;
    public CiudadanoGuerrero(String name, int hp, int atk, int def) {
        super(name, hp, atk, def);
        oficio= new OfiGuerrero();
    }
    public void mostrar(){
        System.out.println("Vigilando Perimetro... ");
    }
    public int getStamina(){
        return stamina;
    }
    
}
