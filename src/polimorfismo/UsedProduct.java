package polimorfismo;
import java.util.Date;

public class UsedProduct extends Product{
    protected Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
    @Override
    public String priceTag() {
        return super.priceTag() + " (Manufacture date: " + manufactureDate;
    }
}
