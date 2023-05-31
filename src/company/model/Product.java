package company.model;

import java.time.LocalDate;

public abstract class Product {
    private int id;
    private String name;
    private String companyName;
    private LocalDate releaseDate;

    public Product() {
    }

    public Product(int id, String name, String companyName, LocalDate releaseDate) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
