import java.util.Map;
import java.util.Scanner;

public class Utils { public static String login(){
    Scanner scan = new Scanner(System.in);
    System.out.println("--- Вход в системата ---");
    System.out.println("Потребителско име: ");
    String username = scan.nextLine();
    System.out.println("Парола: ");
    String pass = scan.nextLine();
    checkPassword(pass);
    return username;
}

    public static void showMenu(String user, Map<String, Product> products){
        System.out.println("---Потребител:" + user + " ---------------");
        System.out.println("Изберете");
        System.out.println("1. Добавяне на продукти към поръчка");
        System.out.println("2. Търсене на продукти по име");
        System.out.println("3. Връщане на стока с изтекъл срок");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch (choice) {
            case 1: {
                Service.showProductDetails(products);
                Service.addProducts(products);

            }
            break;
            case 2: {
                Scanner scanProd = new Scanner(System.in);
                System.out.println("Въведете продукт по име");
                String name = scanProd.next();
                Service.searchProduct(products, name);
            }
            break;
        }
    }

    private static void checkPassword (String pass){
        String userPassword = "123";
        if (pass.equals(userPassword)) {
            System.out.println("Успешен вход");
        } else {
            System.out.println("Грешна парола");
        }
    }
}


