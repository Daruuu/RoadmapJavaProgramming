package topic3_oop_programming.asociationoop02.exer05;

import java.util.ArrayList;
import java.util.Date;

public class Contractes {
    private int codi;
    private Date inicioContrato;
    private Date finContrato;
    private ArrayList<Empresa> empresaList;

    public Contractes(int codi, Date inicioContrato, Date finContrato, ArrayList<Empresa> empresaList) {
        this.codi = codi;
        this.inicioContrato = inicioContrato;
        this.finContrato = finContrato;
        this.empresaList = empresaList;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public Date getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(Date inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public Date getFinContrato() {
        return finContrato;
    }

    public void setFinContrato(Date finContrato) {
        this.finContrato = finContrato;
    }

    public ArrayList<Empresa> getEmpresaList() {
        return empresaList;
    }

    public void setEmpresaList(ArrayList<Empresa> empresaList) {
        this.empresaList = empresaList;
    }

    public void empresasTrabajado(int numLista) {
        empresaList.get(numLista).getSectorEmpresarial();
    }

    public int cantidadEmpresaContratos() {
        return empresaList.size();
    }

    //anyo - mes - dia
    public void duracionContratoDias() {
        long duracionMiliseconds = finContrato.getTime() - inicioContrato.getTime();
        // horas * minutos * segundos * milisegundos
        long duracionDias = duracionMiliseconds / (24 * 60 * 60 * 1000);
        System.out.println("El contrato ha durado " + duracionDias + " dias");
    }

    @Override
    public String toString() {
        return "Contractes{" +
                "codi=" + codi +
                ", inicioContrato=" + inicioContrato +
                ", finContrato=" + finContrato +
                ", empresaList=" + empresaList +
                '}';
    }
}
