import java.io.File;
import java.util.Map;
import java.util.Scanner;

public class Service { static Map<String, Product> products;

    static void searchProduct(Map<String, Product> products, String name){
        if(products.containsKey(name)){
            Product p = products.get(name);
            System.out.println("Име на продукта: " + p.getDescription());
            System.out.println("Количество в склада: " + p.getQuantity());
            System.out.println("Цена: " + p.getPrice());
        }else{
            System.out.println("Няма такъв продукт");
        }
    }

    static void addProducts(Map<String, Product> products){
        Scanner order = new Scanner(System.in);
        System.out.println("Въведете името на фирмата за която ще е поръчката");
        String orderName = order.next();
        System.out.println("Въведете номер на продукт от листа който да добавите");
        System.out.println("Въведете 0 за край");
        int productChoice = 0;
        Order order1 = new Order(orderName);
        do{
            productChoice = order.nextInt();
            switch(productChoice){
                case 1:{
                    order1.addProduct(products.get("Мляко"));
                }break;
                case 2:{
                    order1.addProduct(products.get("Сирене"));
                }break;
            }
        }while(productChoice != 0);
    }


    static void showProductDetails(Map<String, Product> productss){
        products = productss;
        System.out.println("1.Мляко   2.Сирене");
        System.out.println("Количество: "+getProductEntities("Мляко") + "   Количество: "+ getProductEntities("Сирене"));
        System.out.println("Цена: " + getProductPrice("Мляко")+ "   Цена: " + getProductPrice("Сирене"));
        System.out.println("Цена складова: " + getProductPrice2("Мляко") + "  Цена: "  + getProductPrice2("Сирене"));
    }

    private static int getProductEntities(String desc){
        return products.get(desc).quantity;
    }

    private static double getProductPrice(String desc){
        return products.get(desc).price;
    }

    private static double getProductPrice2(String desc){
        return products.get(desc).storagePrice;
    }

    static void readFromFile(Map<String, Product> products) throws Exception {
        Scanner input = new Scanner(new File("D:\\JAVA\\Store\\resources\\Products"));
        input.useDelimiter("-|\n");

        while (input.hasNext()) {
            String description = input.next();
            double price = Double.valueOf(input.next());
            int stock = input.nextInt();
            double price2 = Double.valueOf(input.next());

            Product newProduct = new Product(description, price, stock, price2);
            products.put(description, newProduct);
        }
    }
}


