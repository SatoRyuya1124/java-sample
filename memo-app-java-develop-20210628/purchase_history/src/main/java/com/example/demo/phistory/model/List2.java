ackage com.example.demo.phistory.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "List2")
public class List2 {
    @Id
    @Column(nullable = false)
    private int list2_id;

    @Column(nullable = false)
    private String list_name;

    @Column(nullable = false)
    private String office_name;

    @Column(nullable = false)
    private String street_address;

    @Column(nullable = false)
    private String responce_name;

    @Column(nullable = false)
    private int review;
}
