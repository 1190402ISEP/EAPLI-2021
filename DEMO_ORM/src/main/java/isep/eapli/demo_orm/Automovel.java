package isep.eapli.demo_orm;

public class Automovel {
    private int kms;

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "matricula='" + matricula + '\'' +
                '}';
    }

}
