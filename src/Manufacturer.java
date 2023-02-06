public class Manufacturer {
    public String name;
    public String adress;
    public String number;

    public Manufacturer(String name, String adress, String  number) {
        this.name = name;
        this.adress = adress;
        this.number = number;
    }

    public Manufacturer(){
        name = "Name";
        adress = "Varna";
        number = "0884657895";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
