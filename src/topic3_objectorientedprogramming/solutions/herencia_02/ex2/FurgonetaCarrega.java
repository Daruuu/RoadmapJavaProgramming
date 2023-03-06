public class FurgonetaCarrega extends Vehicle {
    protected float PMA;
    protected final float adicioCarrega = 20;

    public float getPMA() {
        return PMA;
    }

    public float getAdicio() {
        return adicioCarrega;
    }

    public void setPMA(float PMA) {
        this.PMA = PMA;
    }

    public FurgonetaCarrega(String matricula, int dies, float PMA) {
        super(matricula, dies);
        this.PMA = PMA;
    }

    @Override
    public float getPreu() {
        return super.getPreu() + (PMA * adicioCarrega) ;
    }


    @Override
    public String toString() {
        return "FurgonetaCarrega:" + "\n" +
                "PMA = " + PMA + "\n" +
                "adicio = " + adicioCarrega;
    }
}
