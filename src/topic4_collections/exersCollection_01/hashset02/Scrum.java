package topic4_collections.exersCollection_01.hashset02;

import java.util.HashSet;
import java.util.Iterator;

public class Scrum {
    private HashSet<Tarea> toBeDone;
    private HashSet<Tarea> doing;
    private HashSet<Tarea> done;

    public Scrum() {
    }

    public Scrum(HashSet<Tarea> toBeDone, HashSet<Tarea> doing, HashSet<Tarea> done) {
        this.toBeDone = toBeDone;
        this.doing = doing;
        this.done = done;
    }

    public HashSet<Tarea> getToBeDone() {
        return toBeDone;
    }

    public void setToBeDone(HashSet<Tarea> toBeDone) {
        this.toBeDone = toBeDone;
    }

    public HashSet<Tarea> getDoing() {
        return doing;
    }

    public void setDoing(HashSet<Tarea> doing) {
        this.doing = doing;
    }

    public HashSet<Tarea> getDone() {
        return done;
    }

    public void setDone(HashSet<Tarea> done) {
        this.done = done;
    }

    public void agregarTarea(Tarea tarea) {
        toBeDone.add(tarea);
    }

    public void toBeDoingADoing(String nombreTarea, String nuevoEstado){

    }
    public void estadoDoingADone(){

    }
    public void moverEstadoTarea(String nombreTarea) {
        Tarea tarea = new Tarea(nombreTarea);

    }

    public void mostrarTareas() {
        System.out.println("TO BE DONE");
        for (Tarea tarea : toBeDone) {
            System.out.println(tarea.getNombre() + "-" + tarea.getDescripcion());
        }
        Iterator<Tarea> iterator = doing.iterator();
        while (iterator.hasNext()) {
            Tarea tarea = iterator.next();
            System.out.println(tarea.getNombre() + "-" + tarea.getDescripcion());
            System.out.println();
        }
        for (Tarea tarea : done) {
            System.out.println(tarea.getNombre() + " - " + tarea.getDescripcion());
        }
    }

    @Override
    public String toString() {
        return "Scrum{" +
                "toBeDone=" + toBeDone +
                ", doing=" + doing +
                ", done=" + done +
                '}';
    }
}