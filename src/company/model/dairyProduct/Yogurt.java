package company.model.dairyProduct;

import company.model.Product;

import java.time.LocalDate;

public class Yogurt extends Product {
    public Yogurt(int id, String name, String companyName, LocalDate releaseDate) {
        super(id, name, companyName, releaseDate);
    }
}
