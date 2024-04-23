package com.onlineshop.delguur.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.security.PrivateKey;

@Entity
@Table(name = "customer")
public class Customer extends BaseEntity {
    private String name;
    private String email;
    private String phone;
    private String Address;
    private String cityRegion;
    private String ccNumber;

    public Customer(){

    }

    public Customer(String name, String email, String phone, String address, String cityRegion, String ccNumber) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        Address = address;
        this.cityRegion = cityRegion;
        this.ccNumber = ccNumber;
    }

    @Column(name = "name", length = 45, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "email", length = 45, nullable = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "phone", length = 45)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "address", length = 45)
    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Column(name = "city_region", length = 2)
    public String getCityRegion() {
        return cityRegion;
    }

    public void setCityRegion(String cityRegion) {
        this.cityRegion = cityRegion;
    }

    @Column(name = "cc_number", length = 19)
    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }
}
