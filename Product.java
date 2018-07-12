public class Product {
    String description;
    int id;
    double price;
    int quantity;
    double storagePrice;

    Product(String description, double price, int quantity, double price2){
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.storagePrice = price2;
    }

    public double getStoragePrice() {
        return storagePrice;
    }

    public void setStoragePrice(double storagePrice) {
        this.storagePrice = storagePrice;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}

