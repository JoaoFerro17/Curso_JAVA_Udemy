package abstrato;

public class IndividualPayer extends TaxPayer{
   private Double healthExpenditures;

    public IndividualPayer(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }
    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    double taxesPaid() {
        double taxes;
        if (getAnualIncome() < 20000){
            taxes = (getAnualIncome() * 15/100) - (healthExpenditures * 50/100);
        }else {
            taxes = (getAnualIncome() * 25/100) - (healthExpenditures * 50/100);
        }
        return taxes;
    }
}
