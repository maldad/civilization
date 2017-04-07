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
//    public void setOficio(Oficio o){ //para mejorar el oficio actual mediante Decorador

  //  }
    public void mostrar(){    }
    public void ejeOficio (Ciudadano objC){
        oficio.trabajar(objC);
    }
    public void setStamina(int s){
        
    }
    //public void setCapacidad(int s){
        
    //}
    
    //public Oficio getOficio(){
      //return oficio;
    //}

    public void print() {
        System.out.println("Nombre: " + getName());
        System.out.println("Vida: " + getHp());
        System.out.println("Ataque: " + getAtk());
        System.out.println("Defensa: " + getDef());
        System.out.println("======================================================================");
    }
    
}
