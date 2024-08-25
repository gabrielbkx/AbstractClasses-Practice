package entities;

public class PessoaJuridica extends Pessoa{

    private Integer numberOfEmployees;

    public PessoaJuridica() {
        super();
  }
    public PessoaJuridica(String name, Double anualCome, Integer numberOfEmployees) {
        super(name, anualCome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax(){
        double tax = 0.16;
        if (getNumberOfEmployees() > 10) {
            tax = 0.14;
        }
        return getNumberOfEmployees() * tax;
    }
}
