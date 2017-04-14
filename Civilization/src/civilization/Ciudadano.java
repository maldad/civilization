package civilization;
/*
 * @author maldad
 */
public abstract class Ciudadano extends Civilizacion {
    protected Oficio oficio;
    protected String name;
    protected int hp;
    protected int atk;
    protected int def;
    public Ciudadano(String name,int hp, int atk, int def){
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }
    public String getName(){
        return name;
    }
    public int getHp(){
        return hp;
    }
    public int getAtk(){
        return atk;
    }
    public int getDef(){
        return def;
    }
   
    public void ejeOficio (Ciudadano objC){
        oficio.trabajar(objC);
    }
    public void setHp(int vidaPlus){}
    public void setAtk(int ataquePlus){}
    public void setDef(int defensaPlus){}
    public void setStamina(int staminaPlus){}
    public void setCapacidad(int capasidadPlus){}
    public void setRetraso(int porcentajeRetraso){}
    public void mostrar(){}
    public void print() {
        System.out.println("Nombre: " + getName());
        System.out.println("Vida: " + getHp());
        System.out.println("Ataque: " + getAtk());
        System.out.println("Defensa: " + getDef());
        System.out.println("======================================================================");
    }
    
}
