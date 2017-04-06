package civilization;
/*
 * @author maldad
 */
public abstract class Ciudadano {
    protected Oficio oficio;
    protected int HP;
    protected int atk;
    protected int def;
    public Ciudadano(int x, int y, int z){
        HP = x;
        atk = y;
        def = z;
    }
    public void mostrar(){    }
    public void comparar(){    }
    public void ejeOficio (Ciudadano objC){
        oficio.trabajar(objC);
    }
    
}
