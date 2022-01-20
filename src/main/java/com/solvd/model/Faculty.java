package com.solvd.model;

import com.solvd.util.enums.Acreditation;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class Faculty implements Serializable {
    private int id;
    private String name;
    private String location;
    private int university_id;
    private Acreditation acreditation;

    public Faculty() {
        super();
    }

    public Faculty(int id, String name, String location, int university_id, Acreditation acreditation) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.university_id = university_id;
        this.acreditation = acreditation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getUniversity_id() {
        return university_id;
    }

    public Acreditation getAcreditation() {
        return acreditation;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public void setLocation(String location) {
        this.location = location;
    }

    @XmlElement
    public void setUniversity_id(int university_id) {
        this.university_id = university_id;
    }

    @XmlElement
    public void setAcreditation(Acreditation acreditation) {
        this.acreditation = acreditation;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", university_id=" + university_id +
                ", acreditation=" + acreditation.getValue() +
                '}';
    }
}
