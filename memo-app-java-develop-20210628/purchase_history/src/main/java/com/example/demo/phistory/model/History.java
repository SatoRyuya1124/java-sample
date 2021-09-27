ackage com.example.demo.phistory.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "History")
public class History {
    @Id
    @Column(nullable = false)
    private int order_number;

    @Column(nullable = false)
    private int product_id;

    @Column(nullable = false)
    private int user_id;

    @Column(nullable = false)
    private int total_money;

    @Column(nullable = false)
    private int total_count;

    @Column(nullable = false)
    private String buy_date;
}
