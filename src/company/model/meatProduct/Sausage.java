package company.model.meatProduct;

import company.model.Product;

import java.time.LocalDate;

public class Sausage extends Product {
    public Sausage(int id, String name, String companyName, LocalDate releaseDate) {
        super(id, name, companyName, releaseDate);
    }
}
