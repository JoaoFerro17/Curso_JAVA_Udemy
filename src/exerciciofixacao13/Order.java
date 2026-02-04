package exerciciofixacao13;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> orderItems = new ArrayList<>();
    private Client client;

    public Order(){}

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public void addOrderItem(OrderItem orderItem){
        orderItems.add(orderItem);
    }
    public void removeOrderItem(OrderItem orderItem){
        orderItems.remove(orderItem);
    }

    public double total(){
        double sum = 0;
        for (OrderItem o : orderItems){
            sum+= o.subTotal();
        }
        return sum;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: ");
        sb.append("\nOrder moment: " + sdf.format(moment));
        sb.append("\nOrder status: " + status);
        sb.append("\nClient: " + client.getName() + ", (" + sdf2.format(client.getBirthDate()) + ") - " + client.getEmail());
        sb.append("\nOrder items: ");
        for (OrderItem o : orderItems){
            sb.append(o.getProduct().getName() + ", Quantity: " + o.getQuantity() + ", Subtotal: " + String.format("%.2f%n", o.subTotal()));
        }
        sb.append("Total price: $" + String.format("%.2f", total()));
        return sb.toString();
    }
}
