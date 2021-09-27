ackage com.example.demo.phistory.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private String infomation;

    @Column(nullable = false)
    private String image;
}
