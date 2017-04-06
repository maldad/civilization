package civilization;
/*
 * @author Zidai
 */
public class CiudadanoGuerrero extends Ciudadano{
    private int Stamina=10;
    public CiudadanoGuerrero(int x, int y, int z) {
        super(x, y, z);
        oficio= new OfiGuerrero();
    }
    public void mostrar(){
        System.out.println("Vigilando Perimetro... ");
    }
    public int getStamina(){
        return Stamina;
    }
    
}
