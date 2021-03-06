package com.bootcamp.reactive.clients.persistence.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Setter
//@Getter

@Document(value = "clients")
public class Client {

    @Id
    private String _id;
    private String dni;
    private String name;


    @Field(name = "edad")
    private Integer old;

    @Field(name = "sexo")
    private String sex;

    @Field(name = "ClientAdress")
    private ClientAddress address;


    public Client() {
    }

    public Client(String _id, String dni, String name, Integer old, String sex, ClientAddress address) {
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
