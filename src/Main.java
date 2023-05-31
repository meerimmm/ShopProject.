import company.model.Product;
import company.model.dairyProduct.Kefir;
import company.model.dairyProduct.Milk;
import company.model.dairyProduct.Yogurt;
import company.model.meatProduct.Fish;
import company.model.meatProduct.Meat;
import company.model.wheatProduct.Flour;
import company.model.wheatProduct.Pasta;
import company.service.impl.ProductServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>(Arrays.asList(
                new Kefir(1, "Kefir", "milka", LocalDate.of(2023, 6, 30)),
                new Milk(1, "Milk", "milka", LocalDate.of(2023, 4, 1)),
                new Yogurt(1, "Yogurt", "milka", LocalDate.of(2023, 3, 2)),
                new Meat(2, "Meat", "toiboss", LocalDate.of(2023, 12, 19)),
                new Fish(2, "Fish", "toiboss", LocalDate.of(2023, 3, 7)),
                new Pasta(3, "PAsta", "nur", LocalDate.of(2023, 8, 3)),
                new Flour(3, "Flour", "nur", LocalDate.of(2023, 2, 22)),
                new Meat(3, "Meat", "nur", LocalDate.of(2023, 1, 23))));

        ProductServiceImpl productService = new ProductServiceImpl();
        productService.addProducts(productList);
        productService.sortByDate(productList);
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите свой логин :");
        String longin = scanner.nextLine();
        System.out.println(" Введите свой пароль :");
        String password = scanner.nextLine();
        productService.getAllProducts(longin, password);
















    }
}