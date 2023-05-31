package company.service;
import company.model.Product;
import java.util.List;


public interface ProductService {
    void addProducts(List<Product> products);

    void sortByDate(List<Product> products);

    void getAllProducts(String password, String username);
}
