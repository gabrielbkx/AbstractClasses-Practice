package entities;

public class PessoaFisica extends Pessoa {
    private Double healthexpenditures;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String name, Double anualCome, Double healthexpenditures) {
        super(name, anualCome);
        this.healthexpenditures = healthexpenditures;
    }

    public Double getHealthexpenditures() {
        return healthexpenditures;
    }

    public void setHealthexpenditures(Double healthexpenditures) {
        this.healthexpenditures = healthexpenditures;
    }

    @Override
    public final double tax() {
        double tax = 0;
        if ( getAnualIncome() < 20000.00){
             tax = 0.15;
        }else if (getAnualIncome() >= 20000.00){
             tax = 0.25;
        }
        if (getHealthexpenditures() != null){
            return (getAnualIncome() * tax) - (getHealthexpenditures() * 0.50);
        }else {
            return getAnualIncome() * tax;
        }
    }
}
