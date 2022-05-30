package com.solvd.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "client")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClientsModel implements Serializable {
    private int id;
    private String firstName;
    private String secondName;
    private String eMail;
    private String numberOfPhone;
    private int onlineShopesId;

    public ClientsModel(){super();}

    public ClientsModel(int id, String firstName, String secondName,
                        String eMail, String numberOfPhone, int onlineShopesId) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.eMail = eMail;
        this.numberOfPhone = numberOfPhone;
        this.onlineShopesId = onlineShopesId;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String geteMail() {
        return eMail;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }

    public int getOnlineShopesId() {
        return onlineShopesId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setNumberOfPhone(String numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    public void setOnlineShopesId(int onlineShopesId) {
        this.onlineShopesId = onlineShopesId;
    }

    @Override
    public String toString() {
        return "ClientsModel{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", numberOfPhone='" + numberOfPhone + '\'' +
                ", onlineShopesId=" + onlineShopesId +
                '}';
    }
}
