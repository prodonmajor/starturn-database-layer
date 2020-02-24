/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.starturn.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name="environmental_property"
    ,catalog="starturn"
)
public class EnvironmentalProperty implements java.io.Serializable {
 private int id;
 private Long version; 
 private String propertyName;
 private String propertyValue;

    public EnvironmentalProperty() {
    }

    public EnvironmentalProperty(int id) {
        this.id = id;
    }

    public EnvironmentalProperty(int id, Long version, String propertyName, String propertyValue) {
        this.id = id;
        this.version = version;
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
    }

    @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Version
    @Column(name="version")
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Column(name="property_name", length=500)
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Column(name="property_value", length=500)
    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }
 
 
}
