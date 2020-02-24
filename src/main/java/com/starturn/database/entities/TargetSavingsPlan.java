package com.starturn.database.entities;
// Generated 12-Jan-2020 16:59:07 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * TargetSavingsPlan generated by hbm2java
 */
@Entity
@Table(name="target_savings_plan"
    ,catalog="starturn"
)
public class TargetSavingsPlan  implements java.io.Serializable {


     private int id;
     private Long version;
     private ContributionFrequency contributionFrequency;
     private String name;
     private String periodDuration;
     private BigDecimal savingsInterestRate;
     private Boolean autoDebitAllowed;
     private Boolean lockedSavings;
     private BigDecimal earlyWithdrawalInterestRate;
     private Set targetSavingses = new HashSet(0);

    public TargetSavingsPlan() {
    }

	
    public TargetSavingsPlan(int id) {
        this.id = id;
    }
    public TargetSavingsPlan(int id, ContributionFrequency contributionFrequency, String name, String periodDuration, BigDecimal savingsInterestRate, Boolean autoDebitAllowed, Boolean lockedSavings, BigDecimal earlyWithdrawalInterestRate, Set targetSavingses) {
       this.id = id;
       this.contributionFrequency = contributionFrequency;
       this.name = name;
       this.periodDuration = periodDuration;
       this.savingsInterestRate = savingsInterestRate;
       this.autoDebitAllowed = autoDebitAllowed;
       this.lockedSavings = lockedSavings;
       this.earlyWithdrawalInterestRate = earlyWithdrawalInterestRate;
       this.targetSavingses = targetSavingses;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
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
    @JoinColumn(name="contribution_frequency_id")
    public ContributionFrequency getContributionFrequency() {
        return this.contributionFrequency;
    }
    
    public void setContributionFrequency(ContributionFrequency contributionFrequency) {
        this.contributionFrequency = contributionFrequency;
    }

    
    @Column(name="name", length=500)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="period_duration", length=500)
    public String getPeriodDuration() {
        return this.periodDuration;
    }
    
    public void setPeriodDuration(String periodDuration) {
        this.periodDuration = periodDuration;
    }

    
    @Column(name="savings_interest_rate", scale=4)
    public BigDecimal getSavingsInterestRate() {
        return this.savingsInterestRate;
    }
    
    public void setSavingsInterestRate(BigDecimal savingsInterestRate) {
        this.savingsInterestRate = savingsInterestRate;
    }

    
    @Column(name="auto_debit_allowed")
    public Boolean getAutoDebitAllowed() {
        return this.autoDebitAllowed;
    }
    
    public void setAutoDebitAllowed(Boolean autoDebitAllowed) {
        this.autoDebitAllowed = autoDebitAllowed;
    }

    
    @Column(name="locked_savings")
    public Boolean getLockedSavings() {
        return this.lockedSavings;
    }
    
    public void setLockedSavings(Boolean lockedSavings) {
        this.lockedSavings = lockedSavings;
    }

    
    @Column(name="early_withdrawal_interest_rate", scale=4)
    public BigDecimal getEarlyWithdrawalInterestRate() {
        return this.earlyWithdrawalInterestRate;
    }
    
    public void setEarlyWithdrawalInterestRate(BigDecimal earlyWithdrawalInterestRate) {
        this.earlyWithdrawalInterestRate = earlyWithdrawalInterestRate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="targetSavingsPlan")
    public Set getTargetSavingses() {
        return this.targetSavingses;
    }
    
    public void setTargetSavingses(Set targetSavingses) {
        this.targetSavingses = targetSavingses;
    }




}


