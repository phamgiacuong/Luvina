package luvina.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@Data
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int accountId;

    float availBalance;

    Date closeDate;

    Date lastActivityDate;

    @CreationTimestamp
    Date openDate;

    float pendingBalance;

    String status;

    @Column(name = "cust_id")
    int custId;

    int openBranchId;

    int openEmpId;

    String productCd;

    @OneToOne
    @JoinColumn(name = "productCd", insertable = false, updatable = false)
    private Product product;
    @OneToOne
    @JoinColumn(name = "accountId")
    private AccTransaction accTransaction;


    public Account(float availBalance, String status, int custId, int openBranchId, int openEmpId, String productCd) {
        this.availBalance = availBalance;
        this.status = status;
        this.custId = custId;
        this.openBranchId = openBranchId;
        this.openEmpId = openEmpId;
        this.productCd = productCd;
    }
}
