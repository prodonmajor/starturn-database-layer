package com.starturn.database.entities;
// Generated 12-Jan-2020 16:59:07 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * EsusuGroupInvites generated by hbm2java
 */
@Entity
@Table(name="esusu_group_invites"
    ,catalog="starturn"
)
public class EsusuGroupInvites  implements java.io.Serializable {


     private int id;
     private Long version;
     private EsusuGroup esusuGroup;
     private MemberProfile memberProfile;
     private String firstName;
     private String lastName;
     private String emailAddress;
     private String phoneNumber;
     private BigDecimal expectedAmount;
     private BigDecimal amountPaid;
     private Boolean accepted;
     private Boolean rejected;
     private Date responseDate;
     private Date invitedDate;
     private String invitedByUsername;

    public EsusuGroupInvites() {
    }

	
    public EsusuGroupInvites(int id) {
        this.id = id;
    }
    public EsusuGroupInvites(int id, EsusuGroup esusuGroup, MemberProfile memberProfile, String firstName, String lastName, String emailAddress, String phoneNumber, BigDecimal expectedAmount, BigDecimal amountPaid, Boolean accepted, Boolean rejected, Date responseDate, Date invitedDate, String invitedByUsername) {
       this.id = id;
       this.esusuGroup = esusuGroup;
       this.memberProfile = memberProfile;
       this.firstName = firstName;
       this.lastName = lastName;
       this.emailAddress = emailAddress;
       this.phoneNumber = phoneNumber;
       this.expectedAmount = expectedAmount;
       this.amountPaid = amountPaid;
       this.accepted = accepted;
       this.rejected = rejected;
       this.responseDate = responseDate;
       this.invitedDate = invitedDate;
       this.invitedByUsername = invitedByUsername;
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

    
    @Column(name="first_name", length=50)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="last_name", length=50)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="email_address", length=50)
    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    
    @Column(name="phone_number", length=50)
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    @Column(name="expected_amount", scale=4)
    public BigDecimal getExpectedAmount() {
        return this.expectedAmount;
    }
    
    public void setExpectedAmount(BigDecimal expectedAmount) {
        this.expectedAmount = expectedAmount;
    }

    
    @Column(name="amount_paid", scale=4)
    public BigDecimal getAmountPaid() {
        return this.amountPaid;
    }
    
    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    
    @Column(name="accepted")
    public Boolean getAccepted() {
        return this.accepted;
    }
    
    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    
    @Column(name="rejected")
    public Boolean getRejected() {
        return this.rejected;
    }
    
    public void setRejected(Boolean rejected) {
        this.rejected = rejected;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="response_date", length=10)
    public Date getResponseDate() {
        return this.responseDate;
    }
    
    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="invited_date", length=10)
    public Date getInvitedDate() {
        return this.invitedDate;
    }
    
    public void setInvitedDate(Date invitedDate) {
        this.invitedDate = invitedDate;
    }

    
    @Column(name="invited_by_username", length=50)
    public String getInvitedByUsername() {
        return this.invitedByUsername;
    }
    
    public void setInvitedByUsername(String invitedByUsername) {
        this.invitedByUsername = invitedByUsername;
    }




}

