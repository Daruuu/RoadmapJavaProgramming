package topic4_collections.exersCollection_01.hashset02;

import java.util.HashSet;
import java.util.Iterator;

public class Scrum {
    private HashSet<Tarea> toBeDone;
    private HashSet<Tarea> doing;
    private HashSet<Tarea> done;

    public Scrum() {
        this.toBeDone = new HashSet<>();
        this.doing = new HashSet<>();
        this.done = new HashSet<>();
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

    public void toBeDoingADoing(String nombreTarea, String nuevoEstado) {
    }

    public void moverTarea(String nombreTarea, String nuevoEstado) {
        nuevoEstado = nuevoEstado.toUpperCase();
        Tarea tarea = buscarTarea(nombreTarea);
        if (tarea != null) {
            tarea.setEstado(nuevoEstado);
            switch (nuevoEstado) {
                case "DOING":
                    toBeDone.remove(tarea);
                    doing.add(tarea);
                    break;
                case "DONE":
                    doing.remove(tarea);
                    done.add(tarea);
                    break;
            }
        }else {
            System.out.println("nombre de tarea no existente!");
        }
    }

    public void moverEstadoTarea(String nombreTarea) {
        Tarea tarea = new Tarea(nombreTarea);
        for (Tarea t : toBeDone) {
            if (!t.getNombre().contains(nombreTarea)) {
                System.out.println("nombre de tarea no existente");
            } else {
                toBeDone.remove(tarea);
                System.out.println("tarea eliminada de toBeDone");
                tarea.setEstado("DOING");
                doing.add(tarea);
                System.out.println("tarea agregada a doing");
            }
        }
    }

    public void mostrarTareas() {
        System.out.println("TO BE DONE");
        for (Tarea tarea : toBeDone) {
            System.out.println(tarea.getNombre() + "-" + tarea.getDescripcion());
        }
        System.out.println("DOING");
        Iterator<Tarea> iterator = doing.iterator();
        while (iterator.hasNext()) {
            Tarea tarea = iterator.next();
            System.out.println(tarea.getNombre() + "-" + tarea.getDescripcion());
            System.out.println();
        }
        System.out.println("DONE");
        for (Tarea tarea : done) {
            System.out.println(tarea.getNombre() + " - " + tarea.getDescripcion());
        }
    }

    public Tarea buscarTarea(String nombreTarea) {
        for (Tarea tarea : toBeDone) {
            if (tarea.getNombre().equals(nombreTarea))
                return tarea;
        }
        for (Tarea tarea : doing) {
            if (tarea.getNombre().equals(nombreTarea))
                return tarea;
        }
        for (Tarea tarea : done) {
            if (tarea.getNombre().equals(nombreTarea))
                return tarea;
        }
        return null;
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