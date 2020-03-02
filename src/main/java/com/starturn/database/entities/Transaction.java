package com.starturn.database.entities;
// Generated 01-Mar-2020 08:29:01 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * Transaction generated by hbm2java
 */
@Entity
@Table(name="transaction"
    ,catalog="starturn"
)
public class Transaction  implements java.io.Serializable {


     private Integer id;
     private Long version;
     private EsusuGroup esusuGroup;
     private MemberProfile memberProfile;
     private TargetSavings targetSavings;
     private TransactionType transactionType;
     private BigDecimal amount;
     private BigDecimal amountInAndOut;
     private Boolean isEsusuContribution;
     private Boolean isAutoDebit;
     private Boolean isCardPayment;
     private Boolean isTargetSavings;
     private Date transactionDate;

    public Transaction() {
    }

    public Transaction(EsusuGroup esusuGroup, MemberProfile memberProfile, TargetSavings targetSavings, TransactionType transactionType, BigDecimal amount, BigDecimal amountInAndOut, Boolean isEsusuContribution, Boolean isAutoDebit, Boolean isCardPayment, Boolean isTargetSavings, Date transactionDate) {
       this.esusuGroup = esusuGroup;
       this.memberProfile = memberProfile;
       this.targetSavings = targetSavings;
       this.transactionType = transactionType;
       this.amount = amount;
       this.amountInAndOut = amountInAndOut;
       this.isEsusuContribution = isEsusuContribution;
       this.isAutoDebit = isAutoDebit;
       this.isCardPayment = isCardPayment;
       this.isTargetSavings = isTargetSavings;
       this.transactionDate = transactionDate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    @Version
    @Column(name="version")
    public Long getVersion() {
        return this.version;
    }
    
    public void setVersion(Long version) {
        this.version = version;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="esusu_group_id")
    public EsusuGroup getEsusuGroup() {
        return this.esusuGroup;
    }
    
    public void setEsusuGroup(EsusuGroup esusuGroup) {
        this.esusuGroup = esusuGroup;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="member_profile_id")
    public MemberProfile getMemberProfile() {
        return this.memberProfile;
    }
    
    public void setMemberProfile(MemberProfile memberProfile) {
        this.memberProfile = memberProfile;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="target_savings_id")
    public TargetSavings getTargetSavings() {
        return this.targetSavings;
    }
    
    public void setTargetSavings(TargetSavings targetSavings) {
        this.targetSavings = targetSavings;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="transaction_type_id")
    public TransactionType getTransactionType() {
        return this.transactionType;
    }
    
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    
    @Column(name="amount", scale=4)
    public BigDecimal getAmount() {
        return this.amount;
    }
    
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    
    @Column(name="amount_in_and_out", scale=4)
    public BigDecimal getAmountInAndOut() {
        return this.amountInAndOut;
    }
    
    public void setAmountInAndOut(BigDecimal amountInAndOut) {
        this.amountInAndOut = amountInAndOut;
    }

    
    @Column(name="is_esusu_contribution")
    public Boolean getIsEsusuContribution() {
        return this.isEsusuContribution;
    }
    
    public void setIsEsusuContribution(Boolean isEsusuContribution) {
        this.isEsusuContribution = isEsusuContribution;
    }

    
    @Column(name="is_auto_debit")
    public Boolean getIsAutoDebit() {
        return this.isAutoDebit;
    }
    
    public void setIsAutoDebit(Boolean isAutoDebit) {
        this.isAutoDebit = isAutoDebit;
    }

    
    @Column(name="is_card_payment")
    public Boolean getIsCardPayment() {
        return this.isCardPayment;
    }
    
    public void setIsCardPayment(Boolean isCardPayment) {
        this.isCardPayment = isCardPayment;
    }

    
    @Column(name="is_target_savings")
    public Boolean getIsTargetSavings() {
        return this.isTargetSavings;
    }
    
    public void setIsTargetSavings(Boolean isTargetSavings) {
        this.isTargetSavings = isTargetSavings;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="transaction_date", length=10)
    public Date getTransactionDate() {
        return this.transactionDate;
    }
    
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }




}


