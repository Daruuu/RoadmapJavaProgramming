package topic3_objectorientedprogramming.exercicisdeclases01.exer06;

import java.text.SimpleDateFormat;

/*
6. Crea i testeja una classe que modelitzi un cronòmetre que ens permeti consultar el temps que ha passat des de que es posa en marxa, pausar-lo i posar-lo a zero.
Pensa i defineix els atributs i mètodes que creguis convenients.
Pots usar la classe Date https://docs.oracle.com/javase/8/docs/api/java/util/Date.html que guarda un instant de temps com un long que representa el número de milisegons que han passat des del 01/01/1970 (https://es.wikipedia.org/wiki/Tiempo_Unix).
 */
public class Cronometro {
    private long start;
    private long end;
    private boolean enCurso;

    public long startCronometro() {
        return start = System.currentTimeMillis();
    }

    //
    public long stopCronometro(){

        return 0;
    }
    public long endCronometro() {
        return end = System.currentTimeMillis();
    }

    public void restartCronometro() {
        if (this.start != 0 && this.end != 0) {
            this.start = 0;
            this.end = 0;
        }
    }

    public long getTiempoTranscurrido() {
        return end - start;
    }

    public void mostrarTiempoTranscurrido() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(getTiempoTranscurrido()));
    }

    public Cronometro() {
    }

    public Cronometro(long start, long end, boolean enCurso) {
        this.start = start;
        this.end = end;
        this.enCurso = enCurso;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public boolean isEnCurso() {
        return enCurso;
    }

    public void setEnCurso(boolean enCurso) {
        this.enCurso = enCurso;
    }

    @Override
    public String toString() {
        return "Cronometre{" +
                "start=" + start +
                ", end=" + end +
                ", enCurso=" + enCurso +
                '}';
    }
}
