package company.model.dairyProduct;

import company.model.Product;

import java.time.LocalDate;

public class Milk extends Product {
    public Milk (int id,String name, String companyName,  LocalDate releaseDate) {
        super(id,name,companyName,releaseDate);
    }
}
