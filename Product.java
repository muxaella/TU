public class Product {

    String description;
    int id;
    double cena;
    int quantity;
    double skladovaCena;

    Product(String description, double cena, int quantity, double cena2){
        this.description = description;
        this.cena = cena;
        this.quantity = quantity;
        this.skladovaCena = cena2;
    }

    public double getSkladovaCena() {
        return skladovaCena;
    }

    public void setSkladovaCena(double skladovaCena) {
        this.skladovaCena = skladovaCena;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
