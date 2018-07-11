import java.io.File;
import java.util.*;

public class Main {

    static Service service = new Service();

    static String user;


    static List<Product> productList = new ArrayList<>();
    static Map<String, Product> products = new HashMap<>();

    public static void main(String[] args) throws Exception{

                Scanner input = new Scanner(new File("D:\\JAVA\\Projectt\\resources\\Products"));
                input.useDelimiter("-|\n");

             while(input.hasNext()) {
                String description = input.next();
                double price = Double.valueOf(input.next());
                int stock = input.nextInt();
                double price2 = Double.valueOf(input.next());

                Product newProduct = new Product(description, price, stock, price2);
                products.put(description, newProduct);
            }


        Scanner scan = new Scanner(System.in);
        System.out.println("--- Вход в системата ---");
        System.out.println("Потребителско име: ");
        String username = scan.nextLine();
        System.out.println("Парола: ");
        String pass = scan.nextLine();
        checkPassword(pass);
        user = username;

        System.out.println("---Потребител:"+user+" ---------------");
        System.out.println("Изберете");
        System.out.println("1. Добавяне на продукти към поръчка");
        System.out.println("2. Търсене на продукти по име");
        System.out.println("3. Връщане на стока с изтекъл срок");
        int choice = scan.nextInt();

        switch(choice){
            case 1:{
                System.out.println("1.Мляко   2.Сирене");
                System.out.println("Количество: "+getProductEntities("Мляко") + "   Количество: "+ getProductEntities("Сирене"));
                System.out.println("Цена: " + getProductPrice("Мляко")+ "   Цена: " + getProductPrice("Сирене"));
                System.out.println("Цена складова: " + getProductPrice2("Мляко") + "  Цена: "  + getProductPrice2("Сирене"));
                System.out.println("Изберете кой продукт да добавите към кошницата");

            }break;
            case 2:{
                Scanner scanProd = new Scanner(System.in);
                System.out.println("Въведете продукт по име");
                String name = scan.next();
                if(products.containsKey(name)){
                    Product p = products.get(name);
                    System.out.println("Име на продукта: " + p.getDescription());
                    System.out.println("Количество в склада: " + p.getQuantity());
                    System.out.println("Цена: " + p.getCena());
                }else{
                    System.out.println("Няма такъв продукт");
                }
            }break;
        }

       /* Product milk = new Product();
        milk.setCena(5.50);
        milk.setDescription("MLQKO");  //тук трябва да вземем от базата данните и да го превърнем в обект
        milk.setId(1);
        milk.setQuantity(200);  //broika

        Product egg = new Product();
        egg.setCena(7.50);
        egg.setDescription("EGG");
                                                           // не ни трябва
        service.novaPoruchka("Kaufland");

        service.addProduct(milk);
        service.addProduct(egg);

        pokajiProductiteVKoshnicata();*/
    }

    private static boolean checkPassword(String pass){
        String userPassword = "123";
        if(pass.equals(userPassword)){
            System.out.println("Успешен вход");
            return true;
        }else{
            System.out.println("Грешна парола");
            return false;
        }
    }

    private static int getProductEntities(String desc){
        return products.get(desc).quantity;
    }

    private static double getProductPrice(String desc){
        return products.get(desc).cena;
    }

    private static double getProductPrice2(String desc){
        return products.get(desc).skladovaCena;
    }

    private static void pokajiProductiteVKoshnicata(){ // не ни трябва

        for(Product p : service.showProducts()){
            System.out.println(p.getDescription());
        }
    }

}
