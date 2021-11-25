package model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import java.io.File;
import java.io.Serializable;
import java.util.List;

    @XmlRootElement(name = "officership")
    @XmlAccessorType(XmlAccessType.FIELD)
    public class OfficershipModel implements Serializable {

        private static final long serialVersionUID = 1L;

        private Integer idOfficership;
        private String firstName;
        private String lastName;
        private Integer age;
        private String rankk;
        private String gender;


        public OfficershipModel() {
            super();
        }

        public OfficershipModel(int idOfficership, String firstName, String lastNameName, int age, String rankk, String gender) {
            super();
            this.idOfficership = idOfficership;
            this.firstName = firstName;
            this.lastName = lastNameName;
            this.age = age;
            this.rankk = rankk;
            this.gender = gender;
        }

        public Integer getIdOfficership() {
            return idOfficership;
        }

        public void setIdOfficership(Integer idOfficership) {
            this.idOfficership = idOfficership;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getRankk() {
            return rankk;
        }

        public void setRankk(String rankk) {
            this.rankk = rankk;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "OfficershipModel{" +
                    "idOfficership=" + idOfficership +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", rankk='" + rankk + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }

           public static void Jaxbparser(OfficershipModel officership)
            {
                try {
                    JAXBContext jaxbContext = JAXBContext.newInstance(OfficershipModel.class);
                    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

                    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);


                    jaxbMarshaller.marshal(officership, new File("src/main/resources/officership.xml"));

                } catch (JAXBException e) {
                    e.printStackTrace();
                }
            }
        }

