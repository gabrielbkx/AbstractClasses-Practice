package entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    public Company() {
        super();
  }
    public Company(String name, Double anualCome, Integer numberOfEmployees) {
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
