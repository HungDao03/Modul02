import java.time.LocalDate;

// lớp bột
public class CrispyFlour extends Material {
    private int quantity; // số lượng

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost) {
        super(id, name, manufacturingDate, cost);
        this.quantity = 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return this.quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(5); // thịt có hạn sd5 ngay
    }

    @Override
    public String toString() {
        return super.toString() + " - Quantity: " + this.quantity;
    }
}
