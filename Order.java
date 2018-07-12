import java.util.ArrayList;
import java.util.List;

public class Order {

        String companyName;

        List<Product> products  = new ArrayList<>();

        Order(String companyName){
            this.companyName = companyName;
        }

        public void addProduct(Product p){
            products.add(p);
        }

    }


