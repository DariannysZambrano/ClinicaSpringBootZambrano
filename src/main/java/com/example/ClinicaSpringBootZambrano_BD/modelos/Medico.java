package com.example.ClinicaSpringBootZambrano_BD.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "Medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer doctorId;
    @Column(length = 50, nullable = false)
    private String doctorName;
    @Column(nullable = false)
    private Integer age;
    @Column(nullable = false)
    private Integer documentNumber;
    @Column(length = 80, nullable = false)
    private String specialty;
    @Column(nullable = false)
    private Integer yearsOfExperience;
    @Column(nullable = false)
    private Integer phoneNumber;
    @Column(length = 80, nullable = false)
    private String email;
    @Column(length = 80, nullable = false)
    private String address;
    @Column(nullable = false)
    private boolean active;

    @OneToOne
    @JoinColumn(name = "fk_TarjetaProfesional")
    private TarjetaProfesional tarjetaProfesional;

    public Medico() {
    }

    public Medico(Integer doctorId, String doctorName, Integer age, Integer documentNumber, String specialty, Integer yearsOfExperience, Integer phoneNumber, String email, String address, boolean active, TarjetaProfesional tarjetaProfesional) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.age = age;
        this.documentNumber = documentNumber;
        this.specialty = specialty;
        this.yearsOfExperience = yearsOfExperience;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.active = active;
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(Integer documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public TarjetaProfesional getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(TarjetaProfesional tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }
}
