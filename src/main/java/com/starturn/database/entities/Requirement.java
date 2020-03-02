package com.starturn.database.entities;
// Generated 01-Mar-2020 08:29:01 by Hibernate Tools 4.3.1


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
 * Requirement generated by hbm2java
 */
@Entity
@Table(name="requirement"
    ,catalog="starturn"
)
public class Requirement  implements java.io.Serializable {


     private Integer id;
     private Long version;
     private String requirementName;
     private String requirementDescription;
     private String requirementCode;
     private Boolean memberHasAccess;
     private Boolean adminHasAccess;
     private Set<RequirementGroupAccess> requirementGroupAccesses = new HashSet<RequirementGroupAccess>(0);
     private Set<UserGroupRequirement> userGroupRequirements = new HashSet<UserGroupRequirement>(0);

    public Requirement() {
    }

    public Requirement(String requirementName, String requirementDescription, String requirementCode, Boolean memberHasAccess, Boolean adminHasAccess, Set<RequirementGroupAccess> requirementGroupAccesses, Set<UserGroupRequirement> userGroupRequirements) {
       this.requirementName = requirementName;
       this.requirementDescription = requirementDescription;
       this.requirementCode = requirementCode;
       this.memberHasAccess = memberHasAccess;
       this.adminHasAccess = adminHasAccess;
       this.requirementGroupAccesses = requirementGroupAccesses;
       this.userGroupRequirements = userGroupRequirements;
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

    
    @Column(name="requirement_name", length=500)
    public String getRequirementName() {
        return this.requirementName;
    }
    
    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    
    @Column(name="requirement_description", length=500)
    public String getRequirementDescription() {
        return this.requirementDescription;
    }
    
    public void setRequirementDescription(String requirementDescription) {
        this.requirementDescription = requirementDescription;
    }

    
    @Column(name="requirement_code", length=500)
    public String getRequirementCode() {
        return this.requirementCode;
    }
    
    public void setRequirementCode(String requirementCode) {
        this.requirementCode = requirementCode;
    }

    
    @Column(name="member_has_access")
    public Boolean getMemberHasAccess() {
        return this.memberHasAccess;
    }
    
    public void setMemberHasAccess(Boolean memberHasAccess) {
        this.memberHasAccess = memberHasAccess;
    }

    
    @Column(name="admin_has_access")
    public Boolean getAdminHasAccess() {
        return this.adminHasAccess;
    }
    
    public void setAdminHasAccess(Boolean adminHasAccess) {
        this.adminHasAccess = adminHasAccess;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="requirement")
    public Set<RequirementGroupAccess> getRequirementGroupAccesses() {
        return this.requirementGroupAccesses;
    }
    
    public void setRequirementGroupAccesses(Set<RequirementGroupAccess> requirementGroupAccesses) {
        this.requirementGroupAccesses = requirementGroupAccesses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="requirement")
    public Set<UserGroupRequirement> getUserGroupRequirements() {
        return this.userGroupRequirements;
    }
    
    public void setUserGroupRequirements(Set<UserGroupRequirement> userGroupRequirements) {
        this.userGroupRequirements = userGroupRequirements;
    }




}


