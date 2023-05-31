package company.service.impl;

import company.dao.ProductDao;
import company.model.Manager;
import company.model.Product;
import company.service.ProductService;

import java.time.LocalDate;

import java.util.LinkedList;
import java.util.List;


public class ProductServiceImpl implements ProductService {
    final private ProductDao productDao = new ProductDao();

    @Override
    public void addProducts(List<Product> products) {
        products.stream().filter(x -> x.getCompanyName().equalsIgnoreCase("nur")
                        || x.getCompanyName().equalsIgnoreCase("toiboss")
                        || x.getCompanyName().equalsIgnoreCase("milka")).
                filter(a -> a.getReleaseDate()
                        .isAfter(LocalDate.now().plusMonths(1)))
                .forEach(productDao.getProducts()::add);
    }

    @Override
    public void sortByDate(List<Product> products) {
        List<Product> linkedList = new LinkedList<>(productDao.getProducts());
        linkedList.removeIf(product -> product.getReleaseDate().isBefore(LocalDate.now().plusMonths(1)));
        products.stream().filter(x -> x.getReleaseDate().minusWeeks(1).isBefore(LocalDate.now().plusMonths(1)))
                .forEach(productDao.getDiscountProducts()::add);
        System.out.println(productDao.getDiscountProducts());

    }

    @Override
    public void getAllProducts(String userName, String password) {
        if (userName.equals(new Manager().getUsername()) && password.equals(new Manager().getPassword())) {
            System.out.println("Продукты : ");
            System.out.println(getProductDao().getProducts());
            System.out.println("Скидочные продукты: ");
            System.out.println(getProductDao().getDiscountProducts());
        } else {
            System.out.println("Ваш пароль и логин не совпадают!");
        }
    }

    public ProductDao getProductDao() {
        return productDao;
    }
}
