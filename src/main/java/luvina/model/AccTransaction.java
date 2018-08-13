package luvina.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@Data
@Entity
@Table(name = "acc_transaction")
public class AccTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int txnId;

    @Column(name = "amount")
    float amount;

    @CreationTimestamp
    Date FundsAvailDate;

    @CreationTimestamp
    Date txnDate;

    String txnTypeCd;

    @Column(name = "account_id")
    int accountId;

//    int executionBranchId;
//
//    int tellerEmpId;

    public AccTransaction(float amount, int accountId) {
        this.amount = amount;
        this.accountId = accountId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
