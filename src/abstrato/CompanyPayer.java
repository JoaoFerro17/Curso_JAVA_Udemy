package abstrato;

public class CompanyPayer extends TaxPayer{
    private int numberOfEmployees;

    public CompanyPayer(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    @Override
    double taxesPaid() {
        double taxes;
        if (numberOfEmployees > 10){
            taxes = (getAnualIncome() * 14/100);
        }else {
            taxes = (getAnualIncome() * 16/100);
        }
        return taxes;
    }
}
