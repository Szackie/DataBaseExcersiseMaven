
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PRODUCTS")

public class Products {
    @Id
//    @GeneratedValue(generator = "inc")
//    @GenericGenerator(name = "inc", strategy = "increment")
    private Integer id;
    private String name;
    private double price;
    private String description;

    public Products() {
    }
    Products(Integer id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    Integer getId() {
        return id;
    }

    void setId(Integer id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }


}