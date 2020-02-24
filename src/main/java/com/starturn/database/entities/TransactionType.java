package com.starturn.database.entities;
// Generated 12-Jan-2020 16:59:07 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * TransactionType generated by hbm2java
 */
@Entity
@Table(name="transaction_type"
    ,catalog="starturn"
)
public class TransactionType  implements java.io.Serializable {


     private Integer id;
     private Long version;
     private String name;
     private Set transactions = new HashSet(0);

    public TransactionType() {
    }

    public TransactionType(String name, Set transactions) {
       this.name = name;
       this.transactions = transactions;
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

    
    @Column(name="name", length=500)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="transactionType")
    public Set getTransactions() {
        return this.transactions;
    }
    
    public void setTransactions(Set transactions) {
        this.transactions = transactions;
    }




}

