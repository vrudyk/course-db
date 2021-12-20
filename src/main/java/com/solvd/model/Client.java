package com.solvd.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@XmlRootElement
public class Client implements Serializable {

   private static final long serialVersionUID = 1L;

   private Integer idClient;
   private String Name;
   private Integer Age;
   private Integer Passport_Passport_number;
   private Integer Passport_Identification_Code;

   public Client() {
       super();
   }

    public Client(Integer idClient, String name, Integer age, Integer passport_Passport_number,
                  Integer passport_Identification_Code) {
        super();
        this.idClient = idClient;
        this.Name = name;
        this.Age = age;
        this.Passport_Passport_number = passport_Passport_number;
        this.Passport_Identification_Code = passport_Identification_Code;
    }
    @XmlAttribute
    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }
    @XmlElement
    public void setName(String name) {
        Name = name;
    }
    @XmlElement
    public void setAge(Integer age) {
        Age = age;
    }
    @XmlElement
    public void setPassport_Passport_number(Integer passport_Passport_number) {
        Passport_Passport_number = passport_Passport_number;
    }
    @XmlElement
    public void setPassport_Identification_Code(Integer passport_Identification_Code) {
        Passport_Identification_Code = passport_Identification_Code;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public String getName() {
        return Name;
    }

    public Integer getAge() {
        return Age;
    }

    public Integer getPassport_Passport_number() {
        return Passport_Passport_number;
    }

    public Integer getPassport_Identification_Code() {
        return Passport_Identification_Code;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Passport_Passport_number=" + Passport_Passport_number +
                ", Passport_Identification_Code=" + Passport_Identification_Code +
                '}';
    }
}
