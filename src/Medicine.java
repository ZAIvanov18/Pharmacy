public class Medicine {
    public String name;
    public float price;
    public String dateOfExpire;

    public Medicine(String name, float price, String dateOfExpire) {
        this.name = name;
        this.price = price;
        this.dateOfExpire = dateOfExpire;
    }

    public Medicine(){
        name = "Aspirin";
        price = 20;
        dateOfExpire = "01/08/2025";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDateOfExpire() {
        return dateOfExpire;
    }

    public void setDateOfExpire(String dateOfExpire) {
        this.dateOfExpire = dateOfExpire;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", dateOfExpire='" + dateOfExpire + '\'' +
                '}';
    }
}
