public class Medicine {

    private String name;
    private double price;
    private String expirationDate;

    public Medicine(String name, double price, String expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public Medicine() {
        name = "Ashvaganda";
        price = 16;
        expirationDate = "10/10/2030";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}