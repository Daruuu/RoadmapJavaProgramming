package topic3_objectorientedprogramming.asociationoop02.exer05;

public class Empresa {
    private String CIF;
    private String nom;
    private String sectorEmpresarial;

    public Empresa(String CIF, String nom, String sectorEmpresarial) {
        this.CIF = CIF;
        this.nom = nom;
        this.sectorEmpresarial = sectorEmpresarial;
    }

    public Empresa() {
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSectorEmpresarial() {
        return sectorEmpresarial;
    }

    public void setSectorEmpresarial(String sectorEmpresarial) {
        this.sectorEmpresarial = sectorEmpresarial;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "CIF='" + CIF + '\'' +
                ", nom='" + nom + '\'' +
                ", sectorEmpresarial='" + sectorEmpresarial + '\'' +
                '}';
    }
}
