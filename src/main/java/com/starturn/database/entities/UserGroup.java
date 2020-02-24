package com.starturn.database.entities;
// Generated 12-Jan-2020 16:59:07 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * UserGroup generated by hbm2java
 */
@Entity
@Table(name="user_group"
    ,catalog="starturn"
)
public class UserGroup  implements java.io.Serializable {


     private int id;
     private Long version;
     private String groupName;
     private Boolean availableToAdmin;
     private Boolean availableToMember;
     private Set userGroupRequirements = new HashSet(0);
     private Set memberProfiles = new HashSet(0);

    public UserGroup() {
    }

	
    public UserGroup(int id) {
        this.id = id;
    }
    public UserGroup(int id, String groupName, Boolean availableToAdmin, Boolean availableToMember, Set userGroupRequirements, Set memberProfiles) {
       this.id = id;
       this.groupName = groupName;
       this.availableToAdmin = availableToAdmin;
       this.availableToMember = availableToMember;
       this.userGroupRequirements = userGroupRequirements;
       this.memberProfiles = memberProfiles;
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

    
    @Column(name="group_name", length=100)
    public String getGroupName() {
        return this.groupName;
    }
    
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    
    @Column(name="available_to_admin")
    public Boolean getAvailableToAdmin() {
        return this.availableToAdmin;
    }
    
    public void setAvailableToAdmin(Boolean availableToAdmin) {
        this.availableToAdmin = availableToAdmin;
    }

    
    @Column(name="available_to_member")
    public Boolean getAvailableToMember() {
        return this.availableToMember;
    }
    
    public void setAvailableToMember(Boolean availableToMember) {
        this.availableToMember = availableToMember;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="userGroup")
    public Set getUserGroupRequirements() {
        return this.userGroupRequirements;
    }
    
    public void setUserGroupRequirements(Set userGroupRequirements) {
        this.userGroupRequirements = userGroupRequirements;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="user_group_members", catalog="starturn", joinColumns = { 
        @JoinColumn(name="user_group_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="member_profile_id", nullable=false, updatable=false) })
    public Set getMemberProfiles() {
        return this.memberProfiles;
    }
    
    public void setMemberProfiles(Set memberProfiles) {
        this.memberProfiles = memberProfiles;
    }




}

