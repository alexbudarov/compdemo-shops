package com.sample.shops.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "SHOPS_CUSTOMER")
@Entity(name = "shops_Customer")
@NamePattern("%s|name")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -2086576249820833116L;

    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}