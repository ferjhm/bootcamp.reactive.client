package com.bootcamp.reactive.clients.persistence.entities;

public class ClientAddress {

    private String district;
    private String avenue;
    private Integer number;

    public ClientAddress() {
    }

    public ClientAddress(String district, String avenue, Integer number) {
        this.district = district;
        this.avenue = avenue;
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
