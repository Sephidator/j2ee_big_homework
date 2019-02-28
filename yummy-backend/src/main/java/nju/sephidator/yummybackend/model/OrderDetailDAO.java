package nju.sephidator.yummybackend.model;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@DynamicUpdate
public class OrderDetailDAO {

    @Id
    @GeneratedValue
    private Integer id;

    private String orderId;

    private Integer foodId;

    private Integer foodNum;

    private Double price;
}