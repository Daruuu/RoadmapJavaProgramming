package topic3_oop_programming.asociationoop02.exer04;

import java.util.ArrayList;

public class Llamada {
    private double precioPorMinuto;
    private int totalMinutos;
    private ArrayList<Cliente> clienteArrayList;

    public Llamada(double precioPorMinuto, int totalMinutos, ArrayList<Cliente> clienteArrayList) {
        this.precioPorMinuto = precioPorMinuto;
        this.totalMinutos = totalMinutos;
        this.clienteArrayList = clienteArrayList;
    }

    public double getPrecioPorMinuto() {
        return precioPorMinuto;
    }

    public void setPrecioPorMinuto(double precioPorMinuto) {
        this.precioPorMinuto = precioPorMinuto;
    }

    public int getTotalMinutos() {
        return totalMinutos;
    }

    public void setTotalMinutos(int totalMinutos) {
        this.totalMinutos = totalMinutos;
    }

    public ArrayList<Cliente> getClienteArrayList() {
        return clienteArrayList;
    }

    public void setClienteArrayList(ArrayList<Cliente> clienteArrayList) {
        this.clienteArrayList = clienteArrayList;
    }

    @Override
    public String toString() {
        return "Llamada{" +
                "precioPorMinuto=" + precioPorMinuto +
                ", totalMinutos=" + totalMinutos +
                ", clienteArrayList=" + clienteArrayList +
                '}';
    }
}
