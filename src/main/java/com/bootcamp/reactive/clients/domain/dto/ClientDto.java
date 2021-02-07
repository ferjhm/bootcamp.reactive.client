package com.bootcamp.reactive.clients.domain.dto;

import com.bootcamp.reactive.clients.persistence.entities.ClientAddress;

public class ClientDto {


    private String _id;
    private String dni;
    private String name;
    private Integer old;
    private String sex;

    private ClientAddress address;

    public ClientDto() {
    }

    public ClientDto(String _id, String dni, String name, Integer old, String sex, ClientAddress address) {
        this._id = _id;
        this.dni = dni;
        this.name = name;
        this.old = old;
        this.sex = sex;
        this.address = address;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOld() {
        return old;
    }

    public void setOld(Integer old) {
        this.old = old;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public ClientAddress getAddress() {
        return address;
    }

    public void setAddress(ClientAddress address) {
        this.address = address;
    }
}
