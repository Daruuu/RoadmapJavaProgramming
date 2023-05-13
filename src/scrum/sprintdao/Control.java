package scrum.sprintdao;

abstract class Control {

    private String horaEntrada;
    private String horaSalida;
    private boolean disponibilidad;

    public Control() {
    }

    public Control(String horaEntrada, String horaSalida) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Control{" +
                "horaEntrada='" + horaEntrada + '\'' +
                ", horaSalida='" + horaSalida + '\'' +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}