/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilization;

/**
 *
 * @author Zidai
 */
import java.util.ArrayList;
import java.util.Iterator;


public class CivEdificio extends Civilizacion {
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;
    int capacidad;
    

    public CivEdificio(String name, String description, int capacidad) {
        this.name = name;
        this.description = description;
        this.capacidad=capacidad;
    }

    public void add(Civilizacion civilizacion) {
        menuComponents.add(civilizacion);
        if(civilizacion instanceof Ciudadano){
            this.numElementos+=civilizacion.numElementos;
        }
    }

    public void remove(Civilizacion civilizacion) {
        menuComponents.remove(civilizacion);
    }

    public int getNumElementos(){
        return numElementos;
    }
    public Civilizacion getChild(int i) {
        return (Civilizacion)menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public int getCapasidad(){
        return capacidad;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println("\n" + getDescription());
        System.out.println("\n" + getCapasidad());
        System.out.println("Numero de elementos: "+numElementos);
        System.out.println("----------------");

        Iterator it = menuComponents.iterator();
        while(it.hasNext()) {
            Civilizacion civilizacion = (Civilizacion)it.next();
            civilizacion.print();
        }
    }
    //tarea imprimir el costo total de los items y usar el remove
}
