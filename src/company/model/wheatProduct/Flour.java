package company.model.wheatProduct;

import company.model.Product;

import java.time.LocalDate;

public class Flour extends Product {
    public Flour(int id, String name, String companyName, LocalDate releaseDate) {
        super(id, name, companyName, releaseDate);
    }
}
