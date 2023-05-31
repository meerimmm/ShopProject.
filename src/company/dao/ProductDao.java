package company.dao;

import company.model.Product;

import java.util.ArrayList;
import java.util.List;


public class ProductDao {
    private List<Product> products = new ArrayList<>();
    private List<Product> discountProducts = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getDiscountProducts() {
        return discountProducts;
    }

    public void setDiscountProduct(List<Product> discountProduct) {
        this.discountProducts = discountProduct;
    }

    @Override
    public String toString() {
        return "ProductDao{" +
                "products=" + products +
                ", discountProduct=" + discountProducts +
                '}';
    }
}
