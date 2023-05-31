package company.model.meatProduct;

import company.model.Product;

import java.time.LocalDate;

public class Meat extends Product {
    public Meat(int id, String name, String companyName, LocalDate releaseDate) {
        super(id, name, companyName, releaseDate);
    }
}
