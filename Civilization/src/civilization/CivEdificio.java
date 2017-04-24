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
        FrameCivilizacion.jTextArea1.append("\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n");
        FrameCivilizacion.jTextArea1.append(getName() + "\n");
        FrameCivilizacion.jTextArea1.append(getDescription() + "\n");
        FrameCivilizacion.jTextArea1.append("Capacidad: " + getCapacidad()+"/"+capacidad + "\n");
        FrameCivilizacion.jTextArea1.append("Numero de elementos: "+getNumElementos() + "\n");
        FrameCivilizacion.jTextArea1.append("----------------------------------------------------------------------\n");

        Iterator it = edificioComponents.iterator();
        while(it.hasNext()) {
            Civilizacion civilizacion = (Civilizacion)it.next();
            civilizacion.print();
        }
    }
    //tarea imprimir el costo total de los items y usar el remove
}
