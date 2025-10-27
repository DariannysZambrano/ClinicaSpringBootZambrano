package com.example.ClinicaSpringBootZambrano_BD.modelos;

import jakarta.persistence.*;

import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDateTime;

@Entity
@Table(name = "Patient")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientId;
    @Column(length = 50, nullable = false)
    private String fullName;
    @Column(length = 50, nullable = false)
    private String documentType;
    @Column( nullable = false)
    private Integer documentNumber;
    @Column(nullable = false)
    private Integer age;
    @Column(length = 50, nullable = false)
    private String gender;
    @Column(nullable = false)
    private Integer phoneNumber;
    @Column(length = 80, nullable = false)
    private String address;
    @Column(length = 80, nullable = false)
    private String email;
    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @OneToOne
    @JoinColumn(name = "fk_HistoriaClinica" )
    private HistoriaClinica historiaclinica;

    public Paciente() {
    }

    public Paciente(Integer patientId, String fullName, String documentType, Integer documentNumber, Integer age, String gender, Integer phoneNumber, String address, String email, LocalDateTime registrationDate, HistoriaClinica historiaclinica) {
        this.patientId = patientId;
        this.fullName = fullName;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.registrationDate = registrationDate;
        this.historiaclinica = historiaclinica;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public Integer getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(Integer documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public HistoriaClinica getHistoriaclinica() {
        return historiaclinica;
    }

    public void setHistoriaclinica(HistoriaClinica historiaclinica) {
        this.historiaclinica = historiaclinica;
    }
}
