public class Importer {
    public String name;
    public String adress;
    public String number;

    public Importer(String name, String adress, String  number) {
        this.name = name;
        this.adress = adress;
        this.number = number;
    }

    public Importer(){
        name = "Ivan";
        adress = "Burgas";
        number = "0881234567";
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
        return "Importer{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
