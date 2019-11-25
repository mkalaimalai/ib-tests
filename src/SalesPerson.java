import java.util.Arrays;

public class SalesPerson {
    private String id;

    private  Sales [] salesHistory = new Sales[6];

    private int count = 0;



    public SalesPerson(String id) {
        this.id = id;
    }

    public SalesPerson(String id, Sales[] salesHistory, int count) {
        this.id = id;
        this.salesHistory = salesHistory;
        this.count = count;
    }

    public void setSalesHistory( Sales sales){
        salesHistory[count] = sales;
        count = count +1;
    }

    public double calcTotalSales() {

        double totalSales = 0;
        if(this.getSalesHistory() != null)
        for (int i = 0; i < this.salesHistory.length; i++) {
            if(this.salesHistory[i] != null)
            totalSales = totalSales + this.salesHistory[i].getValue();
        }
        return totalSales;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Sales[] getSalesHistory() {
        return this.salesHistory;
    }

    public void setSalesHistory(Sales[] salesHistory) {
        this.salesHistory = salesHistory;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "id='" + id + '\'' +
                ", salesHistory=" + Arrays.toString(salesHistory) +
                ", count=" + count +
                '}';
    }

}
