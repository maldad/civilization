package civilization;
/*
 * @author Zidai
 */
import java.util.ArrayList;
import java.util.Iterator;
public class CivEdificio extends Civilizacion {
    ArrayList edificioComponents = new ArrayList();
    String name;
    String description;
    int capacidad;
    
    public CivEdificio(String name, String description, int capacidad) {
        this.name = name;
        this.description = description;
        this.capacidad=capacidad;
    }

    public void add(Civilizacion civilizacion) {
        edificioComponents.add(civilizacion);
    }

    public void remove(Civilizacion civilizacion) {
        edificioComponents.remove(civilizacion);
    }

    public int getNumElementos(){
        return edificioComponents.size();
    }
    public Ciudadano getChild(int i) {
        return (Ciudadano) edificioComponents.get(i);
    }
    
    //public CiudadanoRecolector getChild(int i) {
        //return (CiudadanoRecolector) edificioComponents.get(i);
    //}
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public int getCapacidad(){
        return capacidad-getNumElementos();
    }

    public void print() {
        System.out.println("\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println(getName());
        System.out.println("\n" + getDescription());
        System.out.println("Capacidad: " + getCapacidad()+"/"+capacidad);
        System.out.println("Numero de elementos: "+getNumElementos());
        System.out.println("----------------------------------------------------------------------");

        Iterator it = edificioComponents.iterator();
        while(it.hasNext()) {
            Civilizacion civilizacion = (Civilizacion)it.next();
            civilizacion.print();
        }
    }
    //tarea imprimir el costo total de los items y usar el remove
}
