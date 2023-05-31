package company.model.wheatProduct;

import company.model.Product;

import java.time.LocalDate;

public class Pasta extends Product {
    public Pasta(int id, String name, String companyName, LocalDate releaseDate) {
        super(id, name, companyName, releaseDate);
    }
}
