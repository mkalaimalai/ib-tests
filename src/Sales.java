public class Sales {

    private String itemId;

    private double value;

    private int quantity;

    public Sales(String itemId, double value, int quantity) {
        this.itemId = itemId;
        this.value = value;
        this.quantity = quantity;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "itemId='" + itemId + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }
}
