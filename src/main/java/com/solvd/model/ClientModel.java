package com.solvd.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "client")
@XmlAccessorType(XmlAccessType.FIELD)

public class ClientModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String fName;
    private String lName;
    private String phone;

    @XmlElementWrapper(name = "cities")
    @XmlElement(name = "citi")
    private List<String> cities;

    public ClientModel() { super(); }

    public ClientModel(int id, String fName, String lName, String phone) {
        super();
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    //    @Override
//    public String toString() {
//        return "ClientModel{" +
//                "id=" + id +
//                ", fName='" + fName + '\'' +
//                ", lName='" + lName + '\'' +
//                ", phone='" + phone + '\'' +
//                '}';
//    }
}
