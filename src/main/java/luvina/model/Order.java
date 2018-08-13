package luvina.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

/*
* lưu trữ thông tin đơn hàng
* */
@AllArgsConstructor
@Data
//@Entity
public class Order {
    @Id

    Integer cust_id;

    String productCd;
//
    String name;

    Float price;

    Float amount;

    public Order(){
    }

}
