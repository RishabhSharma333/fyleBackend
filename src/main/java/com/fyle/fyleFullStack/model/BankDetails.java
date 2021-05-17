package com.fyle.fyleFullStack.model;

import javax.persistence.*;

@Table(name="bank_branches")
@Entity
public class BankDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ifsc;
    private String bank_id;
    private String branch;
    private String address;
    private String city;
    private String district;
    private String state_name;
    private String bank_name;

    public BankDetails() {
    }

    public BankDetails(Integer id, String ifsc, String bank_id, String branch, String address, String city, String district, String state_name, String bank_name) {
        this.id = id;
        this.ifsc = ifsc;
        this.bank_id = bank_id;
        this.branch = branch;
        this.address = address;
        this.city = city;
        this.district = district;
        this.state_name = state_name;
        this.bank_name = bank_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getBank_id() {
        return bank_id;
    }

    public void setBank_id(String bank_id) {
        this.bank_id = bank_id;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }
}
