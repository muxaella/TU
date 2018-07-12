import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static Service service = new Service();

    static String user;


    static List<Product> productList = new ArrayList<>();
    static Map<String, Product> products = new HashMap<>();


    public static void main (String[]args) {
        try {
            Service.readFromFile(products);
        } catch (Exception e) {
            e.printStackTrace();
        }

        user = Utils.login();

        Utils.showMenu(user, products);

    }

}


